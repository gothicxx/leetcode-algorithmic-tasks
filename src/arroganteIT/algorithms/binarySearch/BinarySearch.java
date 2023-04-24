package arroganteIT.algorithms.binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array  = new int[]{0,8,9,2,4,5,1,7,3,10,11,6};
        String[] strings = new String[]{"a", "d", "b", "c", "f", "e", "g"};

        int searchingElement = 3;
        String symbol = "c";
        // sort
        BinarySearch.sortArray(array);
        Arrays.sort(strings);
        // binarysearch
        int result = BinarySearch.binarySearch(array, searchingElement);
        int result2 = BinarySearch.binarySearch(strings, symbol);

        System.out.println("searching int element is " + searchingElement);
        System.out.println(Arrays.toString(array));
        System.out.println(result);
        System.out.println("//////////////////////////////////////////////");
        System.out.println("searching string element is " + symbol);
        System.out.println(Arrays.toString(strings));
        System.out.println(result2);
    }

    public static int binarySearch(String[] array, String element) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int midIndex = (left + right) / 2;
            Comparable<String> current = (Comparable<String>) array[midIndex];
            int searchedElement = current.compareTo(element);
            if (searchedElement < 0) {
                left = midIndex + 1;
            } else if (searchedElement > 0) {
                right = midIndex - 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int midIndex = (left + right) / 2;
            int current = array[midIndex];
            if (current == element) {
                return midIndex;
            } else if (current < element) { // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
                left = midIndex + 1;
            } else if (current > element) {
                right = midIndex - 1;
            }
        }
        return -1;
    }

    public static void sortArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
