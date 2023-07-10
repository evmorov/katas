import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  // assertArrayEquals
  // assertIterableEquals
  @Test
  void correct() {
    Solution solution = new Solution();
    int expected = 4;
    int actual = solution.solution(1, 3);
    assertEquals(expected, actual);
  }

  @Test
  void mistake() {
    Solution solution = new Solution();
    int expected = 5;
    int actual = solution.solution(1, 3);
    assertEquals(expected, actual);
  }
}
