import java.util.Stack;

public class Main {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.peek();
                if ((ch == ')' && last == '(') || (ch == '}' && last == '{') || (ch == ']' && last == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isBalanced("(){}[]")); // true
        System.out.println(isBalanced("({[]})")); // true
        System.out.println(isBalanced("({[)]}"));// false
    }
}
