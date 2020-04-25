package dev.wonho.leetcode.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCacheTest {

    @Test
    public void test_Example1() {
        LRUCache cache = new LRUCache( 2);

        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));
        cache.put(3, 3);    // evicts key 2
        assertEquals(-1, cache.get(2));
        cache.put(4, 4);    // evicts key 1
        assertEquals(-1, cache.get(1));
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }

    @Test
    public void test_Example2() {
        LRUCache cache = new LRUCache( 2);

        assertEquals(-1, cache.get(2));
        cache.put(2, 6);
        assertEquals(-1, cache.get(1));
        cache.put(1, 5);
        cache.put(1, 2);
        assertEquals(2, cache.get(1));
        assertEquals(6, cache.get(2));
    }

    @Test
    public void test_Example3() {
        LRUCache cache = new LRUCache( 2);

        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);
        assertEquals(-1, cache.get(1));
        assertEquals(3, cache.get(2));
    }

    @Test
    public void test_Example4() {
        LRUCache cache = new LRUCache( 1);

        cache.put(2, 1);
        assertEquals(1, cache.get(2));
        cache.put(3, 2);
        assertEquals(-1, cache.get(2));
        assertEquals(2, cache.get(3));
    }

    @Test
    public void test_Example5() {
        LRUCache cache = new LRUCache( 2);

        cache.put(2, 1);
        cache.put(2, 2);
        assertEquals(2, cache.get(2));
        cache.put(1, 1);
        cache.put(4, 1);
        assertEquals(-1, cache.get(2));
    }

    @Test
    public void test_Example6() {
        LRUCache cache = new LRUCache( 3);

        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        assertEquals(4, cache.get(4));
        assertEquals(3, cache.get(3));
        assertEquals(2, cache.get(2));
        assertEquals(-1, cache.get(1));
        cache.put(5, 5);
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
        assertEquals(3, cache.get(3));
        assertEquals(-1, cache.get(4));
        assertEquals(5, cache.get(5));
    }

}