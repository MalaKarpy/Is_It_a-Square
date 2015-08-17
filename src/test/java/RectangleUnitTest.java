import org.junit.*;
import static org.junit.Assert.*;

public class RectangleUnitTest {

  @Test
  public void newRectangle_instantiatesCorrectly() {
    Rectangle testRectangle = new Rectangle(2, 2);
    assertEquals(true, testRectangle instanceof Rectangle);
  }

  @Test
  public void isSquare_whenNotASquare_false() {
    Rectangle testRectangle = new Rectangle(2,4);
    assertEquals(false, testRectangle.isSquare());
  }
}
