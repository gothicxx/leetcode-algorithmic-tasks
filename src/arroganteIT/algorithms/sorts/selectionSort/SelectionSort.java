package arroganteIT.algorithms.sorts.selectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3,2,0,1,4,6,5,8,7,10,9};
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(selectionSort(array)));
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            int minValue = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            int temporary = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temporary;
        }
        return array;
    }
}
