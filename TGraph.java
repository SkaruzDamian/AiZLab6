package aiz.graph;

public class TGraph extends MGraph {

    private int edgeCount;

    public TGraph(int k) {
        super(k);
        
    }

    @Override
    public int getEdgeCount() {
        return edgeCount;
    }

    @Override
    public void writeMatrix() {
        for (int i = 0; i < getVertexCount(); i++) {
            for (int j = 0; j < getVertexCount(); j++) {
                System.out.print(tab[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    public void addEdge(int i, int j) {
        super.addEdge(i, j);
        edgeCount++;
    }

    public boolean isEdge(int i, int j) {
        return super.isEdge(i, j);
    }
}