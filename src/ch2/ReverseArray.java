package ch2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void swap(int[] a, int idx1, int idx2) {
        System.out.println("a[" + idx1 + "]과(와) a[" + idx2 + "]를 교환합니다.");
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
        System.out.println(Arrays.toString(a));
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    static int sumOf(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 = ");
        int num = scanner.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = scanner.nextInt();
        }
        System.out.println("요소를 역순으로 정렬하기 전");
        System.out.println(Arrays.toString(x));

        reverse(x);

        System.out.println("요소를 역순으로 정렬하는 것을 마쳤습니다.");

        System.out.println("요소의 모든 합계 = " + sumOf(x));

    }
}
