package exam_preparation;

import java.util.Scanner;

public class task1_Pool_Day {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numPeople = Integer.parseInt(scan.nextLine());
        double taxEntrance = Double.parseDouble(scan.nextLine());
        double priceLounge = Double.parseDouble(scan.nextLine());
        double priceUmbrella = Double.parseDouble(scan.nextLine());

        double allEntrance = numPeople * taxEntrance;
        double numLounge = Math.ceil(numPeople * 0.75);
        double numUmbrella = Math.ceil(numPeople * 0.5);
        double priceAllLounge = numLounge * priceLounge;
        double priceAllUmbrella = numUmbrella * priceUmbrella;
        double totalPrice = allEntrance + priceAllLounge + priceAllUmbrella;
        System.out.printf("%.2f lv.", totalPrice);
    }
}
