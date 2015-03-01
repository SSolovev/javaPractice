package practice.app;


import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sergey
 */
public class RandomInitRecursiveAction extends RecursiveAction {

    private static final int THRESHOLD = 100;

    private int[] data;
    private int start;
    private int end;

    public RandomInitRecursiveAction(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start <= THRESHOLD) {
            for (int i = start; i < end; i++) {
                data[i] = ThreadLocalRandom.current().nextInt();
            }
        } else {
            int half = ((end - start) / 2) + start;

            RandomInitRecursiveAction a1 = new RandomInitRecursiveAction(data, start, half);

            a1.fork();
            RandomInitRecursiveAction a2 = new RandomInitRecursiveAction(data, half, end);
            a2.compute();
            a1.join();
        }

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
