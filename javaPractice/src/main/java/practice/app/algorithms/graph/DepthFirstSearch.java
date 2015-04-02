/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app.algorithms.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author sergey
 */
public class DepthFirstSearch {

    private boolean[] marked;
    private int[] path;
    private int start;

    List<Integer> listForTest = new ArrayList<>();

    public DepthFirstSearch(Graph g, int startVertex) {
        marked = new boolean[g.V()];
        path = new int[g.V()];
        this.start = startVertex;
        dfsSearch(g, startVertex);

//        System.out.println(Arrays.toString(marked));
//        System.out.println("Path : " + Arrays.toString(path));

    }

    public void dfsSearch(Graph g, int startVertex) {
        listForTest.add(startVertex);
        marked[startVertex] = true;
        for (Integer neighbor : g.adj(startVertex)) {
            if (!marked[neighbor]) {
                path[neighbor] = startVertex;
                dfsSearch(g, neighbor);
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public List<String> pathTo(int v) {
        List<String> l = new ArrayList<>();
        do {
            l.add(v + " - " + path[v]);
            v = path[v];
        } while (v != 0 || v != start);
        return l;
    }

    public Stack<String> pathToFromBook(int v) {
        if (!hasPathTo(v)) {
            return null;
        }

        Stack<String> res = new Stack<>();
        for (int i = v; i != start; i = path[i]) {
            res.push(i + " - " + path[i]);
        }
        return res;
    }
}
