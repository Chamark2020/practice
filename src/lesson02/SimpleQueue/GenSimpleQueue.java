package lesson02.SimpleQueue;

class GenSimpleQueue <T>{
    private int maxSize;
    private T[] queueArray;
    private int front;
    private int rare;
    private int nItems;

    public GenSimpleQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = (T[])new Object[maxSize];
        this.front = 0;
        this.rare = -1;
        this.nItems = 0;
    }

    public void insert(T element) {
        if (rare == maxSize - 1) {
            rare = -1;
        }
        queueArray[++rare] = element;
        if (this.nItems < maxSize) {
            nItems++;
        }
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public T remove() {
        T tmp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return tmp;
    }
}
class GenQueueMain {
    public static void main(String[] args) {
        /*GenSimpleQueue<Integer> genSimpleQueue = new GenSimpleQueue<>(10);

        genSimpleQueue.insert(10);
        genSimpleQueue.insert(20);
        genSimpleQueue.insert(30);
        genSimpleQueue.insert(40);
        genSimpleQueue.remove();

        while (!genSimpleQueue.isEmpty()) {
            int n = genSimpleQueue.remove();
            System.out.print(n + " ");
        }*/

        GenSimpleQueue<String> stringGenSimpleQueue = new GenSimpleQueue<>(4);

        stringGenSimpleQueue.insert("q");
        stringGenSimpleQueue.insert("w");
        stringGenSimpleQueue.insert("e");
        stringGenSimpleQueue.insert("r");
        stringGenSimpleQueue.insert("t");
        stringGenSimpleQueue.insert("y");

        while (!stringGenSimpleQueue.isEmpty()) {
            String tmp = stringGenSimpleQueue.remove();
            System.out.print(tmp + " ");
        }



    }
}
