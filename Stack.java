class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int x) {
        maxSize = x;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int y) {
        if (top < maxSize - 1) {
            stackArray[++top] = y;
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        }
        return -1; // Indicates stack underflow
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        }
        return -1; // Indicates stack underflow
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
