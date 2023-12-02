package ch3;

import java.util.Scanner;

public class BinSearch {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;   // 검색 범위의 첫번째 인덱스
        int pr = n-1;   // 검색 범위의 마지막 인덱스

        do {
            int pc = (pl + pr) / 2; // 검색 범위의 중간 인덱스
            if (a[pc] == key) {
                return pc;  // 검색 성공
            } else if (a[pc] < key) {
                pl = pc + 1;    // 검색 범위의 첫번째 인덱스를 중간 인덱스+1로 변경
            } else {
                pr = pc - 1;    // 검색 범위의 마지막 인덱스를 중간 인덱스-1로 변경
            }
        } while (pl <= pr);

        return -1;  // 검색 실패
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
            } while (x[i] < x[i - 1]);  // 이전 요소보다 현재 입력요소가 작으면 반복
        }

        System.out.print("검색할 값 = ");
        int ky = scanner.nextInt();

        int idx = binSearch(x, num, ky);    // 배열 x에서 키 값이 ky인 요소를 검색

        if (idx == -1) {
            System.out.println(ky + "은(는) 배열 x에 존재하지 않습니다.");
        } else {
            System.out.println(ky+ "은(는) x["+idx+"]에 있습니다.");
        }
    }
}
