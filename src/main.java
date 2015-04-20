/**
 * Created by thiago on 19/04/15.
 */
public class main {
    public static void main(String[] args) {
        Roman num = new Roman();
        int[] test = {1, 2, 3, 4, 5, 6, 7};
        String roman = num.toRoman(5);
        System.out.println(roman);
        System.out.println(test[1]);
    }
}
