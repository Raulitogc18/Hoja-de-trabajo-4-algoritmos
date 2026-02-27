import stack.IStack;
import stack.StackArrayList;
import stack.StackVector;
import stack.StackList;

import list.SinglyLinkedList;
import list.DoublyLinkedList;

import java.util.Scanner;

public class StackFactory {

    public static IStack createStack() {   // ← quitamos <T>
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione implementación de Stack:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista");

        int option = sc.nextInt();

        switch (option) {

            case 1:
                return new StackArrayList<>();

            case 2:
                return new StackVector<>();

            case 3:
                System.out.println("Seleccione tipo de Lista:");
                System.out.println("1. Simplemente enlazada");
                System.out.println("2. Doblemente enlazada");

                int listOption = sc.nextInt();

                if (listOption == 1) {
                    return new StackList(new SinglyLinkedList<>());
                } else {
                    return new StackList(new DoublyLinkedList<>());
                }

            default:
                System.out.println("Opción inválida. Se usará ArrayList por defecto.");
                return new StackArrayList<>();
        }
    }
}