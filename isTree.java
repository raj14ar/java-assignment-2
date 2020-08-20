import java.util.*;

class isTree {
    private int V;
    private LinkedList<Integer> adj[];
    public isTree(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    public static void main(String args[]) {
        isTree g1 = new isTree(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        if (g1.isTree())
            System.out.println("Graph is Tree");
        else
            System.out.println("Graph is not Tree");
        isTree g2 = new isTree(5);
        g2.addEdge(1, 0);
        g2.addEdge(0, 2);
        g2.addEdge(2, 1);
        g2.addEdge(0, 3);
        g2.addEdge(3, 4);
        if (g2.isTree())
            System.out.println("Graph is Tree");
        else
            System.out.println("Graph is not Tree");
    }
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
    public Boolean isCyclicUtil(int v, Boolean visited[], int parent) {
        visited[v] = true;
        Integer i;
        Iterator<Integer> it = this.adj[v].iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, v))
                    return true;
            } else if (i != parent)
                return true;
        }
        return false;
    }
    public Boolean isTree() {
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
        if (isCyclicUtil(0, visited, -1))
            return false;
        for (int u = 0; u < V; u++)
            if (!visited[u])
                return false;
        return true;
    }
}