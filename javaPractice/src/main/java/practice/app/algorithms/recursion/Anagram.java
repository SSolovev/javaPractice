/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app.algorithms.recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sergey
 */
public class Anagram {

    static Set<String> anagramSet = new HashSet<String>();

    public static void anagramTest() {
        String str = "cats";
        doAnagram(str.toCharArray().length, str.toCharArray());
        System.out.println(anagramSet.toString());
    }

    public static void rotate(int newSize, char[] str) {
        char tmp = str[str.length- newSize];
        for (int i =str.length- newSize+1; i < str.length; i++) {
            str[i - 1] = str[i];

        }
        str[str.length - 1] = tmp;
    }

    public static void doAnagram(int newSize, char[] str) {

        if (newSize == 1) {
            return;
        }

        for (int i = 0; i < newSize; i++) {

            doAnagram(newSize-1, str);
//                                anagramSet.add(new String(str));
            rotate(newSize, str);

            anagramSet.add(new String(str));
        }

    }
}
