import stack.IStack;

public class ExpressionConverter {

    public static String infixToPostfix(String expression, IStack<Character> stack) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                output.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(" ").append(stack.pop());
                }
                stack.pop();
            }
            else {
                output.append(" ");
                while (!stack.isEmpty() &&
                        precedence(ch) <= precedence(stack.peek())) {
                    output.append(stack.pop()).append(" ");
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            output.append(" ").append(stack.pop());
        }

        return output.toString().trim();
    }

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
        }
        return -1;
    }
}