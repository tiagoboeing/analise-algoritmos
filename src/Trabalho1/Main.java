package Trabalho1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Tiago Boeing
 */

public class Main {

    public static void main(String[] args) throws Exception {
        int[] list1 = IntStream.range(0, 11).toArray();
        int[] list2 = IntStream.range(0, 21).toArray();
        int[] list3 = IntStream.range(0, 42).toArray();
        int[] longList = IntStream.range(0, 15324799).toArray();

        // Define values here
        final int searchElement = 8; // element to be searched
        final int[] searchOnList = list1; // choose a list

        // USE DELAY
        final boolean useDelay = false;
        final int delayTime = 2000; // in milliseconds

        Main main = new Main();

        // list elements
        System.out.printf("\nElementos da lista %s \n", main.showListElements(searchOnList));
        System.out.println("\n===============\n");


        // Run one test at a time, comment other lines

        List pos2 = main.moveFor2Position(searchOnList, searchElement, useDelay, delayTime);
        System.out.printf("Buscando %s na posição 2 - iterações = %s - tempo de execução = %s segs \n",
                searchElement, pos2.get(0), pos2.get(1));


        List posMiddle = main.moveForMiddlePosition(searchOnList, searchElement, useDelay, delayTime);
        System.out.printf("Buscando %s na posição mediana - iterações = %s - tempo de execução = %s segs \n",
                searchElement, posMiddle.get(0), posMiddle.get(1));

        List notExists = main.searchIfNotExists(searchOnList, 200, useDelay, delayTime);
        System.out.printf("Buscando %s sem existir no vetor - iterações = %s - tempo de execução = %s segs \n",
                searchElement, notExists.get(0), notExists.get(1));

    }


    ArrayList<Integer> showListElements(int[] list) {
        int j = 0;
        ArrayList<Integer> elements = new ArrayList<>();
        while (j < list.length) {
            elements.add(list[j]);
            j++;
        }

        return elements;
    }

    /**
     * Move X element for 2 position in vector if exists
     * Check complexity on worst case
     *
     * @param list    list to be searched
     * @param element int to be located on list
     * @return iterator count
     */
    private List moveFor2Position(int[] list, int element, boolean useDelay, int delayTime) throws InterruptedException {
        int counter = 0;
        int i = 0;

        double start = System.currentTimeMillis();
        if (useDelay) Thread.sleep(delayTime);

        while (i < list.length) {
            if (list[i] != element) {
                counter++;
            } else {
                int tmp = list[i]; // index of element
                int pos2 = list[1]; // save element on position 2

                // crossover
                list[1] = tmp;
                list[i] = pos2;

                break;
            }
            i++;
        }

        return Arrays.asList(counter, calcDurationTime(start));
    }

    /**
     * Move X element for middle position in vector if exists
     * Check complexity on worst case
     *
     * @param list    list to be searched
     * @param element int to be located on list
     * @return iterator count
     */
    private List moveForMiddlePosition(int[] list, int element, boolean useDelay, int delayTime) throws InterruptedException {
        int counter = 0;
        int i = 0;
        int middle = (list.length + 1) / 2;

        double start = System.currentTimeMillis();
        if (useDelay) Thread.sleep(delayTime);

        while (i < list.length) {
            if (list[i] != element) {
                counter++;
            } else {
                int tmp = list[i]; // element
                int middlePosition = list[middle]; // save middle element

                // crossover
                list[middle] = tmp;
                list[i] = middlePosition;

                break;
            }
            i++;
        }

        return Arrays.asList(counter, calcDurationTime(start));
    }

    /**
     * Check if element exists
     *
     * @param list    list do be searched
     * @param element int element do be located
     * @return iterator count for worst case
     */
    private List searchIfNotExists(int[] list, int element, boolean useDelay, int delayTime) throws InterruptedException {
        int counter = 0;
        int i = 0;

        double start = System.currentTimeMillis();
        if (useDelay) Thread.sleep(delayTime);

        while (i < list.length) {
            if (list[i] != element) {
                counter++;
            }
            i++;
        }
        return Arrays.asList(counter, calcDurationTime(start));
    }

    private double calcDurationTime(double startTime) {
        return (System.currentTimeMillis() - startTime) / 1000;
    }
}


