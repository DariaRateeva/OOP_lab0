package oop.practice.lab3;

import java.util.NoSuchElementException;

public class CircularQueue<T> implements Queue<T> {
    private T[] data;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {
        data = (T[]) new Object[capacity];
        front = rear = size = 0;
    }

    @Override
    public void enqueue(T item) {
        if (size == data.length) throw new IllegalStateException("Queue is full");
        data[rear] = item;
        rear = (rear + 1) % data.length;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        T item = data[front];
        front = (front + 1) % data.length;
        size--;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
