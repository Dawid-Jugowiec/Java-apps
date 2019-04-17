import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class )
public class UtilitiesTestParameterized {
    private Utilities util;
private String input;
private String output;

    public UtilitiesTestParameterized( String string, String output) {

        this.input = string;
        this.output = output;
    }
    @Before
    public void setup()
    {
         util = new Utilities();
    }

@Parameterized.Parameters
    public static Collection<String[]> testConditions ()
    {
        return Arrays.asList( new String [] [] {{"ABCDEFF", "ABCDEF"}, {"AB88EFFG", "AB8EFG"},{"112233445566", "123456"},{"ZYZQQB", "ZYZQB"},{"A", "A"}});
    }




    @org.junit.Test
    public void removePairs() throws Exception {



        assertEquals(output, util.removePairs(input));


    }
}
