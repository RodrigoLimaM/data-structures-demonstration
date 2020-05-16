package test;

import org.junit.jupiter.api.Test;
import util.Stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StackTest {

    @Test
    void isEmpty() {
        Stack<Integer> emptyList = new Stack<>();
        assertTrue(emptyList.isEmpty());

        Stack<Integer> notEmptyList = new Stack<>(1);
        assertFalse(notEmptyList.isEmpty());
    }

    @Test
    void addLast() {
        Stack<Integer> expected = new Stack<>(1,2,3);
        Stack<Integer> actual = new Stack<>();
        actual.push(1);
        actual.push(2);
        actual.push(3);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void removeLast() {
        Stack<Integer> expected = new Stack<>();
        Stack<Integer> actual = new Stack<>(1,2,3);
        actual.pop();
        actual.pop();
        actual.pop();
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void sort() {
        Stack<Integer> actual = new Stack<>(5,3,1,4);
        Stack<Integer> expected = new Stack<>(1,3,4,5);
        actual.sort();
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void size() {
        Stack<Integer> actual = new Stack<>(1,3,4,5);
        assertEquals(4, actual.size());
    }

    @Test
    void getData() {
        Stack<Integer> actual = new Stack<>(1,3,4,5);
        assertEquals(4, actual.getData(2));
    }

    @Test
    void getFirstData() {
        Stack<Integer> actual = new Stack<>(1,3,4,5);
        assertEquals(1, actual.getFirstData());
    }

    @Test
    void getLastData() {
        Stack<Integer> actual = new Stack<>(1,3,4,5);
        assertEquals(5, actual.getLastData());
    }

    @Test
    void binarySearch() {
        Stack<Integer> list = new Stack<>(1,3,4,5);
        assertTrue(list.binarySearch(3));
        assertFalse(list.binarySearch(2));
    }

    @Test
    void indexOf() {
        Stack<Integer> actual = new Stack<>(1,3,4,5);
        assertEquals(1, actual.indexOf(3));
        assertEquals(-1, actual.indexOf(2));
    }
}