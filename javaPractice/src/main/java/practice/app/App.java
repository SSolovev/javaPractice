package practice.app;

import java.io.FileNotFoundException;
import java.io.IOException;

import practice.app.algorithms.sort.bubble.BubbleSort;
import practice.app.model.Apple;
import practice.app.model.food.Fruit;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import practice.app.algorithms.graph.DepthFirstSearch;
import practice.app.algorithms.graph.Graph;
import practice.app.algorithms.graph.GraphUtils;
import practice.app.threads.DeadLock;

/**
 * Hello world!
 */
public class App implements Serializable {

    public static void main(String[] args) throws IOException, FileNotFoundException {
//        GraphUtils.checkSymbolGraph();
//        DeadLock.test();
int[] a ={1,6,8,7,9,0};
        BubbleSort.bubleSort(a);
        System.out.println(Arrays.toString(a));
//        Map<String,String> m =new HashMap<>();
//        m.put(null,null);
//        m.put(null,"W1");
//        m.put(null,"W2");
//        m.put("WW1",null);
//        m.put("WW2",null);
//
//        System.out.println(m);
//        System.out.println(m.get(null));
//        Set<String> s =new HashSet<>();
//        s.add("Q1");
//        s.add(null);
//        s.add("Q2");
//        s.add(null);
//
//        System.out.println(s);
    }




    public static void assigmentCheck(){
        long x = 42L;
        long y = 44L;

        System.out.print(" " + 7 + 2 + " ");
//        System.out.print(foo() + x + 5 + " ");
//        System.out.print(x + y + foo());

        final  char a ='a';
        int i = 100000;

        switch(i){
            case 2:
                System.out.println("2");
                break;
            case 3 :
                System.out.println("3");
                break;
            case a:
                System.out.println("1");
                break;
            case 'c':
                System.out.println("C");

        }}
    public static int returnInt(byte l) {
        return l;
    }

    public static void fillRandomArrayAndFindMaxElementPosition() {
        int[] ar = new int[1000];
        ForkJoinPool p = new ForkJoinPool();
        p.invoke(new RandomInitRecursiveAction(ar, 0, 1000));
        System.out.println("ar: " + ar.length);
        System.out.println("ar[998]=" + ar[998]);
        int res = p.invoke(new FindMaxPositionRecursiveTask(ar, 0, 1000));
        System.out.println("res: " + res);
        System.out.println("ar[res]=" + ar[res]);
    }

    private static void localeCheck() {
        Locale.setDefault(new Locale("en_US"));
        Locale locale = new Locale("ru", "RU");
        Locale locale2 = new Locale("tu", "RU");

        ResourceBundle rb = ResourceBundle.getBundle("Bundle", locale2);

        System.out.println(rb.getString("testKey"));
    }

    private static void inheritanceCheck() {
        System.out.println("Hello World!!");
        Apple a = new Apple();
        a.printFruit();
        Fruit b = new Apple();
        b.printFruit();
    }

    private static void regexpCheck() {
        String patternString = "\\d*";
        String checkString = "dw123 678sd 8 9432";
        Pattern p = Pattern.compile(patternString);
        Matcher m = p.matcher(checkString);
//        m.find();
//        m.matches();
        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }

    }

    private static void arithmeticCheck() {
        int i = 1 >> 2 + 11 - 2 - 11 << 1;
        System.out.println("i: " + i);

        int a = 6;
        a += ++a + a++;

        a = 6;
        a = ++a + a;
        System.out.println("a: " + a);

        int b = 6;
        b += b++;
        System.out.println("b: " + b);
        b = 6;
        b = b + b++;
        System.out.println("b: " + b);
        b = (1 >> 2) - 2;
        System.out.println("test b: " + b);
    }

    private static void stringCheck() {
        String a = "test";
        a += "1";
        String b = "test1";
        String c = "test1";
//
//
        System.out.println("a == b " + (a == b));
        System.out.println("b == c " + (b == c));
        b = "test2";
        c = "test2";
        System.out.println("b == c " + (b == c));

        String strA = "text";
        String strB = "text";
        strA += "1";
        strB += "1";
        System.out.println(strA != strB);
        strA = "text1";
        strB = "text1";
        System.out.println(strA != strB);
    }

    private static void hashTableCheck() {
        Hashtable ht = new Hashtable();
        ht.put("1", "2");
        ht.put("2", "3");
        ht.put("3", "4");
        ht.put("4", "2");

        System.out.println(ht.contains("1"));
        System.out.println(ht.get("3"));
        HashMap hm = new HashMap();
        hm.put("1", "2");
        hm.put("2", "3");
        hm.put("3", "4");
        hm.put("4", "2");

//        System.out.println(hm("1"));
    }
}
