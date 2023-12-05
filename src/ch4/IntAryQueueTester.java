package ch4;

public class IntAryQueueTester {
    public static void main(String[] args) {
        IntAryQueue queue = new IntAryQueue(5);
        queue.enqueue(10);
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(14);
        queue.enqueue(6);

        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("peek = " + queue.peek());
        System.out.println("peek = " + queue.peek());
        queue.enqueue(7);
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("peek = " + queue.peek());
    }
}
