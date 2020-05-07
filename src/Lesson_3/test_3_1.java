package Lesson_3;

import Lesson_3.Stack;

public class test_3_1 {

    public static void main(String[] args) {
        testSimpleStack();
    }

    private static void testSimpleStack() {
        Stack<Integer> s1 = new StackImpl<>(5);
        System.out.println("Пустой? - "+ s1.isEmpty());
        System.out.println("Полный? - "+s1.isFull());

        s1.push(54);
        s1.push(3);
        s1.push(2);
        s1.push(1);
        System.out.println(addToValue(s1, 1));
        System.out.println(addToValue(s1, 34));
        System.out.println(addToValue(s1, 324));
        System.out.println(addToValue(s1, 12345));

        System.out.println("Пустой? - "+s1.isEmpty());
        System.out.println("Полный? - "+s1.isFull());

        System.out.println("Last value is " + s1.pop());
        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
        }

    }

    private static boolean addToValue(Stack<Integer> stack, int value) {
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }
        else
            return false;
    }

}


//    private static int size = 5;
//
//    public static void main(String[] args) {
//        Stack cl = new Stack(size);
//
//        System.out.println("пустой? - " + cl.isEmpty());
//        System.out.println("полный? - " +cl.isFull());
//
//        for (int i = 0; i < size; i++) {
//            cl.push(i*2);
//            System.out.print("добивили элемент " +cl.peek());
//        }
//
//        System.out.println("пустой? - " +cl.isEmpty());
//        System.out.println("полный? - " +cl.isFull());
//        cl.pop();
//        System.out.println("последний элемент после удаления " +cl.peek());
//        System.out.println("полный? - " +cl.isFull());
