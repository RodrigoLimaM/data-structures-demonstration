package test;

import org.junit.jupiter.api.Test;
import util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ListTest {

    @Test
    void isEmpty() {
        List<Integer> emptyList = new List<>();
        assertTrue(emptyList.isEmpty());

        List<Integer> notEmptyList = new List<>(1);
        assertFalse(notEmptyList.isEmpty());
    }

    @Test
    void add() {
        List<Integer> expected = new List<>(1,2);
        List<Integer> actual = new List<>();
        actual.add(1,0);
        actual.add(2,1);
        assertEquals(expected.toString(), actual.toString());
        expected = new List<>(1,2,3);
        actual = new List<>(1,3);
        actual.add(2, 1);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void addLast() {
        List<Integer> expected = new List<>(1,2,3);
        List<Integer> actual = new List<>();
        actual.addLast(1);
        actual.addLast(2);
        actual.addLast(3);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void addFirst() {
        List<Integer> expected = new List<>(1,2,3);
        List<Integer> actual = new List<>();
        actual.addFirst(3);
        actual.addFirst(2);
        actual.addFirst(1);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void remove() {
        List<Integer> expected = new List<>(1);
        List<Integer> actual = new List<>(1,2,3);
        actual.remove(1);
        actual.remove(1);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void removeLast() {
        List<Integer> expected = new List<>();
        List<Integer> actual = new List<>(1,2,3);
        actual.removeLast();
        actual.removeLast();
        actual.removeLast();
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void removeFirst() {
        List<Integer> expected = new List<>();
        List<Integer> actual = new List<>(1,2,3);
        actual.removeFirst();
        actual.removeFirst();
        actual.removeFirst();
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void sort() {
        List<Integer> actual = new List<>(5,3,1,4);
        List<Integer> expected = new List<>(1,3,4,5);
        actual.sort();
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void size() {
        List<Integer> actual = new List<>(1,3,4,5);
        assertEquals(4, actual.size());
    }

    @Test
    void getData() {
        List<Integer> actual = new List<>(1,3,4,5);
        assertEquals(4, actual.getData(2));
    }

    @Test
    void getFirstData() {
        List<Integer> actual = new List<>(1,3,4,5);
        assertEquals(1, actual.getFirstData());
    }

    @Test
    void getLastData() {
        List<Integer> actual = new List<>(1,3,4,5);
        assertEquals(5, actual.getLastData());
    }

    @Test
    void binarySearch() {
        List<Integer> list = new List<>(1,3,4,5);
        assertTrue(list.binarySearch(3));
        assertFalse(list.binarySearch(2));
    }

    @Test
    void indexOf() {
        List<Integer> actual = new List<>(1,3,4,5);
        assertEquals(1, actual.indexOf(3));
        assertEquals(-1, actual.indexOf(2));
    }

    @Test
    void isSingleElement() {
        List<Integer> shouldBeTrue = new List<>(1);
        List<Integer> shouldBeFalse = new List<>(1,3,4,5);
        assertTrue(shouldBeTrue.isSingleElement());
        assertFalse(shouldBeFalse.isSingleElement());
    }
}