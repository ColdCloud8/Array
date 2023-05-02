package arrayservice.test;

import arrayservice.ArrayCalculate;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayCalculateTest {

    @Test
    public void testFindMin() {
        ArrayCalculate arrayCalculate = new ArrayCalculate();
        int actual = arrayCalculate.findMin(new int[]{10, 11, 4, 6, 2});
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindMax() {
        ArrayCalculate arrayCalculate = new ArrayCalculate();
        int actual = arrayCalculate.findMax(new int[]{10, 11, 4, 6, 2});
        int expected = 11;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindAverageValue() {
        ArrayCalculate arrayCalculate = new ArrayCalculate();
        int actual = arrayCalculate.findAverageValue(new int[]{10, 11, 4, 6, 2});
        int expected = 6;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalculateSumValues() {
        ArrayCalculate arrayCalculate = new ArrayCalculate();
        int actual = arrayCalculate.calculateSumValues(new int[]{10, 11, 4, 6, 2});
        int expected = 33;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testCalculatePositiveElements() {
        ArrayCalculate arrayCalculate = new ArrayCalculate();
        int actual = arrayCalculate.calculatePositiveElements(new int[]{-10, 11, -4, 6, 2});
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalculateNegativeElements() {
        ArrayCalculate arrayCalculate = new ArrayCalculate();
        int actual = arrayCalculate.calculateNegativeElements(new int[]{-10, -11, 4, 6, 2});
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalculateNulls() {
        ArrayCalculate arrayCalculate = new ArrayCalculate();
        int actual = arrayCalculate.calculateNulls(new int[]{-10, -11, 4, 0, 2});
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
}