import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class  Main {

    //random generator
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 1;
        int max = 30;
        int random_int = (int) Math.floor(Math.random() * (max - min) + min);

    List<Cards> cardsList =new ArrayList<>(30){
    CardStacks.add(new Cards(1, "Ace", "Spades"));




    //This block allow users to input command
    System.out.println("Input Command: ");

    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    System.out.println("You choose " + input);
    }

}