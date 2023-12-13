package ch6;

import java.util.Arrays;

public class InsertionSort {
    // 삽입 정렬
    // 선택한 요소를 그보다 더 앞쪽의 알맞은 위치에 삽입하는 작업을 반복하는 알고리즘
    // 정렬이 되지 않은 부분의 맨 앞요소를 정렬이 된 요소들과 비교하여 앞쪽 위치로 삽입
    static void insertionSort(int[] array) {
        System.out.println("=== 배열 "+Arrays.toString(array) + " 의 삽입 정렬을 시작하겠습니다!! ===");
        for (int i = 1; i <= array.length - 1; i++) {
            int selectionValue = array[i];  // 선택 요소의 값
            int chageIdx = i;   // 선택 요소의 인덱스

            System.out.println(i+"회차 선택 요소의 값 = " + selectionValue);
            System.out.println(i+"회차 선택 요소의 인덱스 = " + chageIdx);

            for (int j = i - 1; j >= 0; j--) {
                // 선택 요소의 값보다 앞에 위치한 정렬된 요소의 값이 큰 경우
                if (array[j] > array[chageIdx]) {
                    // 자리 이동
                    array[chageIdx] = array[j];
                    array[j] = selectionValue;
                    // 선택 요소의 인덱스가 변경되었으므로 값 업데이트
                    chageIdx = j;

                    System.out.println(i + "회차 선택 요소는 " + chageIdx + " 인덱스로 이동합니다");
                }
            }

            System.out.println(i + "회차 선택 요소는 정렬되었습니다.");
        }
        System.out.println("배열의 삽입 정렬이 끝났습니다.");
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{22, 5, 11, 32, 120, 68, 70};
        insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{7, 6, 5, 4, 2, 1};
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
