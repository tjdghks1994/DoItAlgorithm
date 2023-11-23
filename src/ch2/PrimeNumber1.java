package ch2;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;    // 나눗셈 횟수

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) {   // 나누어 떨어지면 소수가 아니다
                    break;  // 더이상 반복할 필요 없음
                }
            }

            if (n == i) {   // 마지막까지 나누어 떨어지는 경우가 없음
                System.out.println(n);
            }
        }

        System.out.println("나눗셈을 수행한 횟수 = " + counter);
    }
}
