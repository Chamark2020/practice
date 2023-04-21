package lesson02.SimpleQueue;

import java.util.Arrays;

class SimpleStackGen <T> {
    private int maxSize;
    private T[] stackArray;
    private int top;

    public SimpleStackGen(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = (T[]) new Object[maxSize];
        this.top = -1;
    }

    public void push(T element) {
        stackArray[++top] = element;
    }

    public T pop() {
        return stackArray[top--];
    }

    public T peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

//LiFo
class MainQueueGen {
    public static void main(String[] args) {
        SimpleStackGen <Integer> simpleStackGen = new SimpleStackGen<>(10);

        simpleStackGen.push(10);
        simpleStackGen.push(20);
        simpleStackGen.push(30);
        simpleStackGen.push(40);

        while (!simpleStackGen.isEmpty()) {
            int tmp = simpleStackGen.pop();
            System.out.print(tmp + " ");
        }

        SimpleStackGen <String> stringSimpleStackGen = new SimpleStackGen<>(11);

        stringSimpleStackGen.push("Name");
        stringSimpleStackGen.push("SurName");
        stringSimpleStackGen.push("Age");
        stringSimpleStackGen.push("City");

        while (!stringSimpleStackGen.isEmpty()) {
            String tmp = stringSimpleStackGen.pop();
            System.out.print(tmp + " ");
        }
    }
}
