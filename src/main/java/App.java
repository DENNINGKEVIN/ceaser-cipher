import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        boolean runApp = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I'm a Caesar Cipher application!");
        try {
            while(runApp){
                System.out.println("What would you like to do: 1. Encode 2. Decode 3. Exit (Enter 1, 2 or 3)");
                String userChoice = bufferedReader.readLine();
                Integer intUserChoice = Integer.parseInt(userChoice);
                if(intUserChoice == 1){
                    System.out.println("Enter text to be encoded");
                    String userText = bufferedReader.readLine();
                    System.out.println("Enter key (Should be a number)");
                    String userKey = bufferedReader.readLine();
                    Integer intKey = Integer.parseInt(userKey);
                    CaesarCipher userCipher = new CaesarCipher(userText,intKey);
                    String cipherText = userCipher.encode();
                    System.out.println("The cipher text for "+ userText + " using " + userKey + " as the key is => " + cipherText );
                    System.out.println("-----------------------------------------------------");
                    System.out.println("-----------------------------------------------------");
                }
                else if(intUserChoice == 2){
                    System.out.println("Enter text to be decoded");
                    String userText = bufferedReader.readLine();
                    System.out.println("Enter key (Should be a number)");
                    String userKey = bufferedReader.readLine();
                    Integer intKey = Integer.parseInt(userKey);
                    CaesarCipher userCipher = new CaesarCipher(userText,intKey);
                    String plainText = userCipher.decode();
                    System.out.println("The plain text for "+ userText + " using " + userKey + " as the key is => " + plainText );
                    System.out.println("-----------------------------------------------------");
                    System.out.println("-----------------------------------------------------");

                }
                else if(intUserChoice == 3){
                    runApp = false;
                }
                else{
                    System.out.println("Sorry, the option you have selected is invalid");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("-----------------------------------------------------");
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
