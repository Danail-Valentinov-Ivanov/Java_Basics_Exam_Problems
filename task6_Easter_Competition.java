package exam_preparation;

import java.util.Scanner;

public class task6_Easter_Competition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numEasterCake = Integer.parseInt(scan.nextLine());
        int maxGrade = 0;
        String winner = "";

        for (int i = 1; i <= numEasterCake; i++) {
            String nameChef = scan.nextLine();
            String input = scan.nextLine();
            int sumGrade = 0;

            while (!input.equals("Stop")) {
                int grade = Integer.parseInt(input);
                sumGrade += grade;
                input = scan.nextLine();
            }
            System.out.printf("%s has %d points.\n", nameChef, sumGrade);
            if (sumGrade > maxGrade) {
                maxGrade = sumGrade;
                winner = nameChef;
                System.out.printf("%s is the new number 1!\n", nameChef);
            }
        }
        System.out.printf("%s won competition with %d points!", winner, maxGrade);
    }
}
