/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app.algorithms.recursion;

import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author sergey
 */
public class Backpack {

//    int size;
//    int[] items;
//
//    public Backpack(int bagSize, int[] items) {
//        size = bagSize;
//        this.items = items;
//    }
//
    public static Stack<Integer> calculateBag(int[] items, int needSize) {
        Stack<Integer> indexes = calculateBagRecursively(items, needSize, new Stack());
        Stack<Integer> res = new Stack<Integer>();
        while (!indexes.isEmpty()) {
            res.push(items[indexes.pop()]);
        }
        return res;
    }

    ;
    public static Stack<Integer> calculateBagRecursively(int[] items, int needSize, Stack<Integer> usedIndex) {
//        Stack temp = new Stack();
        for (int i = 0; i < items.length; i++) {
//            temp.clear();
//            temp.addAll(usedIndex);
            if (usedIndex.contains(i)) {
                continue;
            }
            if (needSize - items[i] > 0) {
                Stack temp = new Stack();
                temp.addAll(usedIndex);
                temp.push(i);
                Stack tmp = calculateBagRecursively(items, needSize - items[i], temp);
                if (!tmp.isEmpty()) {
                    return tmp;
                }
            } else if (needSize - items[i] == 0) {
                Stack temp = new Stack();
                temp.addAll(usedIndex);
                temp.push(i);
                return temp;
            }
//            else{
//            usedIndex=new Stack();
//            }
        }
        return new Stack();
    }

    public static Stack<Integer> calculateBagStack(int[] items, int needSize) {

        int tempSize = needSize;
        for (int i = 0; i < items.length; i++) {
            Stack<Integer> stack = new Stack();
            tempSize = needSize - items[i];
            if (tempSize == 0) {
                stack.push(items[i]);
                return stack;
            } else if (tempSize > 0) {
                stack.push(items[i]);
            } else {
                continue;
            }
            for (int j = 0; j < items.length; j++) {
                if (j == i) {
                    continue;
                } else if (tempSize - items[j] == 0) {
                    tempSize = tempSize - items[j];
                    stack.push(items[j]);
                    return stack;
                } else if (tempSize - items[j] > 0) {
                    tempSize = tempSize - items[j];
                    stack.push(items[j]);
                } else {
                    continue;
                }

            }

        }

        return new Stack();
    }

}
