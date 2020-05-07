package Lesson_3;

public class Brackets2 {

    private static String string = "public static void main(String[] args)){StackImpl<String> stachObj = new StackImpl<>(string.length());}";

    public static void main(String[] args) {
        StackImpl<Character> st = new StackImpl(string.length());

        System.out.println(string.charAt(38));

        for (int i = 0; i < string.length(); i++) {
            Character charIndex = string.charAt(i);
            switch (charIndex) {
                case '(':
                case '{':
                case '[':
                    st.push(charIndex);
                    break;
                case ')':
                case '}':
                case ']':
                    if (st.isEmpty()) {
                        System.out.println("Massive empty, Error " + charIndex + " at " + i);
                        break;
                    }
                    Character lastChar = st.pop();
                    if (charIndex == ')' && lastChar != '(' ||
                                charIndex == '}' && lastChar != '{' ||
                                charIndex == ']' && lastChar != '[') {
                            System.out.println("Error " + lastChar + " at " + i);
                        }
                    }
            }
        if (!st.isEmpty()) {
            System.out.println("Error: missing bracket ");
        } else System.out.println("Обход завершен");
    }

}
