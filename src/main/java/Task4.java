import java.util.Scanner;

public class Task4 {
    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getString());
    }

    public static String getString() {
        while (true) {
            try {
                return inputString();
            } catch (Throwable e) {
                System.out.println(e);
            }
        }
    }

    private static String inputString() {
        System.out.print("Input string: ");
        String string = scanner.nextLine();
        if (string == null || string.isEmpty()) {
            throw new RuntimeException("String can't be empty. Please try again.");
        }
        return string;
    }
}
