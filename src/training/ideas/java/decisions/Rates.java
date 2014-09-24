package training.ideas.java.decisions;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by idngeb on 2014-09-24.
 */
public class Rates {
    private final int propertyID;
    List<Rate> rateList = null;

    public Rates(int propertyID) throws SQLException, ClassNotFoundException {
        this.propertyID = propertyID;
        loadRates();
    }

    private void loadRates() throws SQLException, ClassNotFoundException {
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT shortname,startDate,endDate,sunday FROM propertyratedetails1 JOIN propertyRatebands1 USING (propertyRateID) WHERE propertyID = "+propertyID);
        List<Season> seasonList = new ArrayList<Season>();
        rateList = new ArrayList<Rate>();
        while (rs.next()){
            Season season = new Season(new Date(rs.getDate("startDate").getTime()),new Date(rs.getDate("endDate").getTime()),rs.getDouble("sunday"));
            seasonList.add(season);
            Rate rate = new Rate(rs.getString("shortname"),seasonList);
            rateList.add(rate);
        }
        rs.close();
        stmt.close();
        con.close();
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/wyndham1518_08db","root","admin");
    }

    public List<Rate> getRates() {
        return rateList;
    }
}
