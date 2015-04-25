package practice.app.algorithms.struct;

/**
 * Created by SeASolovev on 15.04.2015.
 */
public class QueueUtils
{
    public static void checkQueue(){
        CyclicQueue theQueue = new CyclicQueue(5);
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        System.out.println("Remove: "+ theQueue.remove());
        System.out.println("Remove: "+ theQueue.remove());
        System.out.println("Remove: "+ theQueue.remove());

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty()){
            Integer o = theQueue.remove();
            System.out.print(o);
            System.out.print(" ");
        }  System.out.println(" ");
    }

    public static void checkQueueLimkBased(){
        QueueLinkBased queueLinkBased = new QueueLinkBased();
        queueLinkBased.add(10);
        queueLinkBased.add(30);
        queueLinkBased.add(50);
//        queueLinkBased.remove(30);
        System.out.println(" queueLinkBased.remove(30) : "+ queueLinkBased.remove(30));
        queueLinkBased.add(70);
        queueLinkBased.add(60);
        System.out.println(" queueLinkBased.remove(90) : "+ queueLinkBased.remove(90));
        while(!queueLinkBased.isEmpty()){
            System.out.println(queueLinkBased.poll());
        }
        System.out.println(queueLinkBased);
    }
}
