package java_core_3_homework_lesson1;

import java.util.Arrays;

public class Task_1_SwapElementsArray {

    public static void main(String[] args) {

        Integer[] intArr = {0, 1, 2, 3, 4, 5};
        String[] strArr = {"0s", "1s", "2s", "3s", "4s"};

        intArr = swap(intArr, 0, 5);
        strArr = swap(strArr, 4, 1);

        System.out.println("Result array: " + Arrays.asList(intArr));
        System.out.println("Result array: " + Arrays.asList(strArr));
    }

    public static <T> T[] swap(T[] array, int i, int j) {
        int arrayLenght = array.length;
        if (i >= 0 && i <= arrayLenght && j >= 0 && j <= arrayLenght && i != j) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        } else {
            System.out.println("Указаны не правильные параметры массива.");
        }
        return array;
    }
}