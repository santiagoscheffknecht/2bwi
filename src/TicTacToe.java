import java.util.Scanner;
import java.util.*;
public class TicTacToe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("[1][2][3]");
        System.out.println("[3][4][5]");
        System.out.println("[6][7][8]");

        static String[] board;
        static String turn;

        static String checkWinner(){
            for (int a = 0; a < 8; a++) {
                String line = null;

                switch (a) {
                    case 0:
                        line = board[0] + board[1] + board[2];
                        break;
                    case 1:
                        line = board[3] + board[4] + board[5];
                        break;
                    case 2:
                        line = board[6] + board[7] + board[8];
                        break;
                    case 3:
                        line = board[0] + board[3] + board[6];
                        break;
                    case 4:
                        line = board[1] + board[4] + board[7];
                        break;
                    case 5:
                        line = board[2] + board[5] + board[8];
                        break;
                    case 6:
                        line = board[0] + board[4] + board[8];
                        break;
                    case 7:
                        line = board[2] + board[4] + board[6];
                        break;
                }
                if (line.equals("xxx")) {
                    return "x";
                } else if (line.equals("OOO")) {
                    return "OOO";
                }
            };

        boolean isFinished = false;
        while (!isFinished) {





            int selection1 = scanner.nextInt();







    }}
};};};