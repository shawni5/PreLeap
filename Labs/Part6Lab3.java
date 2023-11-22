import java.util.Scanner;

public class Part6Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int comparisionNumber = 50;

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number > comparisionNumber) {
            System.out.println("Your number is greater than 50.");
        } else if (number < comparisionNumber) {
            System.out.println("Your number is less than 50.");
        } else {
            System.out.println("Your number is equal to 50.");
        }
        input.close();
    }

}