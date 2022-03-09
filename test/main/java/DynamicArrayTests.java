package main.java;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DynamicArrayTest {
    private DynamicArray array;
    @BeforeEach
    public void setUp() {
        array = new DynamicArray<String>(2);
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void GetAndSet() throws Exception {
        array.set(0, "a");
        assertEquals("a", array.get(0));
    }

    @Test
    public void Insert() {
        array.add("a");
        array.add("b");
        array.add("c");

        array.insert(1, "d");

        assertEquals(4, array.size());
        assertEquals("a", array.get(0));
        assertEquals("d", array.get(1));
        assertEquals("b", array.get(2));
        assertEquals("c", array.get(3));


    }
}
