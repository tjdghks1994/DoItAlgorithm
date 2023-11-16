package ch01;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        triangleLB(5);
        triangleLU(5);
        triangleRU(5);
        triangleRB(5);
    }

    static void triangleLB(int n) {
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
