package practice.app.algorithms.sort;

import practice.app.model.Person;

/**
 * Created by SeASolovev on 07.04.2015.
 */
public class SortAlgorithms {

    public static void bubbleSort(int[] array) {

        for (int j = array.length - 1; j > 1; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }

        }

    }

    public static void selectSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[j] > array[i]) {
                    swap(array, i, j);
                }
            }
        }

    }

    public static void selectSortFromBook(int[] array) {
        int out, in, min;
        int nElems = array.length;
        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++) {
                if (array[in] < array[min]) {
                    swap(array, in, out);
                }
            }
        }

    }

    public static void insertionSort(int[] a) {
        int temp;
        int nElems = a.length;
        for (int out = 1; out < nElems; out++) {
            temp = a[out];
            for (int in = out - 1; in >= 0; in--) {
                a[in + 1] = a[in];
                if (a[in] <= temp) {
                    a[in + 1] = temp;
                    break;
                } else if (in == 0) {
                    a[in] = temp;
                }
            }
        }

    }

    public static void insertionSortFromBook(int[] a) {

        int nElems = a.length;
        int in, out;
        for (out = 1; out < nElems; out++) {
            int temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;

        }

    }

    public static void insertionSortObject(Person[] a) {

        int nElems = a.length;
        int in, out;
        for (out = 1; out < nElems; out++) {
            Person temp = a[out];
            in = out;
            while (in > 0 && a[in - 1].getLast().compareTo(temp.getLast()) > 0) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;

        }

    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] createRandomArr(int amount) {
        int[] a = new int[amount];
        for (int i = 0; i < amount; i++) {
            a[i] = (int) (Math.random() * amount);
        }
        return a;
    }

    public static void averageTime(int cycles, int arrayAmount) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < cycles; i++) {
            int[] a = createRandomArr(arrayAmount);
            bubbleSort(a);
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("Average bubble sort: " + (end / cycles));


        start = System.currentTimeMillis();
        for (int i = 0; i < cycles; i++) {
            int[] a = createRandomArr(arrayAmount);
            selectSort(a);
        }
        end = System.currentTimeMillis() - start;
        System.out.println("Average select sort: " + (end / cycles));

        start = System.currentTimeMillis();
        for (int i = 0; i < cycles; i++) {
            int[] a = createRandomArr(arrayAmount);
            selectSortFromBook(a);
        }
        end = System.currentTimeMillis() - start;
        System.out.println("Average select from book sort: " + (end / cycles));


        start = System.currentTimeMillis();
        for (int i = 0; i < cycles; i++) {
            int[] a = createRandomArr(arrayAmount);
            insertionSort(a);
        }
        end = System.currentTimeMillis() - start;
        System.out.println("Average insertion sort: " + (end / cycles));

        start = System.currentTimeMillis();
        for (int i = 0; i < cycles; i++) {
            int[] a = createRandomArr(arrayAmount);
            insertionSortFromBook(a);
        }
        end = System.currentTimeMillis() - start;
        System.out.println("Average insertion from book sort: " + (end / cycles));
    }


    public static void averageTimeDoubleSort(int cycles, int arrayAmount) {
        int[] a = createRandomArr(arrayAmount);
        long start = System.currentTimeMillis();
        for (int i = 0; i < cycles; i++) {
            bubbleSort(a);
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("Average bubble sort: " + (end / cycles));

        a = createRandomArr(arrayAmount);
        start = System.currentTimeMillis();
        for (int i = 0; i < cycles; i++) {
            selectSort(a);
        }
        end = System.currentTimeMillis() - start;
        System.out.println("Average select sort: " + (end / cycles));

        a = createRandomArr(arrayAmount);
        start = System.currentTimeMillis();
        for (int i = 0; i < cycles; i++) {
            selectSortFromBook(a);
        }
        end = System.currentTimeMillis() - start;
        System.out.println("Average select from book sort: " + (end / cycles));

        a = createRandomArr(arrayAmount);
        start = System.currentTimeMillis();
        for (int i = 0; i < cycles; i++) {
            insertionSort(a);
        }
        end = System.currentTimeMillis() - start;
        System.out.println("Average insertion sort: " + (end / cycles));

        a = createRandomArr(arrayAmount);
        start = System.currentTimeMillis();
        for (int i = 0; i < cycles; i++) {
            insertionSortFromBook(a);
        }
        end = System.currentTimeMillis() - start;
        System.out.println("Average insertion from book sort: " + (end / cycles));
    }
}
