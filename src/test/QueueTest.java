package test;

import org.junit.jupiter.api.Test;
import util.Queue;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueTest {

    @Test
    void isEmpty() {
        Queue<Integer> emptyList = new Queue<>();
        assertTrue(emptyList.isEmpty());

        Queue<Integer> notEmptyList = new Queue<>(1);
        assertFalse(notEmptyList.isEmpty());
    }

    @Test
    void enqueue() {
        Queue<Integer> expected = new Queue<>(1,2,3);
        Queue<Integer> actual = new Queue<>();
        actual.enqueue(1);
        actual.enqueue(2);
        actual.enqueue(3);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void dequeue() {
        Queue<Integer> expected = new Queue<>();
        Queue<Integer> actual = new Queue<>(1,2,3);
        actual.dequeue();
        actual.dequeue();
        actual.dequeue();
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void sort() {
        Queue<Integer> actual = new Queue<>(5,3,1,4);
        Queue<Integer> expected = new Queue<>(1,3,4,5);
        actual.sort();
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void size() {
        Queue<Integer> actual = new Queue<>(1,3,4,5);
        assertEquals(4, actual.size());
    }

    @Test
    void getData() {
        Queue<Integer> actual = new Queue<>(1,3,4,5);
        assertEquals(4, actual.getData(2));
    }

    @Test
    void getFirstData() {
        Queue<Integer> actual = new Queue<>(1,3,4,5);
        assertEquals(1, actual.getFirstData());
    }

    @Test
    void getLastData() {
        Queue<Integer> actual = new Queue<>(1,3,4,5);
        assertEquals(5, actual.getLastData());
    }

    @Test
    void binarySearch() {
        Queue<Integer> list = new Queue<>(1,3,4,5);
        assertTrue(list.binarySearch(3));
        assertFalse(list.binarySearch(2));
    }

    @Test
    void indexOf() {
        Queue<Integer> actual = new Queue<>(1,3,4,5);
        assertEquals(1, actual.indexOf(3));
        assertEquals(-1, actual.indexOf(2));
    }
}