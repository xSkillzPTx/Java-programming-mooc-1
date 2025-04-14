
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        if (first.equals(second)) {
            System.out.println("Same");
        }  else {
            System.out.println("Different");
        }
    }
}
