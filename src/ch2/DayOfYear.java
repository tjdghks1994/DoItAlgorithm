package ch2;

import java.util.Scanner;

public class DayOfYear {
    // 각 달의 일수
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},   // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}    // 윤년
    };

    // 서기 year년은 윤년인가? (윤년은 1, 평년은 0 반환)
    static int isLeap(int year) {
        // 윤년은 4로 나누어떨어지면서 100으로 나누어떨어지지않거나 4로 나누어떨어지면서 400으로 나누어떨어지면 윤년이다
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 서기 y년 m월 d일의 그 해 경과 일 수를 구함
    static int dayOfYear(int y, int m, int d) {
        int days = d;   // 일 수

        for (int i = 1; i < m; i++) {   // 1월부터 m-1월의 일 수를 더한다
            days += mdays[isLeap(y)][i - 1];
        }

        return days;
    }

    // 서기 y년 m월 d일의 그 해 남은 일 수를 구함
    static int leftDayOfYear(int y, int m, int d) {
        int days = mdays[isLeap(y)][m - 1] - d;  // 현재 달의 남은 일수

        for (int i = 12; i > m; i--) {
            days += mdays[isLeap(y)][i - 1];
        }

        return days;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int retry;  // 다시한번?

        System.out.println("그 해 경과 일수를 구합니다");

        do {
            System.out.print("년 = ");
            int year = scanner.nextInt();
            System.out.print("월 = ");
            int month = scanner.nextInt();
            System.out.print("일 = ");
            int day = scanner.nextInt();

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
            System.out.printf("올 해 남은 일자는 %d일입니다.\n", leftDayOfYear(year, month, day));

            System.out.printf("한 번 더 할까요? (1.예/2.아니오) = ");
            retry = scanner.nextInt();
        } while (retry == 1);
    }
}
