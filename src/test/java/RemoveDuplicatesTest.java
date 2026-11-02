import com.gamesgear.RemoveDuplicates;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testStandardDuplicates() {
        int[] input = {1, 1, 2, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, RemoveDuplicates.compressNumbers(input));
    }
    @Test
    public void testAllElementsAreTheSame() {
        int[] input = {5, 5, 5, 5};
        int[] expected = {5};
        assertArrayEquals(expected, RemoveDuplicates.compressNumbers(input));
    }
    @Test
    public void testNonConsecutiveDuplicates() {
        int[] input = {0, 0, 1, 0, 0};
        int[] expected = {0, 1, 0};
        assertArrayEquals(expected, RemoveDuplicates.compressNumbers(input) );
    }
    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, RemoveDuplicates.compressNumbers(input));
    }
    @Test
    public void testNoDuplicates(){
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, RemoveDuplicates.compressNumbers(input));
    }
}