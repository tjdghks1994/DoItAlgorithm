package ch6;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort2 {
    // 셸 정렬(버전2, i의 값은 ...,40,13,4,1)
    static void shellSort(int[] array) {
        int i;

        for (i = 1; i < array.length / 9; i = i * 3 + 1) {}

        for (; i > 0; i /= 3) {
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

        System.out.println("셸 정렬(버전2)");
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
