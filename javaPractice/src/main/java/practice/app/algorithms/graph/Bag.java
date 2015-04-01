/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app.algorithms.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sergey
 */
public class Bag<T> implements Iterable {

   private T label;
   private List<T> adjacentList;

    public Bag(T label) {
        this.label = label;
        this.adjacentList = new LinkedList<T>();
    }

    public Bag() {
         this.adjacentList = new LinkedList<T>();
    }

    public void add(T t) {
        adjacentList.add(t);
    }

    @Override
    public Iterator iterator() {
       return adjacentList.iterator();
    }

}
