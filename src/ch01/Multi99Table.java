package ch01;

import java.util.Scanner;

public class Multi99Table {
    public static void main(String[] args) {

        System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n---+---------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

        System.out.println();

        System.out.printf("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n---+---------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i+j);
            }
            System.out.println();
        }

        System.out.println("사각형을 출력합니다.");
        System.out.println("단 수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        for (int i = 1; i <= dan; i++) {
            for (int j = 1; j <= dan; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
