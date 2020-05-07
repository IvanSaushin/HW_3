package Lesson_3;

public interface DeQueue<E> extends Queue<E>{

    boolean insertRight(E value);

    E removeLeft();

    E peekRear();

}
