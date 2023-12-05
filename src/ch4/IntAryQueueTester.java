package ch4;

public class IntAryQueueTester {
    public static void main(String[] args) {
        IntAryQueue queue = new IntAryQueue(5);
        queue.inqueue(10);
        queue.inqueue(5);
        queue.inqueue(3);
        queue.inqueue(14);
        queue.inqueue(6);

        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("peek = " + queue.peek());
        System.out.println("peek = " + queue.peek());
        queue.inqueue(7);
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("dequeue = " + queue.dequeue());
        System.out.println("peek = " + queue.peek());
    }
}
