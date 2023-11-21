package ch2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqual {
    // 두 배열 a,b의 모든 요소가 같은지 판단
    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    // 배열 b의 모든 요소를 배열 a에 복사
    static void copy(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println("b의 배열길이가 a의 배열길이와 같지 않기 때문에 일부 요소만 복사될 수 있습니다.");
        }

        int copyLength = a.length > b.length ? b.length : a.length;

        for (int i = 0; i < copyLength; i++) {
            a[i] = b[i];
        }

        System.out.println("복사가 완료되었습니다.");
        System.out.println(Arrays.toString(a));
    }

    // 배열 b의 모든 요소를 배열 a에 역순으로 복사
    static void rcopy(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println("b의 배열길이가 a의 배열길이와 같지 않기 때문에 일부 요소만 복사될 수 있습니다.");
        }

        int copyLength = a.length > b.length ? b.length : a.length;

        for (int i = 0; i < copyLength; i++) {
            a[i] = b[b.length - 1 - i];
        }

        System.out.println("역순으로 복사가 완료되었습니다.");
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 a의 요솟수 = ");
        int aLength = scanner.nextInt();

        int[] a = new int[aLength];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

        System.out.print("배열 b의 요솟수 = ");
        int bLength = scanner.nextInt();

        int[] b = new int[bLength];

        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = scanner.nextInt();
        }

        System.out.println("배열 a와 b의 모든 요소가 동일한가 ? = " + equals(a, b));

        copy(a, b);
        rcopy(a, b);
    }
}
