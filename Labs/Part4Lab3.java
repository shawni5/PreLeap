import java.util.Random;

public class Part4Lab3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(100) + 1, num2 = rand.nextInt(100) + 1, sum = num1 + num2;
        System.out.println("Random number 1: " + num1);
        System.out.println("Random number 2: " + num2);
        System.out.println("Sum: " + sum);
    }
}