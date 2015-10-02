package practice.app.euler;

import java.util.*;

/**
 * Created by SeASolovev on 01.10.2015.
 */
public class Problems {

    static String staticStr = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08 " +
            "49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00 " +
            "81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65 " +
            "52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91 " +
            "22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 " +
            "24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50 " +
            "32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 " +
            "67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21 " +
            "24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 " +
            "21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95 " +
            "78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92 " +
            "16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57 " +
            "86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58 " +
            "19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40 " +
            "04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66 " +
            "88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69 " +
            "04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36 " +
            "20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16 " +
            "20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54 " +
            "01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48 ";
    public void test() {
        //==================
        //---=== № 1 ===---
        //==================
        List<Integer> l = Arrays.asList(3, 5);
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % l.get(0) == 0 || i % l.get(1) == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        //==================
        //---=== № 2 ===---
        //==================
//        int sum = 0;
//        int prev = 1;
//        int next = 0;
//        for (int i = 2; i < 4_000_000; ) {
//            if(i%2==0){
//                sum += i;
//
//
//            }
//            next = i + prev;
//            prev = i;
//            i = next;
//        }
//        System.out.println(sum);

        //==================
        //---=== № 3 ===---
        //==================
//        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
//        long num = 600851475143l;
//        int delimeter = 2;
//        while (num > 1) {
//            if (num % delimeter == 0) {
//                q.add(delimeter);
//                num = num / delimeter;
//            }
//            if (delimeter == 2) {
//                delimeter += 1;
//            } else {
//                delimeter += 2;
//            }
//
//
//        }
//        System.out.println(q.peek());


        //==================
        //---=== № 4 ===---
        //==================

        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int multiply = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                multiply = i * j;
                if (isPalindrome(multiply)) {
                    q.add(multiply);
                }
            }
        }
        System.out.println(q.peek());


        //==================
        //---=== № 5 ===---
        //==================
        int number = 20;

        while (number < Integer.MAX_VALUE) {
            if (isDelimetered(number)) {
                System.out.println(number);
                return;
            }
            number++;
        }

        //==================
        //---=== № 8 ===---//TODO
        //==================
        String s = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        char[] charArray = s.toCharArray();
        int product = 0;
        StringBuilder sequence = new StringBuilder();
        int maxDigits = 13;
        for (int i = 0; i <= charArray.length - maxDigits; i++) {
            int bufProduct = 1;
            StringBuilder seq = new StringBuilder();

            for (int j = i; j < i + maxDigits; j++) {
                bufProduct *= Character.getNumericValue(charArray[j]);
                seq.append("*");
                seq.append(charArray[j]);
            }
            if (bufProduct > product) {
                product = bufProduct;
                sequence = seq;
            }
        }
        System.out.println(product);
        System.out.println(sequence.toString());
//========================================

        //==================
        //---=== № 9 ===---
        //==================
