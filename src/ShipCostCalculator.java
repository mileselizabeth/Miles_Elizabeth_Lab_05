import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the price of your item?");
        double itemPrice = in.nextDouble();
        double shippingCost;
        double totalCost;

        if (itemPrice < 100) {
            shippingCost = itemPrice * .02;
            totalCost = itemPrice + shippingCost;
            System.out.println("Your shipping cost is " + shippingCost + ", and your total cost is " + totalCost);
        } else if (itemPrice >= 100) {
            shippingCost = itemPrice * 0;
            totalCost = itemPrice + shippingCost;
            System.out.println("Your shipping cost is " + shippingCost + ", and your total cost is " + totalCost);
        }
    }
}