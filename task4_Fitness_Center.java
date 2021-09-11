package exam_preparation;

import java.util.Scanner;

public class task4_Fitness_Center {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numUsers = Integer.parseInt(scan.nextLine());
        int countBack = 0;
        int countChest = 0;
        int countLegs = 0;
        int countAbs = 0;
        int countProteinShake = 0;
        int countProteinBar = 0;

        for (int i = 1; i <= numUsers; i++) {
            String kindWork = scan.nextLine();
            if (kindWork.equals("Back")) {
                countBack++;
            } else if (kindWork.equals("Chest")) {
                countChest++;
            } else if (kindWork.equals("Legs")) {
                countLegs++;
            } else if (kindWork.equals("Abs")) {
                countAbs++;
            } else if (kindWork.equals("Protein shake")) {
                countProteinShake++;
            } else if (kindWork.equals("Protein bar")) {
                countProteinBar++;
            }

        }
        int countWork = countAbs + countBack + countLegs + countChest;
        int countBar = countProteinBar + countProteinShake;
        double percentWorks = (countWork * 1.0 / numUsers) * 100;
        double percentBar = (countBar * 1.0 / numUsers) * 100;

        System.out.printf("%d - back\n", countBack);
        System.out.printf("%d - chest\n", countChest);
        System.out.printf("%d - legs\n", countLegs);
        System.out.printf("%d - abs\n", countAbs);
        System.out.printf("%d - protein shake\n", countProteinShake);
        System.out.printf("%d - protein bar\n", countProteinBar);

        System.out.printf("%.2f%% - work out\n", percentWorks);
        System.out.printf("%.2f%% - protein", percentBar);
    }
}