//        for (int a = 1; a < 1000; a++) {
//            for (int b = a + 1; b < 1000; b++) {
//                for (int c = b + 1; c < 1000; c++) {
//
//                    if (isPithagoric(a, b, c) && (a+b+c)==1000) {
//                        System.out.println(a+" "+b+" "+c);
//                        System.out.println(a*b*c);
//                        return;
//                    }
//                }
//            }
//        }
//    }
//
//    public static boolean isPithagoric(int a, int b, int c) {
//        return (Math.pow((double) a, 2.0) + Math.pow((double) b, 2.0)) == Math.pow((double) c, 2.0);
//    }
        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                if (1000_000 - 2000 * a - 2000 * b + 2 * a * b == 0) {
                    System.out.println(a + " " + b + " " + (1000 - a - b));
                    System.out.println(a * b * (1000 - a - b));
                }
            }
        }


        //==================
        //---=== № 10===---
        //==================
        l = new ArrayList<>();
        for (int i = 2; i < 2000_000; i++) {
            if (isPrime(i)) {
                l.add(i);
            }
        }
        System.out.println("CALCULATED!");
        Long summ = 0l;
        for (int a : l) {
            summ += a;
        }

        //==================
        //---=== № 11===---
        //==================
        String[] sArr = staticStr.split(" ");
        int[][] a = new int[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                a[i][j] = Integer.valueOf(sArr[20 * i + j]);
            }
        }
        System.out.println(Arrays.deepToString(a));
        int res = 0;
        int tempRes = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                tempRes = calcRight(i, j, a);
                if (tempRes > res) {
                    res = tempRes;
                    System.out.println("Right: " + i + "--" + j);
                }
                tempRes = calcLeft(i, j, a);
                if (tempRes > res) {
                    res = tempRes;
                    System.out.println("Left: " + i + "--" + j);
                }
                tempRes = calcDown(i, j, a);
                if (tempRes > res) {
                    res = tempRes;
                    System.out.println("Down: " + i + "--" + j);
                }
                tempRes = calcUp(i, j, a);
                if (tempRes > res) {
                    res = tempRes;
                    System.out.println("Up: " + i + "--" + j);
                }
                tempRes = calcDiagRightDown(i, j, a);
                if (tempRes > res) {
                    res = tempRes;
                    System.out.println("DiagonalRightDown: " + i + "--" + j);
                }
                tempRes = calcDiagRightUp(i, j, a);
                if (tempRes > res) {
                    res = tempRes;
                    System.out.println("DiagonalRightUp: " + i + "--" + j);
                }
                tempRes = calcDiagLeftUp(i, j, a);
                if (tempRes > res) {
                    res = tempRes;
                    System.out.println("DiagonalLeftUp: " + i + "--" + j);
                }
                tempRes = calcDiagLeftDown(i, j, a);
                if (tempRes > res) {
                    res = tempRes;
                    System.out.println("DiagonalLeftDown: " + i + "--" + j);
                }

            }
        }
        System.out.println(res);

        //==================
        //---=== № 11===---
        //==================
    }

    public static boolean isPalindrome(int number) {
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(number);
        int shift = 0;
        if (s.length() % 2 != 0) {
            shift += 1;
        }

        String s1 = s.substring(0, s.length() / 2);
        String s2 = sb.append(s.substring(s.length() / 2 + shift, s.length())).reverse().toString();

        return s1.equals(s2);
    }

    public static boolean isDelimetered(int number) {
        for (int i = 1; i <= 20; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        }
        for (int delim = 3; delim < num; delim = delim + 2) {
            if (num % delim == 0) {
                return false;
            }

        }
        return true;
    }
    public static int calcRight(int i, int j, int[][] arr) {
        int sum = 1;
        if (arr[i].length - j >= 4) {
            for (int a = j; a < j + 4; a++) {
                sum *= arr[i][a];
            }
        }
        return sum;
    }

    public static int calcLeft(int i, int j, int[][] arr) {
        int sum = 1;
        if (j >= 3) {
            for (int a = j; a > j - 4; a--) {
                sum *= arr[i][a];
            }
        }
        return sum;
    }

    public static int calcDown(int i, int j, int[][] arr) {
        int sum = 1;
        if (arr.length - i >= 4) {
            for (int a = i; a < i + 4; a++) {
                sum *= arr[a][j];
            }
        }
        return sum;
    }

    public static int calcUp(int i, int j, int[][] arr) {
        int sum = 1;
        if (i >= 3) {
            for (int a = i; a > i - 4; a--) {
                sum *= arr[a][j];
            }
        }
        return sum;
    }

    public static int calcDiagRightDown(int i, int j, int[][] arr) {
        int sum = 1;
        if (arr.length - i >= 4 && arr[i].length - j >= 4) {
            for (int a = i, b = j; a < i + 4 && b < j + 4; a++, b++) {
                sum *= arr[a][b];
            }
        }
        return sum;
    }

    public static int calcDiagRightUp(int i, int j, int[][] arr) {
        int sum = 1;
        if (i >= 3 && arr[i].length - j >= 4) {
            for (int a = i, b = j; a > i - 4 && b < j + 4; a--, b++) {
                sum *= arr[a][b];
            }
        }
        return sum;
    }
    //    =======================================
    public static int calcDiagLeftDown(int i, int j, int[][] arr) {
        int sum = 1;
        if (arr.length - i >= 4 && j >= 3) {
            for (int a = i, b = j; a < i + 4 && b > j - 4; a++, b--) {
                sum *= arr[a][b];
            }
        }
        return sum;
    }
    public static int calcDiagLeftUp(int i, int j, int[][] arr) {
        int sum = 1;
        if (i >= 3 && j >= 3) {
            for (int a = i, b = j; a > i - 4 && b > j - 4; a--, b--) {
                sum *= arr[a][b];
            }
        }
        return sum;
    }
}
