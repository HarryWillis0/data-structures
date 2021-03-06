/**
 * Test program for ArrayQueue.java
 * 
 * @author Harry Willis
 */
public class ArrayQueueTest {
    public static void main(String[] args){
        ArrayQueue<Integer> intQueue = new ArrayQueue<Integer>();
        try {
            // toString test
            System.out.println(intQueue.toString());

            System.out.println("Enqueuing \"1\", \"-40\", \"666\" \"0\", \"999\", and \"123456\"");
            // enqueue tests
            intQueue.enqueue(1);
            intQueue.enqueue(-40);
            intQueue.enqueue(666);
            intQueue.enqueue(0);
            intQueue.enqueue(999);
            intQueue.enqueue(123456);

            System.out.println("Queue now:\n\t" + intQueue.toString());

            // dequeue test
            System.out.println("Dequeuing:\n\t" + intQueue.dequeue());

            // poll test
            System.out.println("Polling:\n\t" + intQueue.poll());

            System.out.println("Queue now:\n\t" + intQueue.toString());

            // more dequeuing
            System.out.println("Dequeuing 5 elements:\n\t" + intQueue.dequeue() + "\n\t" + intQueue.dequeue() + "\n\t" + intQueue.dequeue() + "\n\t" + intQueue.dequeue() + "\n\t" + intQueue.dequeue());

            // isEmpty test
            System.out.println("Is queue empty?\n\t" + intQueue.isEmpty());

            System.out.println("Queue now:\n\t" + intQueue.toString());
            
        } catch (Exception e) {
            System.out.println("Queue empty");
        }
    }
}