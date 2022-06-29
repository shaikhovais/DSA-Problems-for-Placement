package StackAndQueue;

public class implementQueueUsingArray {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.remove());
        System.out.println(q.size());
        System.out.println(q.remove());
        q.add(3);
        q.add(4);
        q.add(3);
        q.add(4);
    }
}

class Queue {
    private int arr[];
    private int front; private int rear;
    private int currSize; private int maxSize;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
        currSize = 0;
    }

    public void add(int data) {
        if(currSize == maxSize) {
            System.out.println("Queue is full \n Exiting ...");
            System.exit(1);
        }
        if(rear == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % maxSize;
        }
        arr[rear] = data;
        currSize++;
    }

    public int remove() {
        if(front == -1) {
            System.out.println("Queue is empty \n Exiting ...");
            System.exit(1);
        }
        int popped = arr[front];
        front = (front + 1) % maxSize;
        currSize--;
        return popped;
    }

    public int peek() {
        if(front == -1) {
            System.out.println("Queue is empty \n Exiting ...");
            System.exit(1);
        }
        return arr[front];
    }

    public int size() {
        return currSize;
    }
}