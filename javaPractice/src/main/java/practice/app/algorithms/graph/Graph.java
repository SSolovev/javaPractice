/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.app.algorithms.graph;

/**
 *
 * @author sergey
 */
public class Graph {

    private final int V;
    private Bag<Integer>[] adj; //adjency list
    //create empty graph with V vertices

    public Graph(int V) {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>(v);
        }

    }

//    public Graph(In in){
//    }
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    //find vertices adjacent to v
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int V() {
        return V;
    } // number of vertices

    public int E() {
        return 0;
    }

    public String toString() {
        for (int v = 0; v < this.V(); v++) {
            for (int w : this.adj(v)) {
                System.out.println(v + " - " + w);
            }
        }

        return "";
    }
}
