class Test {
  public static void main(String[] args) {
    Solution s = new Solution();

    expected(4);
    actual(s.solution(1, 3));

    expected("4");
    actual(s.solution(1, 4));
  }

  private static <T> void expected(T s) {
    System.out.println("Expected: " + s);
  }

  private static <T> void actual(T s) {
    System.out.println("  Actual: " + s);
    System.out.println();
  }
}
