package Lesson_3_HW;

import Lesson_3.Queue;

public interface DeQueue<E> extends Queue<E> {

    boolean insertRight(E value);

    E removeLeft();

    E peekRear();

}