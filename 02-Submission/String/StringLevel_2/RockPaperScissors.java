package StringLevel_2;
import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {

        int choice = (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    static String findWinner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if (user.equals("Rock") && computer.equals("Scissors"))
            return "User";

        if (user.equals("Paper") && computer.equals("Rock"))
            return "User";

        if (user.equals("Scissors") && computer.equals("Paper"))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println("Enter Rock, Paper or Scissors");

        for (int i = 1; i <= games; i++) {

            System.out.print("Game " + i + ": ");
            String user = sc.next();

            String computer = computerChoice();

            String winner = findWinner(user, computer);

            if (winner.equals("User"))
                userWins++;

            if (winner.equals("Computer"))
                computerWins++;

            System.out.println("Computer: " + computer);
            System.out.println("Winner: " + winner);
            System.out.println();
        }

        double userPercentage =
                (userWins * 100.0) / games;

        double computerPercentage =
                (computerWins * 100.0) / games;

        System.out.println("Player Wins\tComputer Wins");
        System.out.println(userWins + "\t\t" + computerWins);

        System.out.println("Player Winning Percentage: "
                + userPercentage + "%");

        System.out.println("Computer Winning Percentage: "
                + computerPercentage + "%");
    }
}