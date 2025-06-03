import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
               System.out.println(calc(input));
    }

    public static String calc(String input) {
        try {
            if (!input.matches("^\\s*\\d+\\s+[+\\-*/]\\s+\\d+\\s*$")) {
                throw new IllegalArgumentException();
            }

            String[] parts = input.trim().split("\\s+");
            if (parts.length != 3) throw new IllegalArgumentException();

            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[2]);
            String w = parts[1];

            if (a < 1 || a > 10 || b < 1 || b > 10) {
                throw new IllegalArgumentException();
            }

            int result = switch (w) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> throw new IllegalArgumentException();
            };
            return Integer.toString(result);

        } catch (Exception e) {
            return "throws Exception";

        }
    }
}
