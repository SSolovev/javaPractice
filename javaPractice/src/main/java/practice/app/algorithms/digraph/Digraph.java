/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app.algorithms.digraph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import practice.app.algorithms.graph.Bag;

/**
 *
 * @author sergey
 */
public class Digraph {

    private int V;
    private int E;
    private Bag<Integer>[] adj;

    public Digraph(int V) {
        adj = new Bag[V];
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public Digraph reverse() {
        Digraph rev = new Digraph(V);
        for (int i = 0; i < V; i++) {
            for (Integer j : adj(i)) {
                rev.addEdge(j, i);
            }

        }
        return rev;
    }

    @Override
    public String toString() {
        return null;
    }
}
