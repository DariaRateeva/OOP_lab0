package oop.practice.lab3;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void testArrayQueueFullAndEmpty() {
        Queue<Integer> queue = new ArrayQueue<>(3);
        assertTrue(queue.isEmpty());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(3, queue.size());

        assertThrows(IllegalStateException.class, () -> queue.enqueue(4));

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(1, queue.size());
        assertEquals(3, queue.dequeue());
        assertTrue(queue.isEmpty());

        assertThrows(NoSuchElementException.class, queue::dequeue);
    }


    @Test
    public void testLinkedListQueueEdgeCases() {
        Queue<String> queue = new LinkedListQueue<>();
        assertTrue(queue.isEmpty());

        queue.enqueue("First");
        assertEquals("First", queue.dequeue());
        assertTrue(queue.isEmpty());

        assertThrows(NoSuchElementException.class, queue::dequeue); // Empty queue

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        assertEquals("A", queue.dequeue());
        assertEquals("B", queue.dequeue());
        assertEquals("C", queue.dequeue());
        assertTrue(queue.isEmpty());
    }


    @Test
    public void testCircularQueueWrapAround() {
        Queue<Integer> queue = new CircularQueue<>(3);
        assertTrue(queue.isEmpty());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertThrows(IllegalStateException.class, () -> queue.enqueue(4)); // Full queue

        assertEquals(1, queue.dequeue());
        queue.enqueue(4);
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertEquals(4, queue.dequeue());
        assertTrue(queue.isEmpty());

        assertThrows(NoSuchElementException.class, queue::dequeue); // Empty queue
    }

}

