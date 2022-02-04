import static org.junit.Assert.*;
import org.junit.*;
//imports needed to make the junit test run
public class SkillDemoTest {
    @Test
    public void multiply() {
        assertEquals(25, SkillDemo.multiply(3, 2)); //this test will fail! SkillDemo.multiply(3, 2) will return 6, which does not match the expected 25
    }
}
