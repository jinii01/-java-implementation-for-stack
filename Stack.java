public class Stack {
    private int maxSize;    // size of stack array
    private int[] stackArray;
    private int top;        // top of stack

    // Constructor
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // no items yet
    }

    // Push item onto stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push value.");
            return;
        }
        stackArray[++top] = value;
    }

    // Pop item from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop value.");
            return -1;
        }
        return stackArray[top--];
    }

    // Peek at the top of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek value.");
            return -1;
        }
        return stackArray[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5); // Stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // Stack is full, cannot push

        System.out.println("Top element is: " + stack.peek());

        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println("Popped value: " + value);
        }

        stack.pop(); // Stack is empty, cannot pop
    }
}
