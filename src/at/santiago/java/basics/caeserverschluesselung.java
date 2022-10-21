package at.santiago.java.basics;

import java.util.Scanner;

public class caeserverschluesselung {
    public static void main(String...s){
        String Original_Message, Decrypted_Message = "";
        int Cipher_Key;
        char Message_Char;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an encrypted message: ");
        Original_Message = sc.nextLine();
        System.out.println("Enter the key: ");
        Cipher_Key = sc.nextInt();

        for(int i = 0; i < Original_Message.length(); ++i){
            Message_Char = Original_Message.charAt(i);
            if(Message_Char >= 'a' && Message_Char <= 'z'){
                Message_Char = (char)(Message_Char - Cipher_Key);

                if(Message_Char < 'a'){
                    Message_Char = (char)(Message_Char + 'z' - 'a' + 2);
                }

                Decrypted_Message += Message_Char;
            }
            else if(Message_Char >= 'A' && Message_Char <= 'Z'){
                Message_Char = (char)(Message_Char - Cipher_Key);

                if(Message_Char < 'A'){
                    Message_Char = (char)(Message_Char + 'Z' - 'A' + 1);
                }

                Decrypted_Message += Message_Char;
            }
            else {
                Decrypted_Message += Message_Char;
            }
        }
        System.out.println("The Decrypted Message is : " + Decrypted_Message);
    }
}