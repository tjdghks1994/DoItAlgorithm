package ch2;

import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();    // 배열을 복제 - b는 a의 배열을 참조하는 것이 아니라 a의 배열 요소값을 동일하게 가지고 있는 새로운 배열을 참조

        b[3] = 0;

        System.out.println("a = " + a);
        System.out.println("a = " + Arrays.toString(a));

        System.out.println("b = " + b);
        System.out.println("b = " + Arrays.toString(b));
    }
}
