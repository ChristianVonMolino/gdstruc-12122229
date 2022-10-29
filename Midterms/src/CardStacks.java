import java.util.EmptyStackException;

public class CardStacks {
    private Cards[] stack;
    private int top;

    // constructor that specifies the initial capacity of the stack
    public CardStacks() {
        stack = new Cards[30];
        top = 0;
    }

    public void push(Cards player) {
        // reallocate the array if the stack is full
        if (isFull()) {
            Cards[] newStack = new Cards[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = player;
    }

    public Cards pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[--top];
    }

    public Cards peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean isFull() {
        return top == stack.length;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        System.out.println("Printing Stack: ");

        for(int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}