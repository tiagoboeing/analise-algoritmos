package Trabalho1;

import java.util.ArrayList;
import java.util.stream.IntStream;

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

        // BuscaPrimeiraOcorrencia algorithm
        int j = 1;
        int x = main.searchElement;
        int counterWhile = 0;
        int n = main.searchOnList.length;
        int counterMove2Pos = 0;
        int counterMoveMiddlePos = 0;
        int counterNotExists = 0;

        while (main.searchOnList[j] != x) {
            counterWhile++;
            j++;

            main.BuscaPrimeiraOcorrencia(main.list1, 8);

            if (j >= n) {
                j = n - 1;
                break;
            }
        }

        int counter = 0;
        boolean signal;
        if (main.searchOnList[j] != x) {
            counter++;
            signal = false;
        } else {
            signal = true;
        }

//        while (j < main.searchOnList.length) {
//            counterWhile++;
//            j++;
//
//            counterMove2Pos += main.moveFor2Position(main.searchOnList, j);
//            counterMoveMiddlePos += main.moveForMiddlePosition(main.searchOnList, j);
//            counterNotExists += main.searchIfNotExists(main.searchOnList, j);
//        }




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

    void BuscaPrimeiraOcorrencia(int[] A, int x) {
        int[] lista1 = IntStream.range(0, 13215468).toArray();
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

    /**
     * Move X element for 2 position in vector if exists
     * Check complexity on worst case
     *
     * @param list    list to be searched
     * @param element int to be located on list
     * @return iterator count
     */
    private int moveFor2Position(int[] list, int element) {
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != element) {
                counter++;
            } else {
                int tmp = list[i]; // index of element
                int pos2 = list[1]; // save element on position 2

                // crossover
                list[1] = tmp;
                list[i] = pos2;
            }
        }
        return counter;
    }

    /**
     * Move X element for middle position in vector if exists
     * Check complexity on worst case
     *
     * @param list    list to be searched
     * @param element int to be located on list
     * @return iterator count
     */
    private int moveForMiddlePosition(int[] list, int element) {
        int counter = 0;
        int middle = (list.length + 1) / 2;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != element) {
                counter++;
            } else {
                int tmp = list[i]; // element
                int middlePosition = list[middle]; // save middle element

                // crossover
                list[middle] = tmp;
                list[i] = middlePosition;
            }
        }
        return counter;
    }

    /**
     * Check if element exists
     *
     * @param list    list do be searched
     * @param element int element do be located
     * @return iterator count for worst case
     */
    private int searchIfNotExists(int[] list, int element) {
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != element) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Fill a list in crescent order
     *
     * @param list        list to be filled
     * @param qtyElements N elements to be generated
     * @return filled list
     */
//    public int[] fillList(int[] list, int qtyElements) {
//        int[] sortedNumbers = new int[qtyElements];
//        for (int i = 1; i < qtyElements; i++) {
//            sortedNumbers[i] = i;
//        }
//        list = sortedNumbers;
//        return list;
//    }
}


