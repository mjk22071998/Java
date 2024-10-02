package com.thealgorithms.datastructures.lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SortedLinkedListTest {
    
    @Test
    public void testInsert() {
        SortedLinkedList list = new SortedLinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(7);
        assertEquals("3, 5, 7", list.toString());
    }

    @Test
    public void testDelete() {
        SortedLinkedList list = new SortedLinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(7);
        assertTrue(list.delete(5));
        assertEquals("3, 7", list.toString());
        assertFalse(list.delete(10));
    }

    @Test
    public void testSearch() {
        SortedLinkedList list = new SortedLinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(7);
        assertTrue(list.search(5));
        assertFalse(list.search(10));
    }

    @Test
    public void testMinValue() {
        SortedLinkedList list = new SortedLinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(7);
        assertEquals(3, list.minValue());
    }

    @Test
    public void testMaxValue() {
        SortedLinkedList list = new SortedLinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(7);
        assertEquals(7, list.maxValue());
    }

    @Test
    public void testEmptyList() {
        SortedLinkedList list = new SortedLinkedList();
        assertEquals("", list.toString());
        assertFalse(list.delete(5));
        assertFalse(list.search(5));
        assertEquals(0, list.minValue());
        assertEquals(0, list.maxValue());
    }
    @Test
    public void testIsEmpty_onEmptyList() {
        SortedLinkedList list = new SortedLinkedList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testIsEmpty_onNonEmptyList() {
        SortedLinkedList list = new SortedLinkedList();
        list.insert(10);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testIsEmpty_afterDeletion() {
        SortedLinkedList list = new SortedLinkedList();
        list.insert(10);
        list.delete(10);
        assertTrue(list.isEmpty());
    }
}