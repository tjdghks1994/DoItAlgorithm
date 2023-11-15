import java.util.Scanner;

public class GaussAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하면 1부터 입력한 숫자까지 덧셈하여 결과 값을 알려주는 프로그램 입니다.");
        System.out.println("숫자를 입력해주세요 > ");
        int num = scanner.nextInt();
        int sum = 0;

        // 입력된 숫자가 짝수인 경우(1부터 n까지의 총 개수가 짝수)
        // 가우스 덧셈 공식 - (n+1) * (n/2)
        if (num % 2 == 0) {
            sum = (num + 1) * (num / 2);
        } else {    // 입력된 숫자가 홀수인 경우(1부터 n까지의 총 개수가 홀수)
            // 가우스 덧셈 공식 - (n+1) * (n/2) + ((n+1)/2)
            sum = (num + 1) * (num / 2) + ((num + 1) / 2);
        }

        System.out.println("총 합은 = " + sum + " 입니다.");
    }
}
