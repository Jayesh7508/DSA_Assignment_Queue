package queue;

public class Class_Double_Ended_Queue {
	 private int Q[];
	    private int MaxSize;
	    private int front1, rear1; 
	    private int front2, rear2,mid; 

	   public void Create_Queues(int size)
	   {
	        MaxSize = size;
	        Q = new int[size];
	        front1 = 0;
	        rear1 = -1;
	        front2 = size-1;
	        rear2 = size;
	        mid=size/2;
	    }

	     void Enqueue1(int e) 
	     {
	        if (rear1 + 1 == mid || rear1 + 1 == rear2)
	       { 
	            System.out.println("Queue 1 is full");
	            
	        }
	        rear1++;
	        Q[rear1] = e;
	        }

	     void Enqueue2(int e)
	       {
	        if (rear2 - 1 == mid || rear2 - 1 == rear1)
	       { 
	            System.out.println("Queue 2 is full");
	            
	        }
	       
	        rear2--;
	        Q[rear2] = e;
	       }

	    int Dequeue1() 
	      {
	        if (rear1 < front1) 
	      {
	            System.out.println("Queue 1 is empty");
	            
	        }
	        int temp = Q[front1];
	        front1++;
	        return temp;
	       }

	    int Dequeue2() 
	        {
	        if (rear2 >= front2) 
	        {
	            System.out.println("Queue 2 is empty");
	            
	        }
	        int temp= Q[front2];
	        front2++;
	        return temp;
	       }

	     void printQueue1()
	      {
	        if (rear1 < front1)
	        {
	            System.out.println("Queue 1 is empty");
	           
	        }
	        System.out.println("Queue1 has");
	        for (int i = front1; i <= rear1; i++)
	       {
	           System.out.print(Q[i]+"--");
	        }
	        
	       }

	     void printQueue2() 
	      {
	        if (rear2 >= front2)
	        {
	            System.out.println("Queue 2 is empty");
	            
	        }
	        System.out.println("Queue2 has");
	        for (int i = front2; i >= rear2; i--) 
	       {
	            System.out.print(Q[i]+"--");
	       
	       }
	      }
}
