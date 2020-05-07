package Lesson_3;

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


//    private int[] stack;
//    private int maxSize;
//    private int top;
//
//
//    public Stack(int size){
//        this.maxSize = size;
//        this.stack = new int[maxSize];
//        this.top=-1;
//    }
//
//    public boolean isFull() {
//        return (this.top == this.maxSize-1);
//    }
//
//    public boolean isEmpty() {
//        return (this.top == -1);
//    }
//
//    public void push(int value) {
//        stack[++top] = value;
//    }
//
//    public int pop(){
//        return this.stack[this.top--];
//    }
//
//    public int peek() {
//        return stack[top];
//    }