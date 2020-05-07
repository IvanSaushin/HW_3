package Lesson_3;

public class DeQueueImpl<E> extends QueueImpl<E> implements DeQueue<E> {


    public DeQueueImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        }
        if (head == data.length-1) {
            head = DEFAULT_HEAD;
            return false;
        }
        data[++head] = value;
        size++;
        return true;
    }

    @Override
    public E removeLeft() {
        if (isEmpty()) return null;

        if(tail == data.length) {
            tail = DEFAULT_HEAD;
            return null;
        }
        E removedValue = data[tail--];
        size--;
        return removedValue;
    }

    @Override
    public E peekRear() {
        return data[tail];
    }
}
