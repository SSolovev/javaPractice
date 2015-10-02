package practice.app.threads;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SeASolovev on 28.09.2015.
 */
public class MapTest {
    public void start() {
        final Map<String, Integer> map = new HashMap<>();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (!isInterrupted()) {
                    synchronized (map) {
                        System.out.println("Begin sync");
                        for (int i = 0; i < 100; i++) {
                            map.put("A", i + 1);
                            map.put("B", i + 2);
                            map.put("C", i + 3);
                        }
                        System.out.println("End sync");
                    }
                    ;

                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (!isInterrupted()) {
                    System.out.println("Start read");
                    for (int i = 0; i < 100; i++) {
                        System.out.println("A = " + map.get("A"));
                        System.out.println("B = " + map.get("B"));
                        System.out.println("C = " + map.get("C"));
                    }
                    System.out.println("End read");
                }
            }
        };
        t1.start();
        t2.start();

        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
        t2.interrupt();

    }

    public void startSyncMap() {
        final Map<Object, Object> map = Collections.synchronizedMap(new HashMap<>());
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (!isInterrupted()) {

                    System.out.println("Begin sync");
                    for (int i = 0; i < 100; i++) {
                        map.put("A", i + 1);
                        map.put("B", i + 2);
                        map.put("C", i + 3);
                    }
                    System.out.println("End sync");
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (!isInterrupted()) {
                    System.out.println("Start read");
                    for (int i = 0; i < 100; i++) {
                        System.out.println("A = " + map.get("A"));
                        System.out.println("B = " + map.get("B"));
                        System.out.println("C = " + map.get("C"));
                    }
                    System.out.println("Finished read");
                }
            }
        };
        t1.start();
        t2.start();

        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
        t2.interrupt();

    }

    public void startSyncBlocks() {
        final Map<Object, Object> map = Collections.synchronizedMap(new HashMap<>());
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (!isInterrupted()) {
                    synchronized (map) {
                        System.out.println("Begin sync");
                        for (int i = 0; i < 100; i++) {
                            map.put("A", i + 1);
                            map.put("B", i + 2);
                            map.put("C", i + 3);
                        }
                        System.out.println("End sync");
                    }

                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                while (!isInterrupted()) {
                    synchronized (map) {
                        System.out.println("Start read");
                        for (int i = 0; i < 100; i++) {
                            System.out.println("A = " + map.get("A"));
                            System.out.println("B = " + map.get("B"));
                            System.out.println("C = " + map.get("C"));
                        }
                        System.out.println("Finished read");
                    }
                }
            }
        };
        t1.start();
        t2.start();

        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
        t2.interrupt();

    }
}
