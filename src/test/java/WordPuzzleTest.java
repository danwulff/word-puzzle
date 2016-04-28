import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

  @Test //test for consonant
  public void createPuzzle_forConsonant_Consonant() {
    WordPuzzle puzzle = new WordPuzzle();
    assertEquals("b", puzzle.createPuzzle("b"));
  }

  @Test //test for vowel
  public void createPuzzle_forVowel_dash() {
    WordPuzzle puzzle = new WordPuzzle();
    assertEquals("-", puzzle.createPuzzle("a"));
  }

  @Test //test for sentence "Tuesdays Dead"
  public void createPuzzle_forSentenceString_String() {
    WordPuzzle puzzle = new WordPuzzle();
    assertEquals("T--sd-ys D--d", puzzle.createPuzzle("Tuesdays Dead"));
  }

  @Test //test for upper case alphabet
  public void createPuzzle_forSentenceUpperCaseAlphabet_upperCaseConsonants() {
    WordPuzzle puzzle = new WordPuzzle();
    assertEquals("-BCD-FGH-JKLMN-PQRST-VWXYZ", puzzle.createPuzzle("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
  }

  @Test //test for lower case alphabet
  public void createPuzzle_forSentenceLowerCaseAlphabet_lowerCaseConsonants() {
    WordPuzzle puzzle = new WordPuzzle();
    assertEquals("-bcd-fgh-jklmn-pqrst-vwxyz", puzzle.createPuzzle("abcdefghijklmnopqrstuvwxyz"));
  }
}
