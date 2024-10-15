package queue;

import java.util.Scanner;

public class Class_Double_Ended_Queue_Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Class_Double_Ended_Queue obj = new Class_Double_Ended_Queue();
        System.out.print("Enter size of the queues: ");
        int size = scanner.nextInt();
          obj.Create_Queues(size);
          int e,ch;

        do {
            System.out.println("Double Ended Queue:");
            System.out.println("1: Enqueue to Queue 1");
            System.out.println("2: Enqueue to Queue 2");
            System.out.println("3: Dequeue from Queue 1");
            System.out.println("4: Dequeue from Queue 2");
            System.out.println("5: Print Queue 1");
            System.out.println("6: Print Queue 2");
            System.out.println("0: Exit");
             ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value to enqueue to Queue 1: ");
                    e= scanner.nextInt();
                    obj.Enqueue1(e);
                    break;
                case 2:
                    System.out.print("Enter value to enqueue to Queue 2: ");
                    e = scanner.nextInt();
                    obj.Enqueue2(e);
                    break;
                case 3:
                    System.out.println("Dequeued from Queue 1: " + obj.Dequeue1());
                    break;
                case 4:
                    System.out.println("Dequeued from Queue 2: " + obj.Dequeue2());
                    break;
                case 5:
                	obj.printQueue1();
                    break;
                case 6:
                    obj.printQueue2();
                    break;
                case 0:
                    System.out.println("Exiting...");
                   System.exit(0);
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }while(ch!=0);
        
	}  
}