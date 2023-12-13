package ch6;

import java.util.Arrays;

public class SelectionSort {
    // 선택 정렬
    // 정렬되지 않은 부분에서 가장 작은 원소를 선택하고
    // 정렬되지 않은 부분에서 가장 앞 요소로 이동시키면서 정렬하는 알고리즘
    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }
            }
            // 자리 바꿈
            int tmp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 5, 2, 4, 8, 3};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));

    }
}
