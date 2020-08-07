import com.javalearning.CustomMath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {

    @Test
    public void checkNegativeAddition(){

        int expected =-5;
        CustomMath math = new CustomMath();
        int actual = math.add(-2,-3);
        assertEquals(expected,actual);
    }
}
