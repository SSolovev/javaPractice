package practice.app.algorithms.graph;

import java.util.*;

/**
 * Created by SeASolovev on 01.04.2015.
 */
public class BreadthFirstSearch {
    private boolean[] marked;
    private int[] path;
    private int start;

    public BreadthFirstSearch(Graph g, int v) {
        marked = new boolean[g.V()];
        path = new int[g.V()];
        this.start = v;
        bfsFromBook(g, v);
    }

//    public void bfs(Graph g, int s) {
//        path[s]=s;
//        for (int i = s; i < g.V(); i++) {
//            if (!marked[i]) {
//                marked[i] = true;
//                for (int j : g.adj(i)) {
//                    if(path[j]==null){
//                        path[j] = i;
//                    }
//
//
//                }
//            }
//
//        }
//    }

    public void bfsFromBook(Graph g, int s) {
        Queue<Integer> q = new LinkedList<>();
        marked[s] = true;
        q.add(s);

        while (!q.isEmpty()) {
            int localV = q.poll();
            //todo:check this
//            marked[localV] = true;
            for (int k : g.adj(localV)) {

                if (!marked[k]) {

                    path[k]=localV;
                    marked[k] = true;
                    q.add(k);
                }
//                else {
//                    System.out.println("");}
            }

        }

        System.out.println("++");
        System.out.println(Arrays.toString(path));
        System.out.println("++");
    }
    public List pathTo(int v){
        if(!marked[v]) return null;
        List<String> l = new ArrayList<>();
        for(;v!=start;v=path[v]){
            l.add(v + " - " + path[v]);
        }
        return l;
    }
}
