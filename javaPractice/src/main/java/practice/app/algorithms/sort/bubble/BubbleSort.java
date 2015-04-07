package practice.app.algorithms.sort.bubble;

/**
 * Created by SeASolovev on 07.04.2015.
 */
public class BubbleSort {
    public static void bubleSort(int[] array){


            for (int j = array.length; j > 1; j--) {
                for (int i = 0; i < array.length-1; i++) {
                if(array[i]>array[i+1]){
                    int temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }

        }

    }
}
