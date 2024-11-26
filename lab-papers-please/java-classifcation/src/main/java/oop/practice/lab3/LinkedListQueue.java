package oop.practice.lab3;

import java.util.NoSuchElementException;

public class LinkedListQueue<T> implements Queue<T> {
    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> head, tail;
    private int size;

    @Override
    public void enqueue(T item) {
        Node<T> node = new Node<>(item);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = tail;
        }
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        T item = head.value;
        head = head.next;
        if (head == null) tail = null;
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
