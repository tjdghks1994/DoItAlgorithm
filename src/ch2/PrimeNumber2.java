package ch2;

import java.util.Arrays;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;    // 나눗셈의 횟수
        int ptr = 0;    // 찾은 소수의 개수
        int[] prime = new int[168]; // 소수를 저장하는 배열

        prime[ptr++] = 2;   // 2는 소수

        for (int n = 3; n <= 1000; n += 2) {    // 짝수는 나눌필요 없으므로 홀수만 진행
            int i;
            for (i = 1; i < ptr; i++) { // 이미 찾은 소수로만 나눗셈을 진행
                counter++;
                if (n % prime[i] == 0) {    // 이미 찾은 소수로 n이 나누어 지는 경우 소수가 아니다
                    break;
                }
            }

            if (ptr == i) { // 마지막까지 나누어 떨어지지 않은 경우
                prime[ptr++] = n;   // 소수 배열에 저장
            }
        }

        System.out.println(Arrays.toString(prime));
        System.out.println("나눗셈을 수행한 횟수 = " + counter);
    }
}
