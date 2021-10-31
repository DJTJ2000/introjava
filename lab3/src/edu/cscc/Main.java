package edu.cscc;
import java.util.Scanner;

// Tyler Joswick. This makes a report for the average price of items with a cost of $100.00 entered by user
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String productName;
        int count;
        double productCost, total, average;

        do {
            count = 0;
            total = 0;
            System.out.println("Products that cost $100 or more");
            System.out.print("Enter the product ordered - type 'stop' to end: ");
            productName = input.nextLine();

            while (!"stop".equalsIgnoreCase(productName)) {
                System.out.print("Enter the cost of the product ordered: ");
                productCost = input.nextDouble();
                input.nextLine(); // Consume newline
                if (productCost >= 100) {
                    total = total + productCost;
                    count = count + 1;
                }
                System.out.print("Enter the product ordered - type 'stop' to end: ");
                productName = input.nextLine();            }
        } while (!"stop".equalsIgnoreCase(productName));
        System.out.println("There were " + count + " item(s) that had a cost of $100.00 or more" );
        if (count > 0) {
            average = total / count;
            System.out.println("The average price of items with a cost of $100.00 or more is $"+ average);
        }
        System.out.println("End of report");
    }
}

