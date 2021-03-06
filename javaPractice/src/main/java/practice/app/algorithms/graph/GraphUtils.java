/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app.algorithms.graph;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author sergey
 */
public class GraphUtils {

    public static void checkSymbolGraph() {

        SymbolGraph sg = new SymbolGraph(8);
        sg.addEdge("A","B");
        sg.addEdge("A","E");
        sg.addEdge("A","F");

        sg.addEdge("B","A");
        sg.addEdge("B","G");
        sg.addEdge("B","C");

        sg.addEdge("B","G");
        sg.addEdge("C","G");

        sg.addEdge("D","H");
        sg.addEdge("D","G");

        sg.addEdge("E","A");
        sg.addEdge("E","F");

        sg.addEdge("F","E");
        sg.addEdge("F","A");

        sg.addEdge("G","B");
        sg.addEdge("G","D");
        sg.addEdge("G","C");

        sg.addEdge("H","D");
//========================================
        SymbolGraph sg1 = new SymbolGraph(8);
        sg1.addEdge("A","B");
        sg1.addEdge("A","E");

        sg1.addEdge("B","C");
        sg1.addEdge("B","E");
        sg1.addEdge("B","A");

        sg1.addEdge("C","D");
        sg1.addEdge("C","B");
        sg1.addEdge("C","F");

        sg1.addEdge("D","G");
        sg1.addEdge("D","C");
        sg1.addEdge("D","H");

        sg1.addEdge("E","F");
        sg1.addEdge("E","B");
        sg1.addEdge("E","A");

        sg1.addEdge("F","E");
        sg1.addEdge("F","C");
        sg1.addEdge("G","D");
        sg1.addEdge("G","H");
        sg1.addEdge("H","D");
        sg1.addEdge("H","G");
//==============================
        SymbolGraph sg2 = new SymbolGraph(8);
        sg2.addEdge("A","B");
        sg2.addEdge("A","E");



        System.out.println("\ndfs=====================");

        DepthFirstSearch dfs = new DepthFirstSearch(sg.G(),0);
        for(Integer i:dfs.listForTest){
            System.out.print(sg.name(i)+" ");
        }

        System.out.println("\nbfs=====================");
        BreadthFirstSearch bfs = new BreadthFirstSearch(sg1.G(),0);
        for(Integer i:bfs.listForTest){
            System.out.print(sg1.name(i)+" ");
        }

        System.out.println("\nCC=====================");
        ConnectionComponents cc = new ConnectionComponents(sg2.G(),0);
        for(int i: cc.id){
            System.out.print(i+" ");
        }

    }
    public static void checkDFS() {
        Graph g = new Graph(14);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 7);
        g.addEdge(2, 8);

        g.addEdge(3, 4);
//        g.addEdge(3, 5);
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
        System.out.println("======================");
        BreadthFirstSearch b = new BreadthFirstSearch(g, 0);
        List<String> l = b.pathTo(7);
        for (String ls : l) {
            System.out.println(ls);
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
