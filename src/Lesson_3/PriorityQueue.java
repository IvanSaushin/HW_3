package Lesson_3;

public class PriorityQueue<E extends Object & Comparable> extends QueueImpl<E> {

    public PriorityQueue(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean insertLeft(E value) {
        if (!isFull()) {
            return false;
        }

        int index;
        for (index = size()-1; index>=0; index--) {
            if (value.compareTo(data[index]) > 0) {
                data[index+1] = data[index];
            } else {
                break;
            }
        }
        data[index+1] = value;
        size++;
        return true;
    }
}
