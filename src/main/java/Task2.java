public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 10;
            int[] array = new int[10];
            double operationResult = Double.parseDouble(String.valueOf(array[15])) / Double.parseDouble(String.valueOf(d));
            System.out.println("operationResult = " + operationResult);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
