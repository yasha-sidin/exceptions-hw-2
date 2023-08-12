import java.util.Scanner;

public class Task1 {
    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getFloat());
    }

    public static float getFloat() {
        while (true) {
            try {
                return inputFloat();
            } catch (Exception ignored) {

            }
        }
    }

    private static float inputFloat() {
        System.out.print("Input float: ");
        String number = scanner.nextLine();
        return Float.parseFloat(number);
    }
}
