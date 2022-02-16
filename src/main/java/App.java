import model.Scrabble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        String cont = "Continue";
        String gameOver = "Exit";
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome To Scrabble Scorer\n");
        System.out.println("Enter any Word to get a Score :: ex <--- Shalashaska ---> ");
        try{
            String enteredWord = bufferedReader.readLine();
            Scrabble yourScrabble = new Scrabble();
            System.out.printf("Hey there,Your Score Is  %d %n",yourScrabble.wordNumberValue(enteredWord) );
            System.out.println("**************************************************************");
            System.out.println("Would you like to keep Going?\n");
            System.out.println("Enter Either of the Below Options:\n");
            System.out.println(" 0_0 Continue<--           -->Exit 0~0");
            String gameStatus = bufferedReader.readLine();


            while(gameStatus.equals(cont)) {
                System.out.println("*************************************");
                System.out.println("Ok Then, Enter Another Word :: Example > ( SniperWolf ) <");
                String newWord = bufferedReader.readLine();
                System.out.println("Would you like to keep Going?\n");
                System.out.println("Enter Either of the Below Options:\n");
                System.out.printf("Hello Again..Your Score Is  %d %n", yourScrabble.wordNumberValue(newWord));
                System.out.println(" 0_0 Continue<--           -->Exit 0~0");
                System.out.println("*********************************************e");
                String newStatus = bufferedReader.readLine();
                if(newStatus.equals("Continue")){
                    newStatus = gameStatus;
                }else{
                    break;
                }
            }

            System.out.println("0{}0{}0{}0{}0{}0{}0{}0{}0{}0{}0");
            System.out.println("Have A Good Day");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
