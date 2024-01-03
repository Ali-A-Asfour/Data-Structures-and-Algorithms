class Queue {
    private int[] queueArray;
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int x) {
        maxSize = x;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int y) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = y;
        nItems++;
    }

    public int dequeue() {
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public int peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
