package ex4_For_Loop;

import java.util.Scanner;

public class exam_task_Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameActor = scan.nextLine();
        double scoresForActor = Double.parseDouble(scan.nextLine());
        int numJudges = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= numJudges; i++) {
            String nameJudge = scan.nextLine();
            double scopesOfJudge = Double.parseDouble(scan.nextLine());
            int length = nameJudge.length();
            double scoresFromJudge = length * (scopesOfJudge / 2);
            scoresForActor += scoresFromJudge;
            if (scoresForActor > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!"
                        , nameActor, scoresForActor);
                break;
            }
        }
        if (scoresForActor <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, Math.abs(scoresForActor - 1250.5));
        }
    }
}
