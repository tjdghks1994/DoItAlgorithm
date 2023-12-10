package ch5;

import java.util.Arrays;

public class QueenB {
    static int[] pos = new int[8];  //   각 열의 퀸의 위치

    // 각 열의 퀸의 위치를 출력
    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    // i열에 퀸을 놓는다
    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            pos[i] = j; // 퀸을 j행에 배치
            if (i == 7) {   // 모든 열에 퀸을 배치한 경우
                print();
            } else {    // 다음 열에 퀸을 배치
                set(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        set(0);
        System.out.println(Arrays.toString(pos));
    }
}
