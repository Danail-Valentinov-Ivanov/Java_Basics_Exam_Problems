package exam_preparation;

import java.util.Scanner;

public class task2_Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int numVideoCards = Integer.parseInt(scan.nextLine());
        int numCpu = Integer.parseInt(scan.nextLine());
        int numRam = Integer.parseInt(scan.nextLine());

        double priceVideoCards = 250;
        double priceCpu = numVideoCards * 250 * 0.35;
        double priceRam = numVideoCards * 250 * 0.1;
        double price;

        if (numVideoCards > numCpu) {
            price = ((priceVideoCards * numVideoCards) + (priceCpu * numCpu) + (priceRam * numRam)) * 0.85;
        } else {
            price = ((priceVideoCards * numVideoCards) + (priceCpu * numCpu) + (priceRam * numRam));
        }
        if (budget >= price) {
            System.out.printf("You have %.2f leva left!", Math.abs(budget - price));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - price));
        }
    }
}
