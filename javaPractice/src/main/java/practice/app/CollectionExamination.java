/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import practice.app.model.Child1;
import practice.app.model.Parent1;

/**
 *
 * @author sergey
 */
public class CollectionExamination {

    public static void testSet() {
        Set<Parent1> iSet = new TreeSet<Parent1>();
//        iSet.add(1);
        iSet.add(new Child1());
        iSet.add(new Parent1());
        for (Object o : iSet) {
            System.out.println(o);
        }

    }

    public static void testList() {
        List<Integer> iList = new ArrayList<>();
        iList.add(1);
        iList.add(new Integer(2));
        printAndAdd(iList);

    }

    public static void testList2() {
        List<Integer> iList1 = new ArrayList<>();

        iList1.add(1);
        iList1.add(new Integer(2));

        List<Long> iList2 = new ArrayList<>();
        iList2.add(11l);
        iList2.add(new Long(22));
//        iList2.add(new Object());

        List<Object> iList3 = new ArrayList<>();
        iList3.add(11l);
        iList3.add(new Object());

        List iList4 = new ArrayList();
        iList4.add(11l);
        iList4.add(new Object());
        iList4.add("qwe");
        iList4 = iList2;
        iList4.add("qwe");
        List<Parent1> p1 = iList4;
        System.out.println("p1: "+p1);
        for(Object p: p1){
            System.out.println("p"+p);
        }
        printAndAddLong(iList4);

        List<Number> n = new ArrayList<>();
        n.addAll(iList1);
        n.addAll(iList2);

        printAndAddWildcard(n);

        printAndAddObject(iList3);
        printAndAddObject(iList4);
//        printAndAddObject(iList2);

        printAndAdd(iList3);
        printAndAdd(iList4);
        printAndAdd(iList2);

        List<? super Integer> iList5 = new ArrayList<Number>();
        List<? super Integer> iList6 = new ArrayList<Integer>();

        List<? super Number> iList7 = new ArrayList<Number>();
//        List<? super Number> iList8 = new ArrayList<Integer>();
//        List<? super Number> iList7 = new ArrayList<Long>();
        iList5.add(new Integer(3));
//        iList5.add((Number)new Long(33));
        Object nn = iList5.get(0);
//        Number nn =iList5.get(0);
//        Integer nn =iList5.get(0);
        iList6.add(new Integer(3));
//        iList6.add((Number)new Long(33));
    }

    public static List<? super Integer> printAndAddWildcard2(List<? super Integer> l) {
        l.add(new Integer(4));
//        l.add((Number)new Double(1.1));
//        l.add(new Long(10));
        for (Object o : l) {
            System.out.println(o);
        }
        return l;
    }

    public static List<? super Number> printAndAddWildcard(List<? super Number> l) {
        l.add(new Integer(4));
        l.add(new Long(10));
//         l.add(new Object());
//                  l.add(new Parent1());
//          l.add(new Child1());
//           l.add(new Object());
        for (Object o : l) {
            System.out.println(o);
        }
        return l;
    }

    public static void printAndAddObject(List<Object> l) {
        l.add(new Object());
        for (Object o : l) {
            System.out.println(o);
        }
    }

    public static void printAndAddLong(List<Long> l) {
        l.add(new Long(33));
        for (Object o : l) {
            System.out.println(o);
        }
    }

    public static void printAndAdd(List l) {
        l.add(new Object());
        for (Object o : l) {
            System.out.println(o);
        }
    }
}
