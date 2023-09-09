package ke.co.safaricom;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1: Encryption\n2: Decryption");
        int menu = in.nextInt();

        if (menu == 1){
            System.out.println("Please enter a message to be encrypted: ");
            String input = in.next();
            System.out.println("Please enter a number to be your shift key: ");
            int keyInput = in.nextInt();
            String output = "";

            for(int i = 0; i < input.length(); i++){
                EncryptCipher encoding = new EncryptCipher();
                encoding.setKey(keyInput);
                encoding.setC(input.charAt(i));
                output += encoding.encrypt();
            }

            System.out.println("Your encrypted message is: "+output);


        }

        else if (menu == 2){
            System. out. println("Please enter a message to be decrypted: ");
            String input = in.next();
            System. out. println("Please enter a number to be your decryption key: ");
            int keyInput = in.nextInt();
            String output = "";
            for(int i = 0; i < input.length(); i++){
                DecryptCipher encoding = new DecryptCipher();
                encoding.setKey(keyInput);
                encoding.setC(input.charAt(i));
                output += encoding.decrypt();
            }
            System.out.println("Your decrypted message is: "+output);

        }

        else
        {
            System.out.println("You should select 1 or 2");
        }


        }
    }
