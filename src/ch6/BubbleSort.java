package ch6;

import java.util.Arrays;

public class BubbleSort {
    // 버블 정렬 구현
    // 버블 정렬 - 이웃한 두 요소를 서로 비교하여 정렬하는 방식
    // 작은 값부터 정렬하는 방식
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                // 이웃한 두 요소를 비교하는데 앞 요소가 값이 큰 경우, 요소의 위치를 변경
                if (array[j - 1] > array[j]) {
                    int tmp = array[j-1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }

    }
    // 버블 정렬 - 이웃한 두 요소를 서로 비교하여 정렬하는 방식
    // 큰 값부터 정렬하는 방식
    public static void bubbleSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                // 이웃한 두 요소를 비교하는데 앞 요소가 값이 큰 경우, 요소의 위치를 변경
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

    }

    public static void bubbleSort3(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int swapCnt = 0;    // 교환 횟수 기록
            for (int j = 0; j < array.length - 1 - i; j++) {
                // 이웃한 두 요소를 비교하는데 앞 요소가 값이 큰 경우, 요소의 위치를 변경
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapCnt++;  // 교환이 이루어짐
                }
            }
            // 만약 교환이 한번도 이루어지지 않았다면 이미 정렬이 전부 완료된 상태이므로 종료 처리
            if (swapCnt == 0) {
                break;
            }
        }
    }

    public static void bubbleSort4(int[] array) {
        int finishIdx = 0;  // finishIdx 값보다 앞의 배열 index들은 이미 정렬이 완료된 상태
        for (int i = finishIdx; i < array.length - 1; i++) {
            int lastChangeIdx = array.length - 1;   // 교환이 마지막으로 이루어진 index
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    lastChangeIdx = j;  // 교환이 이루어졌으므로 변수 값 update
                }
            }
            // 마지막으로 교환이 이루어진 index 앞 배열 index들은 이미 정렬이 완료된 상태이므로
            // 비교를 진행하지 않도록 함
            finishIdx = lastChangeIdx;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 3, 7, 4, 2, 1};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{3, 2, 1, 5, 4, 8, 10, 9};
        bubbleSort2(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        bubbleSort3(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[]{1, 2, 3, 6, 4, 5, 9, 10};
        bubbleSort4(arr4);
        System.out.println(Arrays.toString(arr4));
    }
}
