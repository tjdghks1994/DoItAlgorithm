package ch3;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIdx {
    // 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고,
    // 일치한 요솟수를 반환
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int idxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[idxIndex++] = i;
            }
        }

        return idxIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟수 = ");
        int num = scanner.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];

        System.out.println("배열의 요소를 입력하세요");
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 요소 = ");
        int key = scanner.nextInt();
        int result = searchIdx(x, num, key, y);

        System.out.println("실행 결과");
        System.out.println(Arrays.toString(y));
        System.out.println(result+"개");
    }
}
