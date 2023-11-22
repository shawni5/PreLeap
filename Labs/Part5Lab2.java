import java.util.Scanner;

public class Part5Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        System.out.print("Enter the fourth number: ");
        num4 = input.nextInt();

        System.out.print("Enter the fifth number: ");
        num5 = input.nextInt();

        double average = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("The average of the five numbers is: " + average);

        input.close();
    }
}