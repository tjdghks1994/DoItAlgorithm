package ch6;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {
    // 셸 정렬
    static void shellSort(int[] array) {
        for (int i = array.length / 2; i > 0; i /= 2) {
            System.out.println("i = " + i);
            for (int j = i; j < array.length; j++) {
                System.out.println("j = " + j);
                int k;
                int tmp = array[j];
                for (k = j - i; k >= 0 && array[k] > tmp; k -= i) {
                    System.out.println("k = " + k);
                    array[k + i] = array[k];
                }

                array[k + i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("셸 정렬(버전1)");
        System.out.print("요솟수 = ");
        int num = scanner.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

        shellSort(a);

        System.out.println("셸 정렬이 끝났습니다.");
        System.out.println(Arrays.toString(a));
    }
}
