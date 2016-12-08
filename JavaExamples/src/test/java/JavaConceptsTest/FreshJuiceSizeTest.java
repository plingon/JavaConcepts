package JavaConceptsTest;

import JavaConcepts.FreshJuice;
import org.junit.Test;

/**
 * Created by pling on 08/12/2016.
 */
public class FreshJuiceSizeTest {
    @Test
    public void juiceSizeTest()
    {
        FreshJuice lemonade = new FreshJuice();
        lemonade.size= FreshJuice.FreshJuiceSizes.MEDIUM;
    }
}
