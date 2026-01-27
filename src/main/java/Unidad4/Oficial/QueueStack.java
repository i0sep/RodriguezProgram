package Unidad4.Oficial;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStack {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<String>();

        Stack<String> stack = new Stack<String>();

        cola.add("Primer elemento");
        stack.add("Primer elemento");

        cola.add("Segundo elemento");
        stack.add("Segundo elemento");

        cola.add("Tercer elemento");
        stack.add("Tercer elemento");

        System.out.println(cola);
        System.out.println(stack);
    }
}
