import java.util.Scanner;

public class Part6Lab4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String sentence1 = input.nextLine();

        System.out.print("Enter another word or phrase: ");
        String sentence2 = input.nextLine();

        if(sentence1.compareTo(sentence2) < 0) {
            System.out.println("The first word/phrase comes before the second word/phrase.");
        } else if(sentence1.compareTo(sentence2) > 0) {
            System.out.println("The first word/phrase comes after the second word/phrase.");
        } else {
            System.out.println("The two words/phrases are equal.");
        }
    }
}