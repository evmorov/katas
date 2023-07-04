import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  @Test
  void correct() {
    Solution solution = new Solution();
    assertEquals(4, solution.solution(1, 3));
  }

  @Test
  void mistake() {
    Solution solution = new Solution();
    assertEquals(5, solution.solution(1, 3));
  }

  @Test
  void correctArray() {
    assertArrayEquals(new int[]{1, 3, 2}, new int[]{1, 3, 2});
  }

  @Test
  void mistakeArray() {
    assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 3, 2});
  }
}
