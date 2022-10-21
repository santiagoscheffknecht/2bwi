package at.santiago.java.basics;

import java.util.Scanner;
import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        ;
        //Feld erstellen
        char[][] field = new char[3][3];
        for (int i = 0; i < 3; i++) {
            field[0][i] = '+';
            field[1][i] = '+';
            field[2][i] = '+';
        }
        for (int i = 0; i < field.length; i++) {
            System.out.println(field[i]);
        }
        ;
        System.out.println("turn x");

        boolean isFinished = false;
        int round = 0;

        while (!isFinished) {
            Scanner position = new Scanner(System.in);

            //position suchen
            String input = position.next();
            String[] in = input.split("/");
            int x = Integer.parseInt(in[0]);
            int y = Integer.parseInt(in[1]);
            if (round % 2 == 0) {
                field[x][y] = 'x';
            } else {
                field[x][y] = 'o';
            }

            for (int i = 0; i < field.length; i++) {
                System.out.println(field[i]);
            }
            round++;
            if (round % 2 == 0) {
                System.out.println("turn x");
            } else {
                System.out.println("turn o");
            }

            if (field[0][0] == field[1][1] && field[2][2] == field[1][1] && field[1][1] != '+') {
                if (round % 2 == 0) {
                    System.out.println("o has won se game");
                } else {
                    System.out.println("x has won se game");
                }
                isFinished = true;
            } else if (field[0][0] == field[0][1] && field[0][2] == field[0][1] && field[0][1] != '+') {
                if (round % 2 == 0) {
                    System.out.println("o has won se game");
                } else {
                    System.out.println("x has won se game");
                    isFinished = true;
                }
            } else if (field[1][0] == field[1][1] && field[1][2] == field[1][1] && field[1][1] != '+') {
                if (round % 2 == 0) {
                    System.out.println("o has won se game");
                } else {
                    System.out.println("x has won se game");
                    isFinished = true;
                }

            } else if (field[2][0] == field[2][1] && field[2][2] == field[2][1] && field[2][1] != '+') {
                if (round % 2 == 0) {
                    System.out.println("o has won se game");
                } else {
                    System.out.println("x has won se game");
                    isFinished = true;
                }
            } else if (field[0][0] == field[2][0] && field[2][0] == field[1][0] && field[2][0] != '+') {
                if (round % 2 == 0) {
                    System.out.println("o has won se game");
                } else {
                    System.out.println("x has won se game");
                    isFinished = true;
                }
            } else if (field[0][1] == field[2][1] && field[2][1] == field[1][1] && field[2][1] != '+') {
                if (round % 2 == 0) {
                    System.out.println("o has won se game");
                } else {
                    System.out.println("x has won se game");
                    isFinished = true;
                }
            } else if (field[0][2] == field[2][2] && field[2][2] == field[1][2] && field[2][2] != '+') {
                if (round % 2 == 0) {
                    System.out.println("o has won se game");
                } else {
                    System.out.println("x has won se game");
                    isFinished = true;
                }
            } else if (field[0][0] == field[2][0] && field[2][0] == field[1][0] && field[2][0] != '+') {
                if (round % 2 == 0) {
                    System.out.println("o has won se game");
                } else {
                    System.out.println("x has won se game");
                    isFinished = true;
                }
            } else if (field[0][2] == field[1][1] && field[2][0] == field[1][1] && field[1][1] != '+') {
                if (round % 2 == 0) {
                    System.out.println("o has won se game");
                } else {
                    System.out.println("x has won se game");
                    isFinished = true;
                }
            } else if (round == 9) {
                System.out.println("you both lost there is no draw");
                isFinished = true;

            }
            ;
            ;

            ;
        }
    }
}