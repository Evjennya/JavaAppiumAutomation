import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber(){
        int expected = 14;
        MainClass number = new MainClass();
        Assert.assertTrue("LocalNumber != 14", expected == number.getLocalNumber());
    }

}
