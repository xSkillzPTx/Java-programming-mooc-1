
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.print("\nGive the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        if (num1>num2) {
            System.out.print("\nGreater number is: " +num1);
        } else if (num1<num2) {
            System.out.print("\nGreater number is " +num2);
        } else {
            System.out.print("\nThe number are equal!");
        }
    }
}
