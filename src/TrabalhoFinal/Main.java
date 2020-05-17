package TrabalhoFinal;

import java.util.*;

public class Main {
    ArrayList<Vertex> vertexList = new ArrayList<Vertex>();
    ArrayList<Distance> distancesList = new ArrayList<Distance>();
    Map<String, Integer> discoveryDistances = new HashMap<>(); // for dynamic programming

    public Main() {
        this.initVertexList();
        this.fillDistances();

        // FIXME: remove this
//        this.showDistances();

        this.distancesList.forEach(el -> {
            Integer lastVertex = 1;

            while(lastVertex != null){


                if (el.getVertexB() != null) {
                    String key = String.format("%s-%s", el.getVertexA().vertex, el.getVertexB().vertex); // 1-2; 2-5... 10-13
                    this.discoveryDistances.put(key, el.getValue());
                }

            }


        });

    }

    /**
     * Fill vertextList with 14 elements - 1st to 15th vertex
     */
    public void initVertexList() {
        for (int i = 1; i <= 15; i++) {
            this.vertexList.add(new Vertex(i));
        }
    }

    public void fillDistances() {
        // vertex 1
        this.distancesList.add(new Distance(new Vertex(1), new Vertex(2), 2));
        this.distancesList.add(new Distance(new Vertex(1), new Vertex(3), 6));
        this.distancesList.add(new Distance(new Vertex(1), new Vertex(4), 4));

        // vertex 2
        this.distancesList.add(new Distance(new Vertex(2), new Vertex(5), 4));
        this.distancesList.add(new Distance(new Vertex(2), new Vertex(6), 3));
        this.distancesList.add(new Distance(new Vertex(2), new Vertex(7), 1));

        // vertex 3
        this.distancesList.add(new Distance(new Vertex(3), new Vertex(7), 4));
        this.distancesList.add(new Distance(new Vertex(3), new Vertex(8), 3));

        // vertex 4
        this.distancesList.add(new Distance(new Vertex(4), new Vertex(9), 7));

        // vertex 5
        this.distancesList.add(new Distance(new Vertex(5), new Vertex(10), 7));

        // vertex 6
        this.distancesList.add(new Distance(new Vertex(6), new Vertex(10), 2));

        // vertex 7
        this.distancesList.add(new Distance(new Vertex(7), new Vertex(11), 5));

        // vertex 8
        this.distancesList.add(new Distance(new Vertex(8), new Vertex(11), 1));

        // vertex 9
        this.distancesList.add(new Distance(new Vertex(9), new Vertex(12), 3));
        this.distancesList.add(new Distance(new Vertex(9), new Vertex(15), 5));

        // vertex 10
        this.distancesList.add(new Distance(new Vertex(10), new Vertex(13), 5));

        // vertex 11
        this.distancesList.add(new Distance(new Vertex(11), new Vertex(14), 6));

        // vertex 12
        this.distancesList.add(new Distance(new Vertex(12), new Vertex(14), 6));
    }

    public void showDistances() {
        this.distancesList.forEach(p -> System.out.format(
                "Vertex %s → Vertex %s = %s \n",
                p.getVertexA().getVertex(),
                p.getVertexB().getVertex(),
                p.getValue()
        ));
    }
}
