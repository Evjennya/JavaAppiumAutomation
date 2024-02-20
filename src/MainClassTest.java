import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassString(){
        MainClass classString = new MainClass();
        Assert.assertTrue("Class_string doesn't contain substrings hello or Hello", classString.getClassString().contains("Hello") | classString.getClassString().contains("hello") );
    }

}
