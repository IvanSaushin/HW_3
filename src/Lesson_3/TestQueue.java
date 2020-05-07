package Lesson_3;

public class TestQueue {

    private static final String numbers = "1 2 3 4 5 6 7 8 9";

    public static void main(String[] args) {

//2-е задание
        Stack<Character> backDirection = new StackImpl<>(numbers.length());
        Queue<Character> straightDirection = new QueueImpl<>(numbers.length());
        final char [] ch = numbers.toCharArray();

        System.out.println("Stack - back direction");
        while (!backDirection.isFull()) {
            for (int i = 0; i < ch.length; i++) {
                backDirection.push(ch[i]);
            }
        }
        while (!backDirection.isEmpty()) {
            System.out.print(backDirection.pop());
        }
        System.out.println();

        System.out.println("Queue - straight direction");
        for (int i = 0; i < ch.length; i++) {
            straightDirection.insertLeft(ch[i]);
        }
        while (!straightDirection.isEmpty()) {
            System.out.print(straightDirection.removeRight());
        }

//3-е задание
        DeQueue<Integer> q = new DeQueueImpl<>(5);

        System.out.println(q.insertRight(1));


        System.out.println(q.insertLeft(1));
        System.out.println(q.insertLeft(2));
        System.out.println(q.insertLeft(3));
        System.out.println(q.insertLeft(4));
        System.out.println(q.insertLeft(5));
        System.out.println(q.insertLeft(6));
        System.out.println(q.removeRight());
        System.out.println(q.removeRight());
        System.out.println(q.removeLeft());
        System.out.println(q.removeLeft());

        System.out.println("Peek "+q.peekFront());
        System.out.println("Rear "+q.peekRear());
        System.out.println("size: " + q.size());

        while (!q.isEmpty()) {
            System.out.println(q.removeRight());
        }
    }

}
