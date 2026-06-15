import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testCalculateCircleArea() {
        double radius = 5.0;
        double expectedArea = Math.PI * radius * radius;
        assertEquals(expectedArea, MathUtils.calculateCircleArea(radius), 0.0001);
    }

    @Test
    public void testCalculateDistance() {
        double x1 = 1.0, y1 = 1.0, x2 = 4.0, y2 = 5.0;
        double expectedDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        assertEquals(expectedDistance, MathUtils.calculateDistance(x1, y1, x2, y2), 0.0001);
    }

    @Test
    public void testLerp() {
        double start = 0.0;
        double end = 10.0;
        double t = 0.5;
        double expected = 5.0;
        assertEquals(expected, MathUtils.lerp(start, end, t), 0.0001);
    }
}