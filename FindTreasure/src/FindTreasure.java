
import java.util.Random;
import java.util.Scanner;

public class FindTreasure {
    public static String[][] generateBoard(int size){
        String[][] board = new String[size][size];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = " .";
            }
        }
        return board;
    }

    public static int[] placeTreasure(int size){
        Random generator = new Random();
        int x = generator.nextInt(1,size + 1);
        int y = generator.nextInt(1,size + 1);
        return new int[]{x, y};
    }

    public static double calculateEuclideanDistance(int[] point1, int[] point2){
        return Math.sqrt(Math.pow(point1[1] - point1[0], 2) + Math.pow(point2[1] - point2[0], 2));
    }

    public static String giveHint(int[] guess, int[] treasure){
        String cardinal;
        if (guess[0] > treasure[0]){
            cardinal = "west";
        } else {
            cardinal = "east";
        }

        if (guess[1] > treasure[1]){
            cardinal = "south";
        } else{
            cardinal = "north";
        }

        return cardinal;
    }

   public static void processCommand(String command, int[] guess, int[] treasure, int attemptsLeft){
        switch(command){
            case "hint":
                System.out.println("Treasure is " + giveHint(guess, treasure));
                break;
            case "status":
                System.out.println("You have " + attemptsLeft + " attempts left.");
                break;
            case "quit":
                break;
        }
    }

    public static void playRound(String[][] board, int[] treasure, int attemptsLeft){

        //System.out.println("Treasure in " + treasure[0] + " " + treasure[1]); uncomment to know treasure location for testing purposes
        Scanner sc = new Scanner(System.in);
        System.out.println("Board:");
        printBoard(board);
        System.out.print("Enter your move (e.g., \"2,3\") or a command (\"hint\", \"status\", \"quit\"): ");
        String userInput = sc.next().toLowerCase().trim();
        //Not really sure how to implement commands
        String[] userGuessString = userInput.split(",");
        int[] userGuess = {Integer.parseInt(userGuessString[0]), Integer.parseInt(userGuessString[1])};

        if ((userGuess[0] == treasure[0]) && userGuess[1] == treasure[1]){
            System.out.println("Congratulations! You found the treasure in " + ((10 - attemptsLeft) + 1) + " attempts!");
            board[userGuess[0]][userGuess[1]] = " O";
        }else {
            System.out.println("Distance to the treasure: " + calculateEuclideanDistance(userGuess, treasure));
            board[userGuess[0] - 1][userGuess[1] - 1] = " X";
        }
    }

    public static void printBoard(String[][] board){
        for (String[] strings : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int boardSize = 5;
        int attemptsLeft = 10;
        boolean win = false;
        String[][] board = generateBoard(boardSize);
        int[] treasureLocation = placeTreasure(boardSize);
        while (!win && attemptsLeft > 0){
            playRound(board, treasureLocation, attemptsLeft);
            win = board[treasureLocation[0]][treasureLocation[1]].equals(" O");
            attemptsLeft--;
        }

        if (attemptsLeft <= 0){
            System.out.println("You lose! You ran out of attempts!");
        }
    }
}
