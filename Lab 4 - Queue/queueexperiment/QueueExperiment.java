package queueexperiment;

/**
 *
 * @author Simon
 * Name : Chong Yu
 * Program: Software Engineering
 * Course : CSF3013
 * Lab : MP1
 * Date : 10/11/2025
 */
public class QueueExperiment {
    public static void main(String[] args) {
        /*
        CharQueue myQueue = new CharQueue(10);
        myQueue.enqueue ('a');
        myQueue.enqueue ('b');
        myQueue.enqueue ('c') ;
        myQueue.enqueue ('d');
        myQueue.dequeue () ;
        myQueue.dequeue () ;
        myQueue.enqueue ('e');
        myQueue.enqueue ('f');
        myQueue.enqueue ('g');
        myQueue.enqueue ('h');
        myQueue.enqueue ('i') ;
        myQueue.enqueue ('j') ;
        myQueue.enqueue ('k');
        myQueue.enqueue ('1');
        
        myQueue.displayAllElements();
        */
        
        // Testing circular queue
        /*
        CircularQueue <Integer> circularQueue = new CircularQueue(8);
        
        circularQueue.enqueue (15);
        circularQueue.enqueue (16);
        circularQueue.enqueue (17);
        circularQueue.enqueue (18);
        circularQueue.enqueue (19);
        circularQueue.enqueue (20);
        circularQueue.enqueue (21);
        circularQueue.enqueue (22);

        System.out.println ("Full Circular Queue" + circularQueue);

        System.out.print ("Dequeued following element from circular Queue ") ;
        System.out.println (circularQueue.dequeue() + " ") ;
        circularQueue.enqueue (23);
        System.out.println ("After enqueueing circular queue with element having value 23") ;
        System.out.println (circularQueue);
        */
        
        CircularQueue <String> circularQueue = new CircularQueue(8);
        
        circularQueue.enqueue ("Iltizam");
        circularQueue.enqueue ("tekad");
        circularQueue.enqueue ("rajin");
        circularQueue.enqueue ("usaha");
        circularQueue.enqueue ("berjaya");
        circularQueue.enqueue ("konsisten");
        circularQueue.enqueue ("yakin");
        circularQueue.enqueue ("tabah");

        System.out.println ("Full Circular Queue: " + circularQueue);

        System.out.print ("Dequeued following element from circular Queue: ") ;
        System.out.println (circularQueue.dequeue() + " ") ;
        circularQueue.enqueue ("kuat");
        System.out.println ("After enqueueing circular queue with element having string kuat") ;
        System.out.println (circularQueue);
    }
    
}
