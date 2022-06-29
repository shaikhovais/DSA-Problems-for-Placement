package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class implementStackUsingQueue {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}

class Stack {
    Queue <Integer> q = new LinkedList<>();

    void push(int data) {
        q.add(data);
        for(int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }

    int pop() {
        if(q.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return q.remove();
        }
    }

    int peek() {
        if(q.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return q.peek();
        }
    }

    int size() {
        return q.size();
    }
}
