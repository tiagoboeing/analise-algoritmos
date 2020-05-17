package TrabalhoFinal;

public class ExemploTrabalho {
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
    private static final int V13 = 12;
    private static final int V14 = 13;
    private static final int V15 = 14;

    private static final int QTDE_VERTICES = 15;

    public ExemploTrabalho() {
        Grafo grafo = new Grafo(QTDE_VERTICES);
        grafo.criaAresta(V1, V2, 2);
        grafo.criaAresta(V1, V3, 6);
        grafo.criaAresta(V1, V4, 4);
        grafo.criaAresta(V2, V5, 4);
        grafo.criaAresta(V2, V6, 3);
        grafo.criaAresta(V2, V7, 1);
        grafo.criaAresta(V3, V7, 4);
        grafo.criaAresta(V3, V8, 3);
        grafo.criaAresta(V4, V9, 7);
        grafo.criaAresta(V5, V10, 7);
        grafo.criaAresta(V6, V10, 2);
        grafo.criaAresta(V7, V11, 5);
        grafo.criaAresta(V8, V11, 1);
        grafo.criaAresta(V9, V12, 3);
        grafo.criaAresta(V9, V15, 5);
        grafo.criaAresta(V10, V13, 5);
        grafo.criaAresta(V11, V14, 6);
        grafo.criaAresta(V12, V14, 6);

        System.out.println("Caminho de custo mínimo da entrada (1) até a saída (14)");
        for (int a = 0; a < QTDE_VERTICES; a++) {
            for (Integer i : grafo.caminho(V1, V14)) {
                System.out.print((i + 1) + " -> ");
            }
            System.out.println("CHEGOU");
        }
    }

}
