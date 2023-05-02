package arrayservice.test;


import arrayservice.ArraySort;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySortTest {

    @Test
    public void testBubbleSort() {
        ArraySort arraySort = new ArraySort();
        int[] actualArray = arraySort.bubbleSort(new int[]{4, 2, 3, 1});
        int[] expectArray = new int[]{1, 2, 3, 4};
        Assert.assertEquals(actualArray, expectArray);

    }

    @Test
    public void testSelectionSort() {
        ArraySort arraySort = new ArraySort();
        int[] actualArray = arraySort.selectionSort(new int[]{4, 2, 3, 1});
        int[] expectArray = new int[]{1, 2, 3, 4};
        Assert.assertEquals(actualArray, expectArray);
    }
}