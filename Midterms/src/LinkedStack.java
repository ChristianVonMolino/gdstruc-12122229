import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.ListIterator;

// wrapper class to limit the LinkedList class into Stack operations
public class LinkedStack {
    private LinkedList<Cards> stack;

    public LinkedStack() {
        stack = new LinkedList<>();
    }

    public void push(Cards cards) {
        stack.push(cards);
    }

    public Cards pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.pop();
    }

    public Cards peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        System.out.println("Printing Stack: ");

        ListIterator<Cards> iterator = stack.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}