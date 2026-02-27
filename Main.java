import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner fileScanner = new Scanner(new File("datos.txt"));
        String expression = fileScanner.nextLine();
        fileScanner.close();

        IStack<Character> stackChar = StackFactory.createStack();
        String postfix = ExpressionConverter.infixToPostfix(expression, stackChar);

        System.out.println("Postfix: " + postfix);

        IStack<Integer> stackInt = StackFactory.createStack();
        int result = PostfixEvaluator.evaluate(postfix, stackInt);

        System.out.println("Resultado: " + result);
    }
}