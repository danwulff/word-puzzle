
public class WordPuzzle {
  public static void main(String[] args) {}

  public static String createPuzzle(String sentence) {
    char[] sentenceArray = sentence.toCharArray();
    //loop through character array
    for (int index = 0; index < sentenceArray.length; index++) {
      //if vowel
      if (sentenceArray[index] == 'A' || sentenceArray[index] == 'a' || sentenceArray[index] == 'E' || sentenceArray[index] == 'e' || sentenceArray[index] == 'I' || sentenceArray[index] == 'i' || sentenceArray[index] == 'O' || sentenceArray[index] == 'o' || sentenceArray[index] == 'U' || sentenceArray[index] == 'u') {
        //change to dash
        sentenceArray[index] = '-';
      }
    }
    //return string (convert back from char array)
    return String.valueOf(sentenceArray);
  }
}
