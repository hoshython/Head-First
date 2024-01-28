package ch10;

public class Duck {
    private static int duckCount;

    public Duck() {
        duckCount++;
    }

    public int getDuckCount() {
        return duckCount;
    }

    public static String blue() {
        return "Blue";
    }

    public void printBlue() {
        System.out.println(blue());
    }
}
