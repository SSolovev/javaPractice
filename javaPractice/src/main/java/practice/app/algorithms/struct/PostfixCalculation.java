package practice.app.algorithms.struct;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by SeASolovev on 15.04.2015.
 */
public class PostfixCalculation {


    public static String makePostfixForSimpleExpression(char[] chars) {
        String output = "";
        int priorityBonus = 0;
        Stack<Operator> opStack = new Stack<>();
        for (char c : chars) {
            if (c >= '0' && c <= '9') {
                output += c;
            } else {
                switch (c) {
                    case '(':
                        priorityBonus += 2;
                        continue;
                    case ')':
                        priorityBonus -= 2;
                        continue;
                    default:

                }
                Operator newOperator = Operator.fromChar(c, priorityBonus);
                if (!opStack.isEmpty()) {
                    while (!opStack.isEmpty() && opStack.peek().getPriority() >= (newOperator.getPriority())) {
                        output += opStack.pop();
                    }
                }

                opStack.push(newOperator);

//                switch (c) {
//                    case '*':
//                    case '/':
//                        Operator newOperator = Operator.fromChar(c);
//                        Operator oldOperator = opStack.peek();
//                        if (oldOperator.getPriority() > newOperator.getPriority()) {
//                            while (!opStack.isEmpty()) {
//                                output += opStack.pop();
//                            }
//                        }
//                        opStack.push(newOperator);
//                        break;
//                    case '+':
//                    case '-':
//                        opStack.push(Operator.fromChar(c));
//                        break;
//
//                }
            }
        }

        while (!opStack.isEmpty()) {
            output += opStack.pop();
        }

        return output;
    }


//    public static int calc(int v1, int v2, Operator op) {
//        switch (op) {
//            case PLUS:
//                return v1 + v2;
//            case MINUS:
//                return v1 - v2;
//            case MULTIPLY:
//                return v1 * v2;
//            case DIVIDE:
//                return v1 / v2;
//        }
//        return 0;
//    }

//    public static void calculate(String expression) {
//        String[] arrayOfDigits = expression.split("[\\+-/*]");
//        String[] arrayOfOperands = expression.split("[\\d]");
//        System.out.println(Arrays.toString(arrayOfDigits));
//        System.out.println(Arrays.toString(arrayOfOperands));
//
//        Queue<Integer> digitQ = new LinkedList<>();
//        Queue<Operator> operandsQ = new LinkedList<>();
//        for (String s : arrayOfDigits) {
//            digitQ.offer(Integer.parseInt(s));
//        }
//        for (String s : arrayOfOperands) {
//            s = s.trim();
//            if (!s.equals("")) {
//                operandsQ.offer(Operator.fromString(s));
//            }
//
//        }
//        Integer res = null;
//        while (!digitQ.isEmpty()) {
//            if (res == null) {
//                res = calc(digitQ.poll(), digitQ.poll(), operandsQ.poll());
//            } else {
//                res = calc(res, digitQ.poll(), operandsQ.poll());
//            }
//
//        }
//        System.out.println("Result: " + res);
//    }
}
