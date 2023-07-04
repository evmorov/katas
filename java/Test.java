import java.util.Arrays;

class Test {
  public static void main(String[] args) {
    ParkingSystem p = new ParkingSystem(1, 1, 0);
    System.out.println(
      p.addCar(1)
    );
    System.out.println(
      p.addCar(2)
    );
    System.out.println(
      p.addCar(3)
    );
    System.out.println(
      p.addCar(1)
    );
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
