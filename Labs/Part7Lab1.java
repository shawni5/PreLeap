import java.util.Scanner;

public class Part7Lab1 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Quit");

        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Option 1.");
                break;
            case 2:
                System.out.println("You selected Option 2.");
                break;
            case 3:
                System.out.println("You selected Option 3.");
                break;
            case 4:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invaid choice");
        }

        input.close();
    }   
}