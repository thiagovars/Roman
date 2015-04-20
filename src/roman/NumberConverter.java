package roman;

import java.util.HashMap;
import java.util.Map;

public class NumberConverter {

    private static final int[] relevantNumbers = {
      1000,
      500,
      100,
      50,
      10,
      5,
      1
    };

    private static final Map<Integer, String> numberToRoman = new HashMap<Integer, String>();

    static {
        numberToRoman.put(1000, "M");
        numberToRoman.put(500, "D");
        numberToRoman.put(100, "C");
        numberToRoman.put(50, "L");
        numberToRoman.put(10, "X");
        numberToRoman.put(5, "V");
        numberToRoman.put(1, "I");
    }

    public String convert(int number) {

        int relevantFoundNumber = findFirstNumberLessThanOrEqualTo(number);
        String convertedNumber = numberToRoman.get(relevantFoundNumber);
        int numberLeftOver = number - relevantFoundNumber;
        if (numberLeftOver == 0) {
            return convertedNumber;
        }
        String finalResult = convertedNumber + convert(numberLeftOver);
        return lint(finalResult);
    }

    private String lint(String number) {
        if (endsInFourEqualCharacters(number)) {
            String firstPart = number.substring(0, number.length() - 4);
            String
        }
        return number;
    }

    private boolean endsInFourEqualCharacters(String str) {
        if (str.length() < 4) {
            return false;
        }
        char lastChar = str.charAt(str.length() - 1);
        String lastFourCharacters = str.substring(str.length() - 4, str.length());
        for (int i = 0; i < 4; i++) {
            if (lastFourCharacters.charAt(i) != lastChar) {
                return false;
            }
        }
        return true;
    }

    private int getArabicFromRelevantRoman(char relevantRoman) {
        for (Integer number : numberToRoman.keySet()) {
            if (numberToRoman.get(number).charAt(0) == relevantRoman) {
                return number;
            }
        }
        return -1;
    }

    public int findFirstNumberLessThanOrEqualTo(int number) {
        for(int i = 0; i < relevantNumbers.length; i++){
            if(number >= relevantNumbers[i]) {
                return relevantNumbers[i];
            }
        }
        return -1;
    }

}
