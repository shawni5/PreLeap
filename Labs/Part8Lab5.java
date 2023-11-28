import java.util.Scanner;

public class Part8Lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {

            System.out.println("Choice 1");
            System.out.println("Choice 2");
            System.out.println("Choice 3");
            System.out.println("Choice 4");
            System.out.println("Choice 5");
            System.out.println("Choice 6-Exit the program");

            System.out.print("Make your selection (1-6): ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("You selected Choice 1.");
                continue;
            }
            if (choice == 2) {
                System.out.println("You selected Choice 2.");
                continue;
            }
            if (choice == 3) {
                System.out.println("You selected Choice 3.");
                continue;
            }
            if (choice == 4) {
                System.out.println("You selected Choice 4.");
                continue;
            }
            if (choice == 5) {
                System.out.println("You selected Choice 5.");
                continue;
            }
            if (choice >= 6 || choice <= 0){
                System.out.println("Goodbye");
                break;
            }
        }
        input.close();
    }
    
}