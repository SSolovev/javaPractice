package practice.app.algorithms.struct;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * Created by SeASolovev on 15.04.2015.
 */
public class CyclicQueue {
    int front = 0;
    int rear = -1;
    int[] q;
int elementsSize = 0;

    public CyclicQueue(int size) {
        q = new int[size];

    }

    public void insert(int i) {
//        if (rear + 1 < q.length && q[rear + 1] == null) {
//            q[++rear] = i;
//            return true;
//        }else if(rear + 1 >= q.length && q[0] == null){
//            rear=0;
//            q[rear] = i;
//            return true;
//        }
//        return false;


        if(rear>= q.length-1){
            rear=-1;
        }
        q[++rear] = i;
        elementsSize++;
    }


    public Integer remove() {
        int res = q[front];

        if (front>= q.length-1){
            front=0;
        }else{
            front++;
        }

        elementsSize--;
//        if(front>= q.length-1){
//            front=0;
//        }
//        front++;
        return res;
    }


    public int size() {
        return elementsSize;
    }

    public boolean isEmpty() {
        return elementsSize == 0;

    }


}
