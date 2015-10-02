package practice.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by SeASolovev on 02.10.2015.
 */
public class MathTools {
    public static Integer calcNOD(int num1, int num2) {
        List<Integer> l1 = calcDevisors(num1);
        List<Integer> l2 = calcDevisors(num2);

        Integer result = 1;
        if (l1.size() < l2.size()) {
            for (Integer i : l1) {
                if (l2.contains(i)) {
                    l2.remove(i);
                    result *= i;
                }
            }
        } else {
            for (Integer i : l2) {
                if (l1.contains(i)) {
                    l1.remove(i);
                    result *= i;
                }
            }
        }
        return result;
    }

    public static Integer calcNOK(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num1;
        } else if (num2 % num1 == 0) {
            return num2;
        }
        List<Integer> l1 = calcDevisors(num1);
        List<Integer> l2 = calcDevisors(num2);

        Integer result = 1;
        List<Integer> resList = new ArrayList<>();
        if (num1 < num2) {
            for (Integer i : l1) {
                if (l2.contains(i)) {
                    l2.remove(i);
                }
                resList.add(i);
            }
            resList.addAll(l2);
        } else {
            for (Integer i : l2) {
                if (l1.contains(i)) {
                    l1.remove(i);
                }
                resList.add(i);
            }
            resList.addAll(l1);
        }
        for (int r : resList) {
            result *= r;
        }
        return result;
    }

    public static List<Integer> calcDevisors(int num) {
        int devisor = 2;
        List<Integer> divisors = new LinkedList<>();
        while (num > 1) {
            if (num % devisor == 0) {
                num = num / devisor;
                divisors.add(devisor);
            } else {
                devisor++;
            }
        }

        return divisors;
    }

    public static void findPrimeNumbers(int num) {
        if (num == 2) {
            System.out.println("It is prime! -- " + num);
            return;
        }
        boolean isPrime;
        for (int i = 2; i <= num; i++) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("It is prime! -- " + i);
            }
        }
    }

    public static int fac(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * fac(value - 1);
        }
    }

    public static int pow(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return a * pow(a, b - 1);
        }

    }

    public static double pow2(int a, int n) {
        double p = 0;
        if (n == 0) {
            p = 1;
        } else if (n < 0) {
            p = 1.0 / (a * pow2(a, (-1 * n) - 1));
        } else if (n % 2 == 0) {
            p = pow2(a, n / 2) * pow2(a, n / 2);
        } else {
            p = a * pow2(a, n - 1);
        }
        return p;
    }
}
