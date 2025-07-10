import java.util.Scanner;

class Queue {
    private static final int MAX = 10;
    private int[] queue = new int[MAX];
    private int front = -1, rear = -1;

    // Enqueue operation
public void enqueue() {
        if (rear == MAX - 1) {
            System.out.println("Queue Overflow! Cannot enqueue.");
            return;
        }
        else
        {
        Scanner sc= new Scanner(System.in);
        if (front == -1) 
        {
            front = 0;
        }
        System.out.print("Enter element to enqueue: ");
        int item = sc.nextInt();
        queue[++rear] = item;
        System.out.println("Enqueued: " + item);
    }
}

    // Dequeue operation
public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return;
        }
        else{
        System.out.println("Dequeued: " + queue[front]);
        front++;
    }
    }

    // Display queue elements
    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

// Main Class
public class QueueImp {
    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Queue Operation");
            System.out.println("\nPress 1 to Enqueue");
            System.out.println("Press 2 to Dequeue");
            System.out.println("Press 3 to Display");
            System.out.println("Press 4 to Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    q.enqueue();
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
