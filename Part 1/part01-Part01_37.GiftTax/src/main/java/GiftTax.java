
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tax = 0;
        System.out.print("Value of the gift?");
        int valueGift = Integer.valueOf(scanner.nextLine());
        
        if (valueGift < 5000) {
            System.out.println("No tax!");
        }else if ((valueGift >= 5000) && (valueGift < 25000)) {
            tax = (100 + (valueGift - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        }else if((valueGift >= 25000) && (valueGift < 55000)) {
            tax = (1700 + (valueGift - 25000) * 0.1);
            System.out.println("Tax: " + tax);
        }else if((valueGift >= 55000) && (valueGift < 200000)) {
            tax = (4700 + (valueGift - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        }else if((valueGift >= 200000) && (valueGift < 1000000)) {
            tax = (22100 + (valueGift - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        }else {
            tax = (142100 +(valueGift - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }
        
        
    }
}