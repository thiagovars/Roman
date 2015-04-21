/**
 * Created by thiago on 12/04/15.
 */
public class Roman {
    String[] indexRomans = {"M", "D", "C", "L", "X", "V", "I"};
       int[] indexArabic = {1000, 500, 100, 50, 10, 5, 1};

    public String toRoman(int number){
        String result = "";
        int index = 0;
        int arabic = indexArabic[0];
        // find index
        while (arabic > number) {
            index++;
            arabic = indexArabic[index];
        }

        result += indexRomans[index];

        return result;
    }
}
