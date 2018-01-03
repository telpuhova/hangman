import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {

    String[] wordsEasy = {"hi", "bye", "bee", "fine"};
    String[] wordsMedium = {"hello", "apple", "onion", "plank"};
    String[] wordsDifficult = {"watermelon", "electronics", "fundamentals", "hierarchy"};
    String[] words;
    int maxCounter;
    String currentWord;
    List<String> usedLetters;
    private String[] letters;
    int counter;


    Hangman(String level) {
        if (level.equals("easy")) {
            words = wordsEasy;
            maxCounter = 10;
        } else if (level.equals("medium")) {
            words = wordsMedium;
            maxCounter = 7;
        } else if (level.equals("difficult")) {
            words = wordsDifficult;
            maxCounter = 5;
        } else {}
        currentWord = randomWord(words);
        usedLetters = new ArrayList<String>();
        letters = currentWord.split("");
        listBuilder();
    }


    private List<String> output = new ArrayList<String>();
    // [-,-,-,-,-]
    public void listBuilder(){
        for (int i=0; i<letters.length; i++){
            output.add("__ ");
        }
    }

    public String randomWord(String[] array){
        Random wordPicker = new Random();
        int pick = wordPicker.nextInt(array.length);
//        System.out.println(array[pick]);
        return array[pick];
    }

    public boolean checkLetter(String input) {
        if(checkUsed(input)){
            usedLetters.add(input);
            for (String letter : letters) {
                if (letter.equals(input)) {
                    return true;
                }
            }
            //+1 turn counter
            counter++;
            return false;
        }
        return false;
    }

    public boolean checkUsed(String input) {
        //true = hasn't been used
        for (String letter : usedLetters){
            if (letter.equals(input)){
                return false;
            }
        }
        return true;
    }

    public void gameLoop(String input){

        if(checkLetter(input)){



            for (int i=0; i < letters.length; i++) {
                if (letters[i].equals(input)) {
                    output.set(i, input);
                }
            }
//            userWon(letters, output);
        }
    }




//    public void game(String input) {
//        listBuilder();
//        gameLoop(input);
////        while (true) {
////            gameLoop(input);
////            if (userWon()) {
////                break;
////            }
//
//    }

    public boolean userWon() {
//        System.out.println(output);
        for (int i=0; i<letters.length; i++) {
            if (!(letters[i].equals(output.get(i)))){
//                System.out.println(letters[i] + " != " + output.get(i) + " --- " + (letters[i] != output.get(i)));
                return false;
            }
        }
        return true;
    }

    public boolean userLost() {
        if (counter > maxCounter) {
            return true;
        } else {
            return false;
        }
    }


    public String getWord() {
        return currentWord;
    }
    public String[] getLetters() {
        return letters;
    }
    public List<String> getUsedLetters() {
        return usedLetters;
    }
    public List<String> getOutput(){
        return output;
    }
    public int getCounter() {
        return counter;
    }

}
