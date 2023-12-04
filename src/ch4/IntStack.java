package ch4;

public class IntStack {
    private int max; // 스택 용량
    private int ptr; // 스택 포인터
    private int[] stk;  // 스택 본체

    // 실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    // 실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    // 생성자
    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[capacity];    // 스택 본체용 배열 생성
        } catch (OutOfMemoryError error) {
            max = 0;
        }
    }

    // 스택에 x를 푸시
    public int push(int x) throws OverflowIntStackException {
        if (ptr == max) {
            throw new OverflowIntStackException();
        }

        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝
    public int pop() throws EmptyIntStackException {
        if (ptr == 0) {
            throw new EmptyIntStackException();
        }

        return stk[--ptr];
    }

    // 스택에서 데이터를 확인
    public int peek() throws EmptyIntStackException {
        if (ptr == 0) {
            throw new EmptyIntStackException();
        }

        return stk[ptr-1];
    }

    // 스택에서 데이터 검색
    public int indexOf(int key) {
        for (int i = ptr - 1; i >= 0; i--) {
            if (stk[i] == key) {
                return i;
            }
        }

        return -1;
    }

    // 스택의 모든 요소를 삭제
    public void clear() {
        ptr = 0;
    }

    // 스택 용량 반환
    public int capacity() {
        return max;
    }

    // 스택 데이터 수 반환
    public int size() {
        return ptr;
    }

    // 스택이 비어있는지 확인
    public boolean isEmpty() {
        return ptr == 0;
    }

    // 스택이 가득찼는지 확인
    public boolean isFull() {
        return ptr == max;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (ptr == 0) {
            System.out.println("스택이 비어 있어서 출력할 데이터가 없습니다.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }

    }
}
