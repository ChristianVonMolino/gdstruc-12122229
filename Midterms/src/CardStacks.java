import java.util.ArrayList;
import java.util.List;

public class CardStacks extends Main {

    //Deck Stack
    private Cards[] stack;
    private int top;


    public CardStacks(int capacity)
    {
        stack = new Cards[capacity];
    }

    public CardStacks() {
    }

    //Discard pile
    public void push(Cards card)
    {
        if (top == stack.length)
        {
            Cards[] newStack = new Cards[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
    }

}