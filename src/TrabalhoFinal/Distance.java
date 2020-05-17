package TrabalhoFinal;

public class Distance {
    Vertex vertexA;
    Vertex vertexB;
    Integer value;

    public Distance(Vertex vertexA, Vertex vertexB, Integer value) {
        this.setVertexA(vertexA);
        this.setVertexB(vertexB);
        this.setValue(value);
    }

    public Vertex getVertexA() {
        return vertexA;
    }

    public void setVertexA(Vertex vertexA) {
        this.vertexA = vertexA;
    }

    public Vertex getVertexB() {
        return vertexB;
    }

    public void setVertexB(Vertex vertexB) {
        this.vertexB = vertexB;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
