package roman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberConverterTest {
    @Test
    public void convertSixtyEightToLXVIII(){
        NumberConverter converter = new NumberConverter();
        assertEquals("LXVIII", converter.convert(68));
    }

    @Test
    public void findsRelevantNumbersThatAreLessThanOrEqual() {
        NumberConverter converter = new NumberConverter();
        assertEquals(1, converter.findFirstNumberLessThanOrEqualTo(1));
        assertEquals(1, converter.findFirstNumberLessThanOrEqualTo(2));
        assertEquals(1, converter.findFirstNumberLessThanOrEqualTo(4));
        assertEquals(5, converter.findFirstNumberLessThanOrEqualTo(5));
        assertEquals(5, converter.findFirstNumberLessThanOrEqualTo(9));
        assertEquals(10, converter.findFirstNumberLessThanOrEqualTo(13));
        assertEquals(10, converter.findFirstNumberLessThanOrEqualTo(40));
        assertEquals(50, converter.findFirstNumberLessThanOrEqualTo(60));
    }

    @Test
    public void convertOneToI(){
        NumberConverter converter = new NumberConverter();
        String converted = converter.convert(1);
        assertEquals("I", converted);
    }

    @Test
    public void convertTwoToII(){
        NumberConverter convertTwo = new NumberConverter();
        String converted = convertTwo.convert(2);
        assertEquals("II", converted);
    }

    @Test
    public void convertFiveToV(){
        NumberConverter convertFive = new NumberConverter();
        String converted = convertFive.convert(5);
        assertEquals("V", converted);
    }

    @Test
    public void convertFourToIV(){
        NumberConverter convertFour = new NumberConverter();
        String converted = convertFour.convert(4);
        assertEquals("IV", converted);
    }

    @Test
    public void convertNineToIX(){
        NumberConverter convertFour = new NumberConverter();
        String converted = convertFour.convert(9);
        assertEquals("IX", converted);
    }
}