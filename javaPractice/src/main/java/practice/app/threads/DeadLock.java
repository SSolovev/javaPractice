package practice.app.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SeASolovev on 03.04.2015.
 */
public class DeadLock {

     List<String> list1 = new ArrayList<>();
     List<String> list2= new ArrayList<>();
    {
        list1.add("A");
        list2.add("B");
    }

    public void add(String s){
        synchronized (list1){

            synchronized (list2){
                 list1.add(s);

            }

        }
    }
    public String read(){
        synchronized (list2){

            synchronized (list1){

                return list1.get(0)+list2.get(0);

            }

        }

    }

    public static void test(){
        final DeadLock d = new DeadLock();

        Thread t1 = new Thread(){
            @Override
        public void run(){
                for (int i = 0; i < 10000; i++) {
                    d.add("A"+i);
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 10000; i++) {
                    System.out.println( d.read());
                }
            }
        };

        t1.start();
        t2.start();
    }

}
