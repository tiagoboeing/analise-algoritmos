package Trabalho1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] list1 = IntStream.range(0, 11).toArray();
        int[] list2 = IntStream.range(0, 21).toArray();
        int[] list3 = IntStream.range(0, 42).toArray();
        int[] longList = IntStream.range(0, 13215468).toArray();

        // Define values here
        final int searchElement = 19;
        final int[] searchOnList = longList;

        Main main = new Main();

        // list elements
        System.out.printf("\nElementos da lista %s \n", main.showListElements(searchOnList));
        System.out.println("\n===============\n");

        System.out.printf("Buscando %s na posição 2 - iterações = %s \n",
                searchElement, main.moveFor2Position(searchOnList, searchElement));

        System.out.printf("Buscando %s na posição mediana - iterações = %s \n",
                searchElement, main.moveForMiddlePosition(searchOnList, searchElement));

        System.out.printf("Buscando %s sem existir no vetor - iterações = %s \n",
                searchElement, main.searchIfNotExists(searchOnList, searchElement));
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
    private int moveFor2Position(int[] list, int element) {
        int counter = 0;
        int i = 0;
        while (i < list.length) {
            if (list[i] != element) {
                counter++;
            } else {
                int tmp = list[i]; // index of element
                int pos2 = list[1]; // save element on position 2

                // crossover
                list[1] = tmp;
                list[i] = pos2;
            }
            i++;
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
        int i = 0;
        int middle = (list.length + 1) / 2;

        while (i < list.length) {
            if (list[i] != element) {
                counter++;
            } else {
                int tmp = list[i]; // element
                int middlePosition = list[middle]; // save middle element

                // crossover
                list[middle] = tmp;
                list[i] = middlePosition;
            }
            i++;
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
        int i = 0;

        while (i < list.length) {
            if (list[i] != element) {
                counter++;
            }
            i++;
        }
        return counter;
    }
}


