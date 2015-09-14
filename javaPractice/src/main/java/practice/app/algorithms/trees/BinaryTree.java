package practice.app.algorithms.trees;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by SeASolovev on 12.09.2015.
 */
public class BinaryTree {
    public TreeNode begin;

    public void insert(int value) {
        TreeNode node = new TreeNode();
        node.val = value;

        if (begin == null) {
            begin = node;
        } else {
            TreeNode temp = begin;
            while (true) {
                if (value > temp.val) {
                    if (temp.right == null) {
                        temp.right = node;
                        return;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    if (temp.left == null) {
                        temp.left = node;
                        return;
                    } else {
                        temp = temp.left;
                    }
                }
            }
        }
    }

    public void print(TreeNode node) {
        if (node != null) {
            print(node.left);
            System.out.println(node.val);
            print(node.right);
        }
    }

    public void searchInDepth(TreeNode node) {
        Stack<TreeNode> s = new Stack<>();
        Set<TreeNode> visitedSet = new HashSet<>();
        TreeNode tempNode = node;
        while (true) {
            if (tempNode != null) {

                if (tempNode.right != null && !visitedSet.contains(tempNode.right)) {
                    s.push(tempNode);
                    visitedSet.add(tempNode);
                    tempNode = tempNode.right;
                } else if (tempNode.left != null && !visitedSet.contains(tempNode.left)) {
                    s.push(tempNode);
                    visitedSet.add(tempNode);
                    tempNode = tempNode.left;
                } else {
                    if(!visitedSet.contains(tempNode)){
                        visitedSet.add(tempNode);
                        s.push(tempNode);
                        System.out.println(s.toString());
                        s.pop();
                    }

                    tempNode = s.pop();
                    if (tempNode == node) {
                        return;
                    }
                }
            }
        }


    }
}
