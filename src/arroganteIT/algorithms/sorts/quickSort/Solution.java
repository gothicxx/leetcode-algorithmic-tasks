package arroganteIT.algorithms.sorts.quickSort;

public class Solution {
    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = left + (right - left) / 2;
            int pivotValue = array[pivotIndex];
            int from = left;
            int to = right;
            while (from <= to) {
                while (array[from] < pivotValue) {
                    from++;
                }
                while (array[to] > pivotValue) {
                    to--;
                }
                if (from <= to) {
                    swap(array, from, to);
                    from++;
                    to--;
                }
            }
            quickSort(array, left, to);
            quickSort(array, from, right);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }
}
