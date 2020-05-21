package TrabalhoFinal;

public class Main {
    private static final int V1 = 0;
    private static final int V2 = 1;
    private static final int V3 = 2;
    private static final int V4 = 3;
    private static final int V5 = 4;
    private static final int V6 = 5;
    private static final int V7 = 6;
    private static final int V8 = 7;
    private static final int V9 = 8;
    private static final int V10 = 9;
    private static final int V11 = 10;
    private static final int V12 = 11;

    private static final int QTDE_VERTICES = 12;

    public Main() {
        Grafo grafo = new Grafo(QTDE_VERTICES);
        grafo.criaAresta(V1, V2, 5);
        grafo.criaAresta(V1, V3, 9);
        grafo.criaAresta(V1, V4, 1);
        grafo.criaAresta(V1, V5, 10);
        grafo.criaAresta(V2, V6, 2);
        grafo.criaAresta(V3, V7, 3);
        grafo.criaAresta(V3, V8, 2);
        grafo.criaAresta(V4, V8, 9);
        grafo.criaAresta(V5, V9, 1);
        grafo.criaAresta(V5, V10, 3);
        grafo.criaAresta(V6, V11, 6);
        grafo.criaAresta(V7, V12, 4);
        grafo.criaAresta(V8, V12, 7);
        grafo.criaAresta(V9, V12, 3);
        grafo.criaAresta(V10, V12, 4);


        System.out.println("Caminho de custo mínimo");
        for (Integer i : grafo.caminho(V1, V12)) {
            System.out.print((i + 1) + " -> ");
        }
        System.out.println("CHEGOU");
    }

}
