import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        
        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();
        
        double totalExpenses = quantity * pricePerItem;
        
        if (quantity > 50) {
            totalExpenses *= 0.9; // 10% discount
        } else if (quantity >= 25) {
            totalExpenses *= 0.95; // 5% discount
        }
        
        System.out.println("Total expenses: " + totalExpenses);
        
        scanner.close();
    }
}
