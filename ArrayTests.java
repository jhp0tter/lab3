import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
    @Test
    public void testReverseInPlace() {
        int[] input = {3};
        ArrayExamples.reverseInPlace(input);
        assertArrayEquals(new int[]{3}, input);
    }

    @Test
    public void testReversed() {
        int[] input = {};
        int[] output = ArrayExamples.reversed(input);
        assertArrayEquals(new int[]{}, output);
    }

    @Test
    public void testReverseInPlace2() {
        int[] input = {1, 2, 3};
        ArrayExamples.reverseInPlace(input);
        assertArrayEquals(new int[]{3, 2, 1}, input);
    }

    @Test
    public void testReversed2() {
        int[] input = {1, 2, 3};
        int[] output = ArrayExamples.reversed(input);
        assertArrayEquals(new int[]{3, 2, 1}, output);
    }
}
