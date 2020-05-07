package Lesson_3_HW;

public interface Queue<E> {

    boolean insertLeft(E value);

    E removeRight();

    E peekFront();

    int size();

    default boolean isEmpty(){
        return size() == 0;
    }

    boolean isFull();

}