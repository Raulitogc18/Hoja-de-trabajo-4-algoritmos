error id: file:///C:/Users/joses/OneDrive/Desktop/estructura%20de%20datos/Hoja%20de%20trabajo%204/Hoja-de-trabajo-4-algoritmos/Main.java:_empty_/ExpressionConverter#infixToPostfix#
file:///C:/Users/joses/OneDrive/Desktop/estructura%20de%20datos/Hoja%20de%20trabajo%204/Hoja-de-trabajo-4-algoritmos/Main.java
empty definition using pc, found symbol in pc: _empty_/ExpressionConverter#infixToPostfix#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 403
uri: file:///C:/Users/joses/OneDrive/Desktop/estructura%20de%20datos/Hoja%20de%20trabajo%204/Hoja-de-trabajo-4-algoritmos/Main.java
text:
```scala
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner fileScanner = new Scanner(new File("datos.txt"));
        String expression = fileScanner.nextLine();
        fileScanner.close();

        IStack<Character> stackChar = StackFactory.createStack();
        String postfix = ExpressionConverter.@@infixToPostfix(expression, stackChar);

        System.out.println("Postfix: " + postfix);

        IStack<Integer> stackInt = StackFactory.createStack();
        int result = PostfixEvaluator.evaluate(postfix, stackInt);

        System.out.println("Resultado: " + result);
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/ExpressionConverter#infixToPostfix#