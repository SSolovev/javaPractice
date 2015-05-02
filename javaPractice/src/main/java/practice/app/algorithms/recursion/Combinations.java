/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app.algorithms.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author sergey
 */
public class Combinations {

    public static void findAllCombinations(char[] items, char[] combi, int combiIndex) {

        for (int i = 0; i < items.length; i++) {

            combi[combiIndex] = items[i];
            if (combi.length - 1 == combiIndex) {
                System.out.println(Arrays.toString(combi));
            } else {
                findAllCombinations(createArrayWithoutIndex(items, i), combi, combiIndex + 1);
            }
        }

    }

    public static void findAllCombinations2(char[] items, char[] combi, int startIndex, int combiIndex) {

        for (int i = startIndex; i < items.length; i++) {

            combi[combiIndex] = items[i];
            if (combi.length - 1 == combiIndex) {
                System.out.println(Arrays.toString(combi));
            } else {
                char tmp = items[i];
                for (int j = startIndex; j < items.length - 1; j++) {
                    items[j + 1] = items[j];
                }
                findAllCombinations2(items, combi, startIndex + 1, combiIndex + 1);
            }
        }

    }

    public static char[] createArrayWithoutIndex(char[] items, int index) {
        char[] tmp = new char[items.length - 1];
        int j = 0;
        for (int i = 0; i < items.length; i++) {
            if (i != index) {
                tmp[j++] = items[i];
            }

        }
        return tmp;
    }

    public static char[] createArrayFromIndex(char[] items, int index) {
        char[] tmp = new char[items.length - index];
        int j = 0;
        for (int i = index; i < items.length; i++) {

            tmp[j++] = items[i];

        }
        return tmp;
    }


    public static List<char[]> union(List<char[]> fullList, List<char[]> withoutLetterList, char c) {
        if (withoutLetterList.size() > 0) {
            for (int i = 0; i < withoutLetterList.size(); i++) {
                char[] t = withoutLetterList.get(i);
                char[] t2 = new char[t.length + 1];
                System.arraycopy(t, 0, t2, 0, t.length);
                withoutLetterList.set(i, t2);
                t2[t2.length - 1] = c;
            }
            fullList.addAll(withoutLetterList);
        }
        return fullList;
    }

    public static List<char[]> subsetCombinations(char[] items, int newSize) {

        if (newSize == 1) {
            List<char[]> res = new ArrayList<>();
            for (char c : items) {
                res.add(new char[]{c});
            }
            return res;
        } else if (items.length == newSize) {
            List<char[]> res = new ArrayList<>();
            res.add(items);
            return res;
        }

        char c = items[0];

        char[] tmp = createArrayWithoutIndex(items, 0);
        List<char[]> full = subsetCombinations(tmp, newSize);
        List<char[]> part = subsetCombinations(tmp, newSize - 1);
        return union(full, part, c);

    }
}
