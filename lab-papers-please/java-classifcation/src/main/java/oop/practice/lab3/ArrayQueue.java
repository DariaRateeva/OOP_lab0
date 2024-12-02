package oop.practice.lab3;

import java.util.NoSuchElementException;

public class ArrayQueue<T> implements Queue<T> {
    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        //generic array
        data = (T[]) new Object[capacity];
        size = 0;
    }

    @Override
    public void enqueue(T item) {
        if (size == data.length) throw new IllegalStateException("Queue is full");
        data[size] = item;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        T item = data[0];
        for (int i = 0; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
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
