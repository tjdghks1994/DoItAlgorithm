package ch6;

import ch4.IntStack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class QuickSort { // 퀵 정렬

    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    // 퀵 정렬 재귀버전
    static void quickSort(int[] a, int left, int right) {
        int pl = left;  // 왼쪽 포인터
        int pr = right; // 오른쪽 포인터
        int pivot = a[(pl + pr) / 2];   // 피벗

        System.out.printf("a[%d]~a[%d] : {", left, right);
        for (int i = left; i < right; i++) {
            System.out.printf("%d , ", a[i]);
        }
        System.out.printf("%d}\n", a[right]);

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

    static void quickSortNoRecur(int[] a, int left, int right) {
        Stack<Integer> lstack = new Stack<>();
        Stack<Integer> rstack = new Stack<>();

        lstack.push(left);
        rstack.push(right);

        while (!lstack.isEmpty()) {
            int pl = left = lstack.pop();  // 왼쪽 포인터
            int pr = right = rstack.pop();  // 오른쪽 포인터
            int pivot = a[(left + right) / 2];  // 피벗 값

            do {
                while (a[pl] < pivot) {
                    pl++;
                }
                while (a[pr] > pivot) {
                    pr--;
                }
                if (pl <= pr) {
                    swap(a, pl++, pr--);
                }
            } while (pl <= pr);

            if (left < pr) {
                lstack.push(left);
                rstack.push(pr);
            }
            if (pl < right) {
                lstack.push(pl);
                rstack.push(right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.print("요솟수 = ");
        int num = scanner.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];

        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "] = ");
            int number = scanner.nextInt();
            x[i] = number;
            y[i] = number;
        }

        System.out.println("정렬 전 배열");
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

        quickSort(x, 0, x.length - 1);  // 배열 x를 퀵 정렬(재귀)
        quickSortNoRecur(y, 0, y.length - 1);  // 배열 y를 퀵 정렬(비재귀)

        System.out.println("오름차순으로 퀵 정렬을 완료했습니다.");
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

    }
}
