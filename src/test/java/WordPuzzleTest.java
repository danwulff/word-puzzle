import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

  @Test //test for sentence "Tuesdays Dead"
  public void createPuzzle_forSentenceString_String() {
    WordPuzzle puzzle = new WordPuzzle();
    assertEquals("T--sd-ys D--d", puzzle.createPuzzle("Tuesdays Dead"));
  }

  @Test //test for upper case alphabet
  public void createPuzzle_forSentenceALPHABET_ALPHABETPuzzle() {
    WordPuzzle puzzle = new WordPuzzle();
    assertEquals("-BCD-FGH-JKLMN-PQRST-VWXYZ", puzzle.createPuzzle("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
  }

  @Test //test for lower case alphabet
  public void createPuzzle_forSentencealphabet_alphabetPuzzle() {
    WordPuzzle puzzle = new WordPuzzle();
    assertEquals("-bcd-fgh-jklmn-pqrst-vwxyz", puzzle.createPuzzle("abcdefghijklmnopqrstuvwxyz"));
  }
}
