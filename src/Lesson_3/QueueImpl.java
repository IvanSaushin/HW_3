package Lesson_3;

public class QueueImpl<E> implements Queue<E> {

    protected static final int DEFAULT_TAIL = -1;
    protected static final int DEFAULT_HEAD = 0;

    protected final E[] data;
    protected int size;

    protected int head;
    protected int tail;

    public QueueImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        this.head = DEFAULT_HEAD;
        this.tail = DEFAULT_TAIL;
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }

        if (tail == (data.length - 1)) {
            tail = DEFAULT_TAIL;
            return false;
        }
        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) return null;

        if(head == data.length) {
            head = DEFAULT_HEAD;
            return null;
        }
        E removedValue = data[head++];
        size--;
        return removedValue;
    }

    @Override
    public E peekFront() {
        return data[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return (data.length == size);
    }
}
