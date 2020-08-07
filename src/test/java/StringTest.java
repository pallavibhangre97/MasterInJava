import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringTest {

    @Test
    public void testString1(){
        String s1 = "pallavi";
        String s2 = "SACHIN";
        String s3 = "SACHIN";

        String s4 = new String("SACHIN");
        assertEquals(s1,s2);  // f
        assertEquals(s2,s3);  // t
        assertEquals(s3,s4);  // t //f
    }

}
