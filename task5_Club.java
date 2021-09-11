package exam_preparation;

import java.util.Scanner;

public class task5_Club {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double wishSum = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        double currentSum = 0;

        while (!input.equals("Party!")) {
            String nameKokteil = input;
            int lengthKokteil = nameKokteil.length();
            int numKokteilsForOrder = Integer.parseInt(scan.nextLine());
            double priceKokteil = lengthKokteil * numKokteilsForOrder;
            if (priceKokteil % 2 == 1) {
                priceKokteil = priceKokteil * 0.75;
            }
            currentSum = currentSum + priceKokteil;
            if (currentSum >= wishSum) {
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("Party!")) {
            System.out.printf("We need %.2f leva more.\n", Math.abs(currentSum - wishSum));
            System.out.printf("Club income - %.2f leva.", currentSum);
        } else if (currentSum >= wishSum) {
            System.out.printf("Target acquired.\n");
            System.out.printf("Club income - %.2f leva.", currentSum);
        }
    }
}
