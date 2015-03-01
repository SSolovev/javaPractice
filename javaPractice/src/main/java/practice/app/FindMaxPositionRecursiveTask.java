/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author sergey
 */
public class FindMaxPositionRecursiveTask extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 1000;
    private int[] data;
    private int start;
    private int end;

    public FindMaxPositionRecursiveTask(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int maxInd = start;
        if (end - start <= THRESHOLD) {
            for (int i = start; i < end; i++) {
                if (data[maxInd] < data[i]) {
                    maxInd = i;
                }
            }
            return maxInd;

        } else {
            int halfPosition = (end - start) / 2 + start;

            FindMaxPositionRecursiveTask t1 = new FindMaxPositionRecursiveTask(data, start, halfPosition);
            t1.fork();
            FindMaxPositionRecursiveTask t2 = new FindMaxPositionRecursiveTask(data, halfPosition, end);
            int secondInd = t2.compute();
            int firstInd = t1.join();

            if (data[firstInd] > data[secondInd]) {
                return firstInd;
            } else if (data[firstInd] < data[secondInd]) {
                return secondInd;
            } else {
                return firstInd > secondInd ? secondInd : firstInd;
            }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}
