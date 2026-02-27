import java.io.File;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner fileScanner = new Scanner(new File("datos.txt"));
        String expression = fileScanner.nextLine();
        fileScanner.close();

        Stack<Character> stackChar = new Stack<>();
        String postfix = ExpressionConverter.infixToPostfix(expression, stackChar);

        System.out.println("Postfix: " + postfix);

        IStack<Integer> stackInt = StackFactory.createStack();
        int result = PostfixEvaluator.evaluate(postfix, stackInt);

        System.out.println("Resultado: " + result);
    }
}