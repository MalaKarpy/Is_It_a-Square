import org.junit.*;
import static org.junit.Assert.*;

public class RectangleUnitTest {

  @Test
  public void newRectangle_instantiatesCorrectly() {
    Rectangle testRectangle = new Rectangle(2, 2);
    assertEquals(true, testRectangle instanceof Rectangle);
  }
}
