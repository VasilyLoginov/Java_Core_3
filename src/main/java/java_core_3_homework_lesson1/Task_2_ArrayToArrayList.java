package java_core_3_homework_lesson1;

import java.util.ArrayList;

public class Task_2_ArrayToArrayList {
    public static void main(String[] args) {
        Integer[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        String[] strArr = {"0s", "1s", "2s", "3s", "4s"};

        ArrayList<Integer> intArrList = new ArrayList<Integer>();
        ArrayList<String> strArrList = new ArrayList<String>();

        intArrList = arrToList(intArray, intArrList);
        System.out.println("ArrayList: " + intArrList);

        strArrList = arrToList(strArr, strArrList);
        System.out.println("ArrayList: " + strArrList);
    }
    public static <T> ArrayList<T> arrToList(T[] arr, ArrayList<T> arrList){
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++){
            arrList.add(arr[i]);
        }
        return arrList;
    }
}
