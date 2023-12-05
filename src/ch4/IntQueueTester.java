package ch4;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntQueue s = new IntQueue(64);

        while (true) {
            System.out.println("현재 데이터 수 = " + s.size() + "/" + s.capacity());

            System.out.println("(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료");
            System.out.print("실행할 메뉴 번호를 입력하세요 >> ");
            int menu = scanner.nextInt();
            if(menu == 0) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터 = ");
                    x = scanner.nextInt();
                    s.enqueue(x);
                    break;
                case 2:
                    x = s.dequeue();
                    System.out.println("디큐한 데이터는 = " + x + " 입니다.");
                    break;
                case 3:
                    x = s.peek();
                    System.out.println("피크한 데이터는 = " + x + " 입니다.");
                    break;
                case 4:
                    s.dump();
                    break;
            }
        }
    }
}
