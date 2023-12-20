package ch6;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort { // 퀵 정렬

    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    // 퀵 정렬
    static void quickSort(int[] a, int left, int right) {
        int pl = left;  // 왼쪽 포인터
        int pr = right; // 오른쪽 포인터
        int pivot = a[(pl + pr) / 2];   // 피벗

        do {
            while (a[pl] < pivot) { // a[pl] 값이 pivot 보다 작으면 왼쪽 포인터를 1칸 오른쪽으로 이동
                pl++;
            }
            while (a[pr] > pivot) { // a[pr] 값이 pivot 보다 크면 오른쪽 포인터를 1칸 왼쪽으로 이동
                pr--;
            }
            // 위 2개의 while 문이 종료되고, 왼쪽 포인터의 값이 오른쪽 포인터 값보다 작거나 같은 경우
            // 왼쪽 포인터의 값과 오른쪽 포인터의 값 위치 변경
            if (pl <= pr) {
                swap(a, pl++, pr--);
            }
        } while (pl <= pr);

        // 위의 do-while 문이 종료되어 pr이 pl 보다 왼쪽 위치로 이동되어진다면
        // 위의 피벗 기준으로 나누어진 왼쪽 그룹을 재귀호출
        if (left < pr) {
            quickSort(a, left, pr);
        }
        // 위의 do-while 문이 종료되어 pl이 pr 보다 오른쪽 위치로 이동되어진다면
        // 위의 피벗 기준으로 나누어진 오른쪽 그룹을 재귀호출
        if (right > pl) {
            quickSort(a, pl, right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.print("요솟수 = ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = scanner.nextInt();
        }

        quickSort(x, 0, x.length - 1);  // 배열 x를 퀵 정렬

        System.out.println("오름차순으로 퀵 정렬을 완료했습니다.");
        System.out.println(Arrays.toString(x));
    }
}
