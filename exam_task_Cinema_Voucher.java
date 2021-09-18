package ex5_While_Loop;

import java.util.Scanner;

public class exam_task_Cinema_Voucher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int priceVoucher = Integer.parseInt(scan.nextLine());
        String purchase = scan.nextLine();
        int countFilm = 0;
        int countOtherPurchases = 0;
        int sumAll = priceVoucher;

        while (!purchase.equals("End")) {
            int length = purchase.length();
            if (length > 8) {
                int numberFirstSymbolFilm = purchase.charAt(0);
                int numberSecondSymbolFilm = purchase.charAt(1);
                if ((numberFirstSymbolFilm + numberSecondSymbolFilm) <= sumAll) {
                    sumAll -= (numberFirstSymbolFilm + numberSecondSymbolFilm);
                } else {
                    break;
                }
                countFilm++;
            } else {
                int numberFirstSymbolOtherPurchases = purchase.charAt(0);
                if (numberFirstSymbolOtherPurchases <= sumAll) {
                    sumAll -= numberFirstSymbolOtherPurchases;
                } else {
                    break;
                }
                countOtherPurchases++;
            }
            purchase = scan.nextLine();
        }
        System.out.println(countFilm);
        System.out.println(countOtherPurchases);
    }
}
