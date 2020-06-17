import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {

        int userInput;
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInput = keybd.nextInt();
        for ( ;userInput >= 1; userInput--) {
            System.out.println(userInput);
        }
    }
}
