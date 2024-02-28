package QueueProg;

import java.util.Scanner;

public class QueueImpl {

	static int[] queue;
	static int front;// front and rear are by default with zero
	static int rear;

	static void createQueue(int size) {
		queue = new int[size];
		System.out.println("queue had been created with size: " + size);
	}

	static void enqueue(int ele) {
		if (rear == queue.length) {// rear is outside the queue
			System.out.println("Queue is full....!!!!");
		} else {
			queue[rear] = ele;
			rear++;
			System.out.println(ele + " had been inserted into queue...!!!");
		}
	}

	static void display() {
		if (rear == 0) {
			System.out.println("Queue is empty....!!!");
		} else {
			for (int i = front; i < rear; i++) {
				System.out.println(queue[i] + " ");
			}
			System.out.println();
		}
	}

	static void dequeue() {
		if (rear == 0) {
			System.out.println("Queue is empty..!!!");
		} else {
			System.out.println(queue[front] + " got deleted from queue");
			for (int i = front; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}
			rear--;
			queue[rear] = 0;
		}
	}

	static boolean isEmpty() {
		return rear == 0;
	}

	static boolean isFull() {
		return rear == queue.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======Welocome to Queue==========");
		while(true) {
			System.out.println("1.create queue\n2.enqueue\n3.display\n4.dequeue\n5.exit");
			System.out.println("enter the option:");
			
		}

//		createQueue(5);
//		display();
//		enqueue(10);
//		enqueue(20);
//		enqueue(30);
//		enqueue(40);
//		enqueue(50);
//		display();
//		enqueue(60);
//		dequeue();
//		dequeue();
//		dequeue();
//		display();

	}
}
