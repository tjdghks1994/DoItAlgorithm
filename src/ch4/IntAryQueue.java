package ch4;

public class IntAryQueue {
    private int max;    // 큐 용량
    private int num;    // 현재 데이터 개수
    private int[] que;  // 큐 본체

    // 실행 시 예외 : 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    // 실행 시 예외 : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    public IntAryQueue(int capacity) {
        this.max = capacity;
        this.num = 0;
        que = new int[capacity];
    }
    // 데이터 삽입
    public void inqueue(int data) {
        if (num == max) {
            throw new OverflowIntQueueException();
        }
        que[num++] = data;
    }
    // 데이터 삭제
    public int dequeue() {
        if (num == 0) {
            throw new EmptyIntQueueException();
        }
        int data = que[0];
        // 뒤에 있는 모든 요소를 앞으로 1칸씩 당김 처리
        for (int i = 1; i < num; i++) {
            que[i - 1] = que[i];
        }
        num--;

        return data;
    }
    // 데이터 확인
    public int peek() {
        if (num == 0) {
            throw new EmptyIntQueueException();
        }
        return que[0];
    }

}
