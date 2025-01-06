import java.util.*;

public class ex71
{
        public static void main(String[] args) 
	{

		Queue oqueue=new LinkedList();

        	oqueue.add("1");
	        oqueue.add("2");
	        oqueue.add("3");
	        oqueue.add("4");
	        oqueue.add("5");

	        Iterator itr=oqueue.iterator();

	        System.out.println("Initial Size of Queue :"+oqueue.size());
	
        	while(itr.hasNext())
	        {
	            String iteratorValue=(String)itr.next();
	            System.out.println("Queue Next Value :"+iteratorValue);
	        }

	        // get value and does not remove element from queue
	        System.out.println("Queue peek :"+oqueue.peek());

	        // get first value and remove that object from queue
	        System.out.println("Queue poll :"+oqueue.poll());

	        System.out.println("Final Size of Queue :"+oqueue.size());
	}
}