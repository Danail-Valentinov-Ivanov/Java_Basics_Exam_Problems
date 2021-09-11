package exam_preparation;

import java.util.Scanner;

public class task3_Travel_Agency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        String kindPackage = scan.nextLine();
        String vipDiscount = scan.nextLine();
        int numDays = Integer.parseInt(scan.nextLine());
        double priceAllDays = 0;
        boolean flag = false;

        if (city.equals("Bansko")) {
            if (kindPackage.equals("withEquipment")) {
                if (numDays < 1) {
                    flag = true;
                    System.out.println("Days must be positive number!");
                } else if (numDays <= 7) {
                    priceAllDays = 100 * numDays;
                } else {
                    priceAllDays = 100 * (numDays - 1);
                }
                if (vipDiscount.equals("yes")) {
                    priceAllDays = priceAllDays * 0.9;
                }
            } else if (kindPackage.equals("noEquipment")) {
                if (numDays < 1) {
                    flag = true;
                    System.out.println("Days must be positive number!");
                } else if (numDays <= 7) {
                    priceAllDays = 80 * numDays;
                } else {
                    priceAllDays = 80 * (numDays - 1);
                }
                if (vipDiscount.equals("yes")) {
                    priceAllDays = priceAllDays * 0.95;
                }
            } else {
                flag = true;
                System.out.println("Invalid input!");
            }
        } else if (city.equals("Borovets")) {
            if (kindPackage.equals("withEquipment")) {
                if (numDays < 1) {
                    flag = true;
                    System.out.println("Days must be positive number!");
                } else if (numDays <= 7) {
                    priceAllDays = 100 * numDays;
                } else {
                    priceAllDays = 100 * (numDays - 1);
                }
                if (vipDiscount.equals("yes")) {
                    priceAllDays = priceAllDays * 0.9;
                }
            } else if (kindPackage.equals("noEquipment")) {
                if (numDays < 1) {
                    flag = true;
                    System.out.println("Days must be positive number!");
                } else if (numDays <= 7) {
                    priceAllDays = 80 * numDays;
                } else {
                    priceAllDays = 80 * (numDays - 1);
                }
                if (vipDiscount.equals("yes")) {
                    priceAllDays = priceAllDays * 0.95;
                }
            } else {
                flag = true;
                System.out.println("Invalid input!");
            }
        } else if (city.equals("Varna")) {
            if (kindPackage.equals("withBreakfast")) {
                if (numDays < 1) {
                    flag = true;
                    System.out.println("Days must be positive number!");
                } else if (numDays <= 7) {
                    priceAllDays = 130 * numDays;
                } else {
                    priceAllDays = 130 * (numDays - 1);
                }
                if (vipDiscount.equals("yes")) {
                    priceAllDays = priceAllDays * 0.88;
                }
            } else if (kindPackage.equals("noBreakfast")) {
                if (numDays < 1) {
                    flag = true;
                    System.out.println("Days must be positive number!");
                } else if (numDays <= 7) {
                    priceAllDays = 100 * numDays;
                } else {
                    priceAllDays = 100 * (numDays - 1);
                }
                if (vipDiscount.equals("yes")) {
                    priceAllDays = priceAllDays * 0.93;
                }
            } else {
                flag = true;
                System.out.println("Invalid input!");
            }
        } else if (city.equals("Burgas")) {
            if (kindPackage.equals("withBreakfast")) {
                if (numDays < 1) {
                    flag = true;
                    System.out.println("Days must be positive number!");
                } else if (numDays <= 7) {
                    priceAllDays = 130 * numDays;
                } else {
                    priceAllDays = 130 * (numDays - 1);
                }
                if (vipDiscount.equals("yes")) {
                    priceAllDays = priceAllDays * 0.88;
                }
            } else if (kindPackage.equals("noBreakfast")) {
                if (numDays < 1) {
                    flag = true;
                    System.out.println("Days must be positive number!");
                } else if (numDays <= 7) {
                    priceAllDays = 100 * numDays;
                } else {
                    priceAllDays = 100 * (numDays - 1);
                }
                if (vipDiscount.equals("yes")) {
                    priceAllDays = priceAllDays * 0.93;
                }
            } else {
                flag = true;
                System.out.println("Invalid input!");
            }
        } else {
            flag = true;
            System.out.println("Invalid input!");
        }
        if (!flag) {
            System.out.printf("The price is %.2flv! Have a nice time!", priceAllDays);
        }
    }
}