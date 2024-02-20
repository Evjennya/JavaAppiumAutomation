import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber(){
        MainClass classNumber = new MainClass();
        int minExpected = 45;
        Assert.assertTrue("Class_number <= " + minExpected, classNumber.getClassNumber() > minExpected);
    }

}
