package ch2;

import java.util.Arrays;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0; // 곱셉과 나눗셈의 횟수
        int ptr = 0;    // 찾은 소수의 개수
        int[] prime = new int[168]; // 소수를 저장하는 배열

        prime[ptr++] = 2;   // 2는 소수
        prime[ptr++] = 3;   // 3은 소수

        for (int n = 5; n < 1000; n += 2) { // 소수인지 확인은 홀수만
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) {    // 나누어떨어지면 소수가 아님
                    flag = true;
                    break;
                }
            }

            if (!flag) {    // 마지막까지 나누어떨어지지 않음
                prime[ptr++] = n;   // 소수이므로 배열에 저장
                counter++;
            }
        }

        System.out.println(Arrays.toString(prime));
        System.out.println("곱셈과 나눗셈을 수행한 횟수 = " + counter);
    }
}
