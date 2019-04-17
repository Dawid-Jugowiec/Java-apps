import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

   @org.junit.Before
    public void setup()
    {
        util = new Utilities();

    }

    @Test
    public void everynthChar() {
        char [] charArray =   {'H', 'e','l','l', 'o'};
        char [] charArray2 = {'e', 'l'};
        //assertArrayEquals(new char [] {'e','l'}, util.everynthChar(charArray,2));
        assertArrayEquals(charArray, util.everynthChar(charArray,9));

    }

    @Test
    public void removePairs() {

      String string =  util.removePairs("AABCDDEFF");
       assertEquals("ABCDEF", string);


    }

    @Test
    public void remobePairs2(){
        String string =  util.removePairs("ABCCABDEF");
        assertEquals("ABCABDEF", string);
    }

    @Test (expected = NullPointerException.class)
    public void remobePairs3(){

        assertEquals("ABCABDEF", util.removePairs(null));
    }

    @Test
    public void remobePairs4(){

        assertEquals("A", util.removePairs("A"));
    }
    @Test (expected = ArithmeticException.class)
    public void converter() {
       assertEquals(300, util.converter(10,5));
        assertEquals(300, util.converter(10,0));

    }

    @Test
    public void nullIfOddLengrh() {
       assertEquals(new String ("Adam"), util.nullIfOddLengrh("Adam"));
       assertNull(util.nullIfOddLengrh("Blake"));
    }
}