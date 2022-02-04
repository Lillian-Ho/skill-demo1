import static org.junit.Assert.*;
import org.junit.*;
//imports needed to make the junit test run
public class SkillDemoTest {
    @Test
    public void multiply() {
        assertEquals(6, SkillDemo.multiply(3, 2)); //by changing the expected output to 6, the test will now pass since it matches  the output of SkillDemo.multiply(3, 2)
    }
}
