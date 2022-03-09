package main.java;

public class DynamicArray<T> {
    private T[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        this.size = 0;
        this.data = (T[]) new Object[initialCapacity];
    }

    public void set(int index, String a) {
        this.data[index] = (T) a;
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public T get(int index) {
        return (T)this.data[index];
    }

    public void add(String a) {
        // Check Size
        if (this.size == this.initialCapacity) {
            this.resize();
        }
        // Insert
        data[size] = (T) a;
        this.size++;
    }

    private void resize() {
        T[] newData = (T[]) new Object[this.initialCapacity * 2];
        for (int i = 0; i < this.initialCapacity; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
        this.initialCapacity = this.initialCapacity * 2;
    }

    public void insert(int i, String d) {
        // Check Size
        if (this.size == this.initialCapacity) {
            this.resize();
        }
        // Copy up
        for (int j = this.size; j > i; j--) {
            this.data[j] = this.data[j - 1];
        }
        // Insert
        data[i] = (T) d;
        this.size++;

    }
}
