package practice.app.algorithms.sort;

/**
 * Created by SeASolovev on 07.04.2015.
 */
public class SortAlgorithms {

    public static void bubbleSort(int[] array) {

        for (int j = array.length - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i+1);
                }
            }

        }

    }

    public static void swap(int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }

}
