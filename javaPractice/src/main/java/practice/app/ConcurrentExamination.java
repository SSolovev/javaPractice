/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author sergey
 */
public class ConcurrentExamination {

    static public void checkCollections() {
        ConcurrentHashMap<String, Integer> cMap = new ConcurrentHashMap<String, Integer>();
        cMap.put("Denis", 20);
        cMap.put("Peter", 14);
        System.out.println("cMap: " + cMap);

        System.out.println("============================");
        cMap.putIfAbsent("Denis", 22);
        System.out.println("cMap: " + cMap);

        System.out.println("============================");
        cMap.putIfAbsent("NewDenis", 22);
        System.out.println("cMap: " + cMap);

        System.out.println("============================");
        cMap.remove("NewDenis", 23);
        System.out.println("cMap: " + cMap);

        System.out.println("============================");
        cMap.remove("KDenis", 22);
        System.out.println("cMap: " + cMap);

        System.out.println("============================");
        cMap.remove("Peter", 14);
        System.out.println("cMap: " + cMap);

        AtomicInteger i = new AtomicInteger();
        System.out.println("AtomicInteger: " + i.addAndGet(9));

        System.out.println("AtomicInteger: " + i.getAndAdd(9));
        System.out.println("AtomicInteger: " + i);

        i.set(1);
        System.out.println("AtomicInteger: " + i);
        i.lazySet(2);
        System.out.println("AtomicInteger: " + i);

    }
    
    public static void lockTest(){
    ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
  Lock l=  rwLock.writeLock();
    
    l.lock();
    }
}
