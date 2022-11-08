package at.santiago.java.basics;

import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String word = "";
        boolean isFinished = false;

        System.out.println("Finde das wort");

        Random random = new Random();
        int number = random.nextInt(5);
        switch (number) {
            case 0:
                word = "block";
                break;
            case 1:
                word = "bande";
                break;
            case 2:
                word = "strasse";
                break;
            case 3:
                word = "viertel";
                break;
            case 4:
                word = "dieb";
                break;
            case 5:
                word = "sportauto";
                break;

        }
        char[] ch = word.toCharArray();
        char[] letters = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            int randomDescryption = random.nextInt(2);
            if (randomDescryption == 0) {
                ch[i] = '*';
            }
            System.out.println(ch[i]);
        }
        while (!isFinished){
            Scanner scanner = new Scanner(System.in);
            String Buchstabe = scanner.next();

            for (int i = 0; i < word.length(); i++) {
                String tempStr = String.valueOf(ch[i]);
                
            }

            }
        }
    }
