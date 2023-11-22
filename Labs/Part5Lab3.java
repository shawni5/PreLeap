import java.util.Scanner;

public class Part5Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = 0, num2 = 0, result;

        System.out.print("Enter a number: ");
        num1 = input.nextInt();

        System.out.print("Enter another number: ");
        num2 = input.nextInt();

        input.nextLine();

        System.out.print("Choose an operation /(add or subtract): ");
        String operation = input.nextLine();
        if (operation.equals("add")) {
            result = num1 + num2;
        } else if (operation.equals("subtract")) {
            result = num1 - num2;
        } else {
            System.out.println("Invalid operation. Please enter 'add' or 'subtract'.");
            return;
        }

        System.out.println("Result: " + result);

        input.close();
    }
}