package arrayservice;

public class ArrayCalculate {


    public int findMin(int[] array) {
        int result = array[0];
        for (int j : array) {
            if (j < result) {
                result = j;
            }
        }
        return result;
    }


    public int findMax(int[] array) {
        int result = array[0];
        for (int j : array) {
            if (j > result) {
                result = j;
            }
        }
        return result;
    }


    public int findAverageValue(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }


    public int calculateSumValues(int[] array) { //
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }


    public int calculatePositiveElements(int[] array) {
        int result = 0;
        for (int j : array) {
            if (j > 0) {
                result++;
            }
        }
        return result;
    }

    public int calculateNegativeElements(int[] array) {
        int result = 0;
        for (int j : array) {
            if (j < 0) {
                result++;
            }
        }
        return result;
    }


    public int calculateNulls(int[] array) {
        int result = 0;
        for (int j : array) {
            if (j == 0) {
                result++;
            }
        }
        return result;
    }
}






