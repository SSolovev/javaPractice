package practice.app.algorithms.struct;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by SeASolovev on 15.04.2015.
 */
public class PostfixCalculation {

public static int calc(int v1,int v2, Operands op){
    switch (op) {
        case PLUS:
            return  v1+v2;
        case MINUS:
            return  v1-v2;
        case MULTIPLY:
            return  v1*v2;
        case DIVIDE:
            return  v1/v2;
    }
    return 0;
}
public static void calculate(String expression){
    String[] arrayOfDigits = expression.split("[\\+-/*]");
    String[] arrayOfOperands= expression.split("[\\d]");
    System.out.println(Arrays.toString(arrayOfDigits));
    System.out.println(Arrays.toString(arrayOfOperands));

    Queue<Integer> digitQ = new LinkedList<>();
    Queue<Operands> operandsQ = new LinkedList<>();
    for(String s : arrayOfDigits){
        digitQ.offer(Integer.parseInt(s));
    }
    for(String s : arrayOfOperands){
        s=s.trim();
        if(!s.equals("")){
            operandsQ.offer(Operands.fromString(s));
        }

    }
    Integer res=null;
    while(!digitQ.isEmpty()){
        if(res==null){
            res=calc(digitQ.poll(),digitQ.poll(),operandsQ.poll());
        }else{
            res=calc(res,digitQ.poll(),operandsQ.poll());
        }

    }
    System.out.println("Result: "+res);
}
}
