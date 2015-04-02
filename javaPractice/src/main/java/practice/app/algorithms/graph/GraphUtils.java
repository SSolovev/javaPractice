/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app.algorithms.graph;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author sergey
 */
public class GraphUtils {

    public static void checkDFS() {
        Graph g = new Graph(14);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 7);
        g.addEdge(2, 8);

        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(3, 6);
        g.addEdge(3, 7);
        g.addEdge(4, 5);
        g.addEdge(5, 6);

        g.addEdge(7, 8);

        g.addEdge(9, 10);
        g.addEdge(9, 13);
        g.addEdge(10, 11);
        g.addEdge(10, 12);

        g.addEdge(11, 12);
        g.addEdge(12, 13);

        g.toString();

        System.out.println("------------------");
        DepthFirstSearch d = new DepthFirstSearch(g, 0);
        System.out.println(d.hasPathTo(6));
        System.out.println(d.pathTo(7));
        System.out.println("------------------");
        Stack s = d.pathToFromBook(7);
        while (!s.empty()) {
            System.out.println(s.pop());
        }
        System.out.println("------------------");
        ConnectionComponents cc = new ConnectionComponents(g, 0);
        System.out.println("cc.isConnected(8, 9)" + cc.isConnected(8, 9));
        System.out.println("cc.isConnected(2, 6)" + cc.isConnected(2, 6));
        System.out.println("cc.isConnected(7, 12)" + cc.isConnected(7, 12));
        System.out.println(Arrays.toString(cc.id));
    }

    public static int degree(Graph G, int v) {
        int degree = 0;
        for (Integer i : G.adj(v)) {
            degree++;
        }
        return degree;

    }

    public static int maxDegree(Graph G) {
        int max = 0;
        for (int i = 0; i < G.V(); i++) {
            int temp = degree(G, i);
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }

    public static double averageDegree(Graph G) {
        return 2.0 * G.E() / G.V();
    }

    public static int numberOfSelfLoops(Graph G) {
        int count = 0;
        for (int v = 0; v < G.V(); v++) {
            for (int w : G.adj(v)) {
                if (v == w) {
                    count++;

                }

            }
        }
        return count / 2;
    }
}
