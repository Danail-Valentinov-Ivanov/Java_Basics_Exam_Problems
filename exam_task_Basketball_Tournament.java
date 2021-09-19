package ex6_Nested_Loops;

import java.util.Scanner;

public class exam_task_Basketball_Tournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameOfTournament = scan.nextLine();
        int countWins = 0;
        int countLost = 0;

        while (!nameOfTournament.equals("End of tournaments")) {
            int numMatches = Integer.parseInt(scan.nextLine());
            int countMatches = 0;
            for (int i = 1; i <= numMatches; i++) {
                int scoresDesiTeam = Integer.parseInt(scan.nextLine());
                int scoreOtherTeam = Integer.parseInt(scan.nextLine());
                countMatches++;
                if (scoresDesiTeam > scoreOtherTeam) {
                    countWins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n"
                            , countMatches, nameOfTournament, Math.abs(scoreOtherTeam - scoresDesiTeam));
                } else if (scoresDesiTeam < scoreOtherTeam) {
                    countLost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n"
                            , countMatches, nameOfTournament, Math.abs(scoreOtherTeam - scoresDesiTeam));
                }
            }
            nameOfTournament = scan.nextLine();
        }
        System.out.printf("%.2f%% matches win\n", (countWins * 1.0) / (countLost + countWins) * 100);
        System.out.printf("%.2f%% matches lost\n", (countLost * 1.0) / (countLost + countWins) * 100);
    }
}
