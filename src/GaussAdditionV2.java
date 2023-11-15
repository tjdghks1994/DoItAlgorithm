public class GaussAdditionV2 {
    public static void main(String[] args) {
        System.out.println(sumof(3, 7));
        System.out.println(sumof(2, 7));
        System.out.println(sumof(1, 11));
        System.out.println(sumof(2, 20));
        System.out.println(sumof(2, 10));
    }
    // 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드
    // 가우스 덧셈 공식 활용
    static int sumof(int a, int b) {
        int numCnt = (b - a + 1);   // a~b 사이의 정수 갯수
        int sum = 0;

        // a~b 사이의 정수 갯수가 짝수개인 경우
        if (numCnt % 2 == 0) {
            sum = (a + b) * (numCnt / 2);
        } else {    // a~b 사이의 정수 갯수가 홀수개인 경우
            sum = (a + b) * (numCnt / 2) + ((b + a) / 2);
        }

        return sum;
    }
}
