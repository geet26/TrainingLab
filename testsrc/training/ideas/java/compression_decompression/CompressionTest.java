package training.ideas.java.compression_decompression;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by idngeb on 2014-08-09.
 */
public class CompressionTest {
    @Test
    public void  given_a_String_Containing_Numbers_find_compression(){
        String str = "3GG2BBBBXYZZZXXBNNN";
        Assert.assertEquals("3G22B4XYZ3X2BN3", Compression.compression(str));
    }
    @Test
    public void  given_a_String_Not_Starting_With_no_find_compression(){
        String str = "GBBBBXYZZZXXBNNN";
        Assert.assertEquals("GB4XYZ3X2BN3",Compression.compression(str));
    }
    @Test
    public void  given_a_String_Not_Starting_With_no_find_compression_test(){
        String str = "AAABBC";
        Assert.assertEquals("A3B2C",Compression.compression(str));
    }
    @Test
    public void  given_a_EmptyString_find_decompression(){
        String str = "A11BC2F";
        Assert.assertEquals("AAAAAAAAAAABCCF",Compression.decompression(str));
       // String str1= "A3";
      // Assert.assertEquals("AAA",Compression.decompression(str1));
    }

}
