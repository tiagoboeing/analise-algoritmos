package Trabalho1;

import java.util.ArrayList;

public class Main {

//    private int[] list1 = new int[11];
//    private int[] list2 = new int[21];
//    private int[] list3 = new int[42];

    private int[] list1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int[] list2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private int[] list3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41};

    // define your constants here
    public final int[] searchOnList = list1;
    public final int searchElement = 18;

    public static void main(String[] args) {
        Main main = new Main();

        // search element on a list
//        int[] result = main.moveForMiddlePosition(main.searchOnList, main.searchElement);

        // BuscaPrimeiraOcorrencia algorithm
        int j = 0;
        int counterWhile = 0;
        int i = 0;
        while (j < main.searchOnList.length) {
            counterWhile++;
            j++;

            i += main.moveFor2Position(main.searchOnList, j);
        }

        System.out.println("Verificações (IF) = " + i);
        System.out.println("While = " + counterWhile);


        // fill all lists and show in values in console
//        System.out.println("Lista 1");
//        main.showListElements(main.fillList(main.list1, 11));
//
//        System.out.println("\nLista 2");
//        main.showListElements(main.fillList(main.list2, 21));
//
//        System.out.println("\nLista 3");
//        main.showListElements(main.fillList(main.list3, 42));

    }

    void showListElements(int[] list) {
        int j = 0;
        ArrayList<Integer> elements = new ArrayList<>();
        while (j < list.length) {
            elements.add(list[j]);
            j++;
        }

        System.out.println(elements);
    }

    private int moveFor2Position(int[] list, int element) {
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == element) {
                counter++;

                int tmp = list[i]; // index of element
                int pos2 = list[1]; // save element on position 2

                // crossover
                list[1] = tmp;
                list[i] = pos2;
            }
        }
        return counter;
//        return list;
    }

    private int moveForMiddlePosition(int[] list, int element) {
        int counter = 0;
        int middle = (list.length + 1) / 2;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == element) {
                counter++;
                int tmp = list[i]; // element
                int middlePosition = list[middle]; // save middle element

                // crossover
                list[middle] = tmp;
                list[i] = middlePosition;
            }
        }
        return counter;
    }

    private int searchIfNotExists(int[] list, int element) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == element) {
                return list[i];
            } else {
                return -1;
            }
        }
        return -1;
    }

    /**
     * Fill a list in crescent order
     *
     * @param list        list to be filled
     * @param qtyElements N elements to be generated
     * @return filled list
     */
    public int[] fillList(int[] list, int qtyElements) {
        int[] sortedNumbers = new int[qtyElements];
        for (int i = 1; i < qtyElements; i++) {
            sortedNumbers[i] = i;
        }
        list = sortedNumbers;
        return list;
    }
}


