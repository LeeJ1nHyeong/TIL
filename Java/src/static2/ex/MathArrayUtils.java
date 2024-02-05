package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {

    }

    public static int sum(int[] array) {
        int total = 0;
        for (int a : array) {
            total += a;
        }
        return total;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int minValue = array[0];
        for (int a : array) {
            if (a < minValue) {
                minValue = a;
            }
        }
        return minValue;
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int a : array) {
            if (a > maxValue) {
                maxValue = a;
            }
        }
        return maxValue;
    }
}
