import java.util.Scanner;

public class CalculateExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = calculateTotalExpenses(quantity, pricePerItem);

        System.out.println("Total expenses: $" + totalExpenses);

        scanner.close();
    }

    public static double calculateTotalExpenses(int quantity, double pricePerItem) {
        double totalExpenses;

        if (quantity > 50) {
            totalExpenses = quantity * pricePerItem * 0.9;
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses = quantity * pricePerItem * 0.95;
        } else {
            totalExpenses = quantity * pricePerItem;
        }

        return totalExpenses;
    }
}
