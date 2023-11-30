package ch3;

import java.util.Random;
import java.util.Scanner;

public class SeqSearch {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색
    static int seqSearch(int[] a, int n, int key) {
//        int i=0;

//        while (true) {
//            if (i == n) {
//                return -1;  // 검색 실패
//            }
//            if (a[i] == key) {
//                return i;   // 검색 성공 (배열 인덱스 반환)
//            }
//
//            i++;
//        }
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
        }

        return -1;
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

        int ky = (int) (Math.random() * 100) + 1;
        System.out.println("검색할 값 = " +ky);
//        int ky = scanner.nextInt();

        int idx = seqSearch(x, num, ky);    // 배열 x에서 키 값이 ky인 요소 위치 검색

        if (idx == -1) {
            System.out.println("검색할 값이 배열에 존재하지 않습니다.");
        } else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }
    }
}
