import java.util.Scanner;

public class Part9Lab3 {
    public static void sayHello(){
        System.out.println("Hello!");
    }

    public static void sayGoodbye(){
        System.out.println("Goodbye!");
    }

    public static void displayMenu(){
        System.out.println("Menu:");
        System.out.println("1. Say Hello");
        System.out.println("2. Say Goodbye");
        System.out.println("3. Exit");
    }   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while(choice != 3){
            
            displayMenu();
            System.out.print("Make your menu selection (1, 2 or 3).");
            choice = input.nextInt();

            if (choice == 1) {
                sayHello();
                continue;
            } 
            else if (choice == 2) {
                sayGoodbye();
                continue;
            }

        } input.close();
    }
    
}