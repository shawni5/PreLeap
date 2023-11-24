import java.util.Scanner;

public class Part7Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("God has something to say to you.");
        System.out.println("Message 1");
        System.out.println("Message 2");
        System.out.println("Message 3");
        
        System.out.print("Choose a Message (1-3): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("God says, 'I loves you!' John 3:16");
                break;
            case 2:
                System.out.println("God says, 'I have a plan for your life.' Jeremiah 29:11");
                break;
            case 3:
                System.out.println("God says, 'I know the answer to your problem.' Isaiah 55:8-9");
                break;
            default:
                System.out.println("Please try again, you made a choice not listed above. God still wants to speak to you.");
        
        input.close();

        }
    }
}