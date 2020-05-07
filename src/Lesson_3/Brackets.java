package Lesson_3;

public class Brackets {

    private static String string = "public static void main(String[] args){StackImpl<String> stachObj = new StackImpl<>(string.length());}";

    public static void main(String[] args) {
//        StackImpl<Character> stackObj = new StackImpl<>(string.length());
        StackImpl<Character> stack = new StackImpl(string.length());
        char[] arrayOfString = string.toCharArray();

        System.out.println(string.length());

        for (int i = 0; i < string.length(); i++) {
            Character ch = arrayOfString[i];

            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    System.out.println("Push is "+stack.peek());
                    break;
            }
            switch (ch) {
                case ')':
                case ']':
                case '}':
                    if (!stack.isEmpty()) {
                        if (')' == ch && stack.peek() == '(' || stack.peek() == '[' && ch == ']' ||
                                stack.peek() == '{' && ch == '}') {
                            System.out.println("Удаляем: " + stack.peek());
                            stack.pop();
                        } else {
                            System.out.println("Error at " + i + " elemet of string: " + arrayOfString[i]);
//                        System.out.println(stack.peek() + "- its not the same that -"+ ch);
                        }
                        break;
                    } else
                        System.out.println("Error at " + i + " elemet of string: " + arrayOfString[i]);
            }
        }
        if (stack.isEmpty() == true) {
            System.out.println("Обход закончен. stack пустой, Всё верно");
        } else
            System.out.println("В массиве остался символ: " + stack.peek());
    }

}
