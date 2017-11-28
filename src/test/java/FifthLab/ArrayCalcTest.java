package FifthLab;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ArrayCalcTest {
    ArrayCalc testCalc = new ArrayCalc();
    Array testArray = new Array(3, 3);
    @Before
    public void init(){
        testCalc.fillArray(testArray);
    }
    @After
    public void delete(){
        testCalc = null;
    }

    @Test
    public void notNullMax(){
        assertNotNull(testCalc.findMaxElement(testArray));
    }

    @Test
    public void notNullMin(){
        assertNotNull(testCalc.findMinElement(testArray));
    }

    @Test
    public void testMax() {
        int result = testCalc.findMaxElement(testArray);
        assertEquals(9, result);
    }

    @Test
    public void testMin(){
        int result = testCalc.findMinElement(testArray);
        assertEquals(1, result);
    }

    @Ignore
    @Test(timeout = 10001)
    public void infinity(){
        while (true);
    }
}

