import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CardStacks stack = new CardStacks();

        for (int i = 0; i < 30; i++)
        {
            Random rand = new Random();
            int min = 1;
            int max = 5;
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        // push elements to our stack
        stack.push(new Cards(1, "Ace", "Who"));
        stack.push(new Cards(2, "Diamond", "Why"));
        stack.push(new Cards(3, "Clover", "When"));
        stack.push(new Cards(4, "Joker", "Where"));
        stack.push(new Cards(5, "Spades", "How"));
        // print elements
        stack.printStack();

        // pop the top element
        stack.pop();

        // print elements
        stack.printStack();

        // peek
        System.out.println("Current: " + stack.peek());

    }
}