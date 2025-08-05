package com.DSA.queue.easy;

public class QueueUsingArray {

	static class queue {

		int size;
		int arr[];
		int front = -1;
		int Rear = -1;

		queue(int n) {
			this.arr = new int[n];
			this.size = n;
			front=0;
			Rear=0;

		}

		void push(int x) {

			if (Rear >= size ) {
				System.out.println("queue is full");
			} else {

				arr[Rear++] = x;
				System.out.println("Data inserted in Queue :"+x);
			} 

		}

		int pop() {
			int x;
			
			
			if ( front < 0 || front >=Rear ) {
				System.out.println("Queue is Empty :");
				return -1;
			}
			
			
			else {
				x = arr[front];
				front++;
				System.out.println("Data Poped from the Queue :"+x);
			}

			return x;

		}

	}

	public static void main(String[] args) {
		queue que = new queue(5);
		que.push(1);
		que.push(3);
		que.push(5);
		que.push(7);
		que.push(9);
		que.push(10);
		
		que.pop();
		que.pop();
		que.pop();
		que.pop();
		que.pop();
		que.pop();
		
		

	}

}
