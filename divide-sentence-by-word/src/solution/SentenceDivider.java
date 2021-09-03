package solution;
import textio.TextIO;

public class SentenceDivider {
    public static void main(String[] args){
        System.out.println("Please type a sentence, or type \"0\" to be done.");
        while (true){
            String inputWord = TextIO.getWord();
            if (inputWord.equals("0")){
                return;
            }
            inputWord = inputWord.toLowerCase();
            String outputWord = "";
            for (int i = 0; i < inputWord.length(); i++) {
                char indexedChar = inputWord.charAt(i);
                if (Character.isLetter(indexedChar)) {
                    outputWord = outputWord.concat(Character.toString(indexedChar));
                } else if (indexedChar == '\'' && Character.isLetter(inputWord.charAt(i - 1)) && Character.isLetter(inputWord.charAt(i + 1))) {
                    outputWord = outputWord.concat(Character.toString(indexedChar));
                }
            }
            if (!outputWord.isBlank()) {
                System.out.println(outputWord);
            }
        }
    }
}
