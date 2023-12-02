package ch3;

import java.util.Scanner;

public class BinSearchX {
    // 요솟수가 n인 배열 a에서 key가 위치한 index를 반환할 때, 동일한 key값의 요소가 배열 a에 존재한다면
    // 가장 맨 앞에 위치한 key의 index를 반환
    static int binSearchX(int[] a, int n, int key) {
        int l = 0;  // 검색 범위의 맨 첫 인덱스
        int r = n - 1;  // 검색 범위의 맨 마지막 인덱스

        for (int i = 0; i < n; i++) {
            int c = (l + r) / 2;    //  검색 범위의 가운데 인덱스

            if (a[c] == key) {
                int finalIdx = c;
                // c 인덱스 이전 요소중에서도 현재 key와 같은 값이 있는지 확인
                for (int j = c-1; j >= l; j--) {
                    if (a[j] == key) {
                        finalIdx = j;
                    }
                }

                return finalIdx;
            } else if (a[c] < key) {
                l = c + 1;
            } else {
                r = c - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 = ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");
        System.out.print("x[0] = ");
        x[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] = ");
                x[i] = scanner.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("검색할 요소 = ");
        int key = scanner.nextInt();

        int result = binSearchX(x, num, key);

        if (result == -1) {
            System.out.println("검색할 요소는 배열에 존재하지 않습니다.");
        } else {
            System.out.println(key + "은(는) x["+result+"]에 위치해 있습니다");
        }
    }
}
