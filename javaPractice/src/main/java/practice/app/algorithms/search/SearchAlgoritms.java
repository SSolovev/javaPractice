package practice.app.algorithms.search;

/**
 * Created by SeASolovev on 12.09.2015.
 */
public class SearchAlgoritms {
//TODO:incorrect
    public static int search(int[] arr, int val) {
        int ind = (arr.length - 1) / 2;
        if (arr[ind] == val) {
            return ind;
        } else {
            while (ind != 0) {
                if (arr[ind] > val) {
                    ind = ind / 2;
                } else {
                    ind = ind + ((arr.length - 1 - ind) / 2);
                }
                if (arr[ind] == val) {
                    return ind;
                }
            }
            return ind;
        }

    }
}
