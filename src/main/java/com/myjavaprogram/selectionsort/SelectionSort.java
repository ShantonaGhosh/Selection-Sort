package com.myjavaprogram.selectionsort;

public class SelectionSort {

    public static void printArray(String msg, int arr[]) {
        System.out.print(msg + "--->");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
         System.out.print("\n");
    }

    public static void main(String[] args) {

        int arr[] = {22, 67, 9, 7, 1};

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                //swap
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                printArray("Inner loop j :" + j + " i : " + i, arr);
            }
              System.out.print("\n\n");
             printArray("outer loop i :"+ i, arr);
             System.out.print("\n\n");

        }
             System.out.print("\n\n\n");
             printArray("final sorted arraylist : ", arr);
             

    }
}
