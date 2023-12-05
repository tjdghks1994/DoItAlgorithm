package ch4;

public class IntQueue {
    private int max;    // 큐의 용량
    private int front;  // 첫 번째 요소를 가리키는 포인터
    private int rear;   // 마지막 요소를 가리키는 포인터
    private int num;    // 큐의 데이터 개수
    private int[] que;  // 큐 본체

    // 실행 시 예외 : 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    // 실행 시 예외 : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    public IntQueue(int capacity) {
        this.front = this.rear = this.num = 0;
        this.max = capacity;
        que = new int[capacity];
    }

    // 큐에 데이터를 인큐
    public void enqueue(int data) {
        if (num == max) {
            throw new OverflowIntQueueException();
        }
        que[rear++] = data; // 데이터 인큐 시 배열 rear 위치에 삽입 후 rear 값 증가
        num++;  // 데이터 개수 증가
        if (rear == max) {  // 마지막 요소를 가리키는 포인터가 max와 같다면
            rear = 0;  // 포인터의 값을 배열의 첫 index인 0으로 변경
        }
    }

    // 큐에 데이터를 디큐
    public int dequeue() {
        if (num == 0) {
            throw new EmptyIntQueueException();
        }
        int data = que[front++];    // 데이터 디큐 시 배열 front 위치의 값을 꺼낸 후 front 값 증가
        num--;  // 데이터 개수 감소
        if (front == max) { // 첫번째 요소를 가리키는 포인터가 max와 같다면
            front = 0;  // 포인터 값을 배열의 첫 index인 0으로 변경
        }

        return data;
    }

    // 큐에서 데이터를 피크(맨 앞 요소 확인)
    public int peek() {
        if (num == 0) {
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    // 큐를 비움
    public void clear() {
        num = front = rear = 0;
    }

    // 큐의 용량 반환
    public int capacity() {
        return max;
    }

    // 큐에 쌓여 있는 데이터 수를 반환
    public int size() {
        return num;
    }

    // 큐가 비어있는지 확인
    public boolean isEmpty() {
        return num == 0;
    }

    // 큐가 꽉차있는지 확인
    public boolean isFull() {
        return num == max;
    }

    // 큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
    public void dump() {
        if (num == 0) {
            System.out.println("큐는 현재 비어있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }
}
