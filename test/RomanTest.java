import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanTest {

    @Test
    public void TestRetornaIVQuandoRecebe4(){
        Roman arabic = new Roman();
        String roman = arabic.toRoman(4);
        assertEquals("IV", roman);
    }

    @Test
    public void TestRetornaIVQuandoRecebe5(){
        Roman arabic = new Roman();
        String roman = arabic.toRoman(5);
        assertEquals("V", roman);
    }

}