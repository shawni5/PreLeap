import java.util.Scanner;

public class Part5Lab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        int age = 0;
        String why = "";

        System.out.print("Enter your name: ");
        String word = input.next();

        System.out.print("Enter your age: ");
        int number = input.nextInt();
        input.nextLine();

        System.out.print("Enter why you want to learn code: ");
        String sentence = input.nextLine();
        
        System.out.println("Name: " + word);
        System.out.println("Enter your age: " + number);
        System.out.println("Why you want to learn code: " + sentence);

        input.close();
    }
}