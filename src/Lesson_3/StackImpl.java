package Lesson_3;

import java.util.Objects;

public class StackImpl<E> implements Stack<E> {

    private E[] data;
    private int size;

    public StackImpl(int maxSize)  {
        this.data = (E[]) new Object[maxSize];
    }

    @Override
    public void push(E value) {
        data[size++] = value;
    }

    @Override
    public E pop() {
        return data[--size];
    }

    @Override
    public E peek() {
        return data[size-1];
    }


    @Override
    public boolean isFull() {
        return size== data.length;
    }

    @Override
    public int size() {
        return size;
    }
}
