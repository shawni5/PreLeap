import java.lang.Math;
public class Part4Lab2 {
    public static void main(String[] args) {
        double side1 = 8, side2 = 6;
        double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
        System.out.println("The length of the hypotenuse is " + hypotenuse + " for a triangle with side lengths of " + side1 + " and " + side2 + ".");
    }
}