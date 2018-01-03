import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("guess a word by entering letters");


            System.out.println("type the difficulty level: easy medium or difficult");
            String dif = bufferedReader.readLine();

            Hangman game = new Hangman(dif);

            System.out.println(game.getOutput());

            while (true) {
                String input = bufferedReader.readLine();
                game.gameLoop(input);
                if (game.userLost()) {
                    System.out.println("you've lost");
                    System.out.println(game.getWord());
                    return;
                } else if (game.userWon()) {
                    System.out.println("you've won");
                    return;
                } else {
                    System.out.println(game.getOutput());
                    System.out.println("Counter: " + game.getCounter());

                }



            }


        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
