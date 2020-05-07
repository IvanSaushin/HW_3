package Lesson_3_HW;

public interface Stack<E> {

    int size() ;

    default boolean isEmpty(){
        return size() == 0;
    } ;

    public void push(E value) ;

    boolean isFull();

    E pop();

    E peek();


}
