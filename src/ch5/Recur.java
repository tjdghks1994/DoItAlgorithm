package ch5;

import ch4.IntStack;

import java.util.Scanner;

// 재귀 함수 이해하기
public class Recur {
    // 재귀 함수
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }
    // 위 recur()를 비재귀적인 메서드로 변경
    static void removeRecur(int n) {
        IntStack stack = new IntStack(n);

        while (true) {
            if (n > 0) {
                stack.push(n);  // n의 값을 스택에 임시저장
                n = n - 1;
                continue;
            }
            if (!stack.isEmpty()) { // 스택이 비어있지 않다면
                n = stack.pop();    // 스택에 저장된 값을 팝하고 출력
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요 > >");

        int num = scanner.nextInt();

        recur(num);
    }
}
