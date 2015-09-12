package practice.app.algorithms.linkedlist;

import java.util.Stack;

/**
 * Created by SeASolovev on 12.09.2015.
 */
public class LinkedNode {
    Node begin;
    Node end;

    public LinkedNode() {
//        begin = end = new Node();
    }

    public void push(String s) {
        if (begin == null) {
            begin = end = new Node();
            end.val = s;
        } else {
            Node newNode = new Node();
            newNode.val = s;
            end.next = newNode;
            end = newNode;
        }
    }

    public void print() {
        Node n = begin;

        while (n != null) {
            System.out.println(n.val);
            n = n.next;
        }
    }

    public void reverse(){
        Node node = begin;
        Stack<Node> s = new Stack<>();

        while (node!=null){
            s.push(node);
            node=node.next;
        }
        begin=node=s.pop();
        while(!s.isEmpty()){
            node.next=s.pop();
            node=node.next;
        }
        end=node;
        node.next=null;
    }
}
