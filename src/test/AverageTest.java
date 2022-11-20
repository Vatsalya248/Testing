package test;

import main.Average;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AverageTest {

    private Average averageFinder = new Average();

    @Test
    void testAverage() {

        assertEquals(0,averageFinder.average(0, new int[] {1,2,3}));

        assertEquals(0,averageFinder.average(-1, new int[] {1,2,3}));

        assertEquals(1,averageFinder.average(2, new int[] {1,2,3}));

        assertEquals(1,averageFinder.average(2, new int[] {1,2}));

        assertEquals(1,averageFinder.average(3, new int[] {1,2}));

        assertEquals(0,averageFinder.average(0, new int[0]));

        assertEquals(0,averageFinder.average(-1, new int[0]));

        assertEquals(0,averageFinder.average(2, new int[0]));
    }
}

