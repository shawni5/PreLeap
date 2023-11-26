import java.util.Scanner;

public class Part8Lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int n1, n2, n3, n4, n5;

        do {
            System.out.print("Enter the first number: ");
            n1 = input.nextInt();
            System.out.print("Enter the second number: ");
            n2 = input.nextInt();
            System.out.print("Enter the third number: ");
            n3 = input.nextInt();
            System.out.print("Enter the fourth number: ");
            n4 = input.nextInt();
            System.out.print("Enter the last number: ");
            n5 = input.nextInt();
            sum += n1 + n2 + n3 + n4 + n5;
        } while (n5 == 0);

        System.out.println("Sum of the numbers " + sum);
        input.close();
    }
}