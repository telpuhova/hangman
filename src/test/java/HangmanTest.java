import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Guest on 1/3/18.
 */
public class HangmanTest {

    @Test
    public void getWord_gettingAWord_string() throws Exception {
        Hangman testGame = new Hangman("medium");
        String output = testGame.getWord();
        assertEquals(true, output instanceof String);
    }
    // Commented out tests break due to random word generation. Set word to "hello" to test.

//    @Test
//    public void getLetters_splitWordIntoLetters() throws Exception {
//        Hangman testGame = new Hangman();
//        String output = testGame.getWord();
//        assertEquals(output.split(""), testGame.getLetters());
//    }
//    @Test
//    public void checkLetter_letterIsNotInArray_false() throws Exception {
//        Hangman testGame = new Hangman();
//        assertEquals(false, testGame.checkLetter("a"));
//    }
//    @Test
//    public void checkLetter_letterIsInArray_true() throws Exception {
//        Hangman testGame = new Hangman();
//        assertEquals(true, testGame.checkLetter("e"));
//    }
//    @Test
//    public void usedLetters_getWhatHasBeenTried_arrayList() throws Exception {
//        Hangman testGame = new Hangman();
//        List<String> expected = new ArrayList<String>();
//        expected.add("a");
//        expected.add("b");
//        expected.add("c");
//        expected.add("d");
//        testGame.checkLetter("a");
//        testGame.checkLetter("b");
//        testGame.checkLetter("c");
//        testGame.checkLetter("d");
//        assertEquals(expected, testGame.getUsedLetters());
//    }
//
//    @Test
//    public void output_createEmptySpacesInOutput_arrayList() throws Exception{
//        Hangman testGame = new Hangman();
//        List<String> expected = new ArrayList<String>();
//        expected.add("-");
//        expected.add("-");
//        expected.add("-");
//        expected.add("-");
//        expected.add("-");
////        testGame.listBuilder();
//        assertEquals(expected, testGame.getOutput());
//    }
//
//    @Test
//    public void getOutput_addGuessedLetters_arrayList() throws Exception{
//        Hangman testGame = new Hangman();
//        List<String> expected = new ArrayList<String>();
//        expected.add("-");
//        expected.add("-");
//        expected.add("l");
//        expected.add("l");
//        expected.add("-");
////        testGame.listBuilder();
//        testGame.gameLoop("l");
//        assertEquals(expected, testGame.getOutput());
//    }
//
//    @Test
//    public void userWon_userDidNotWin_false() throws Exception{
//        Hangman testGame = new Hangman();
//        assertEquals(false, testGame.userWon());
//    }
//
//    @Test
//    public void userWon_userWon_true() throws Exception{
//        Hangman testGame = new Hangman();
//        testGame.gameLoop("h");
//        testGame.gameLoop("e");
//        testGame.gameLoop("l");
//        testGame.gameLoop("l");
//        testGame.gameLoop("o");
//
////        System.out.println(testGame.getOutput());
//        assertEquals(true, testGame.userWon());
//    }
//
//    @Test
//    public void userLost_userLost_true() throws Exception{
//        Hangman testGame = new Hangman();
//        testGame.gameLoop("q");
//        testGame.gameLoop("z");
//        testGame.gameLoop("p");
//        testGame.gameLoop("u");
//        testGame.gameLoop("m");
//        testGame.gameLoop("n");
//        testGame.gameLoop("c");
//        testGame.gameLoop("x");
//
////        System.out.println(testGame.getOutput());
//        System.out.println(testGame.getCounter());
//        assertEquals(true, testGame.userLost());
//    }



}