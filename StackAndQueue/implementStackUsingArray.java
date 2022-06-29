package StackAndQueue;

public class implementStackUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.peek());
    }
}

class Stack {
    int size = 1000;
    int arr[] = new int[size];
    int top = -1;
    
    void push(int x) {
        top++;
        arr[top] = x;
    }

    int pop() {
        if(top == -1) {
            System.out.println("Empty Stack Exception");
            return -1;
        } else {
            int x = arr[top];
            top--;
            return x;
        }
    }

    int peek() {
        if(top == -1) {
            System.out.println("Empty Stack Exception");
            return -1;
        } else {
            return arr[top];
        }
    }

    int size() {
        return top + 1;
    }

}