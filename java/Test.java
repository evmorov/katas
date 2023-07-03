import java.util.Arrays;

class Test {
  public static void main(String[] args) {
    Solution s = new Solution();

    actual(s.solution(1, 3));
    expected(4);

    actual(s.solution(1, 4));
    expected("4");
  }

  private static <T> void actual(T s) {
    System.out.println("  Actual: " + s);
  }

  private static <T> void expected(T s) {
    System.out.println("Expected: " + s);
    System.out.println();
  }

  private static void actual(double[] s) {
    System.out.println("  Actual: " + Arrays.toString(s));
  }

  private static void expected(double[] s) {
    System.out.println("Expected: " + Arrays.toString(s));
    System.out.println();
  }
}
