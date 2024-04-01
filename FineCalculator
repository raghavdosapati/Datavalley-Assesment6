import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of days the book is late: ");
        int daysLate = scanner.nextInt();
        
        if (daysLate <= 7) {
            System.out.println("Fine: 50 paise");
        } else if (daysLate <= 14) {
            System.out.println("Fine: 1 rupee");
        } else if (daysLate <= 21) {
            System.out.println("Fine: 5 rupees");
        } else {
            System.out.println("Membership canceled due to exceeding 21 days late.");
        }
        
        scanner.close();
    }
}
