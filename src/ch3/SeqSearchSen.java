package ch3;

import java.util.Scanner;

public class SeqSearchSen {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색
    static int seqSearchSen(int[] a, int n, int key) {
        int i=0;

        a[n] = key; // 보초를 추가

        while (true) {
            if (a[i] == key) {  // 검색 성공
                break;
            }
            i++;
        }
        // i==n 이라면 실제론 배열에 없는 요소라 -1 반환 그외에는 인덱스 반환
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 = ");
        int num = scanner.nextInt();
        int[] x = new int[num + 1]; // 요솟수 +1 크기만큼의 배열 생성 (보초를 위해)

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 = ");
        int ky = scanner.nextInt();

        int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1) {
            System.out.println("검색할 값이 배열에 존재하지 않습니다.");
        } else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }
    }
}
