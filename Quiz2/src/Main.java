import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // declare an ArrayList of Player objects
        List<Player> playerList = new ArrayList<>(10);

        // add players to the ArrayList
        playerList.add(new Player(1, "Goku", 9001));
        playerList.add(new Player(2, "Vegeta", 9000));
        playerList.add(new Player(3, "Broly", 20000));

        // add a Player object to index 1
        playerList.add(1, new Player(10, "Yamcha", 500));

        // print the 2nd element of the ArrayList
        System.out.println("2nd Element: " + playerList.get(1));

        // define player to search
        Player gokuPlayer = new Player(1, "Goku", 9001);

        // remove the 1st element of the array list


        // check if Gok u exists the list and print the player's corresponding index
        boolean gokuExists = playerList.contains(gokuPlayer);
        int gokuIndex = playerList.indexOf(gokuPlayer);
        System.out.println("Goku Exists? " + gokuExists + " At Index: " + gokuIndex);

        // lambda expression
        System.out.println("Lambda Version:");
        playerList.forEach(p -> System.out.println(p));

        //remove
        System.out.println("Element Removed:" + playerList.remove(0));


        //list
        System.out.println("List Size: " + playerList.size());

        //contains??
        System.out.println("List contains: " + playerList.contains("Player"));

        System.out.println("List contains: " + playerList.contains("Player"));

        System.out.println("List contains: " + playerList.contains("Player"));

        System.out.println("List contains: " + playerList.contains("Player"));


        //index
        System.out.println("The first occurrence of Goku is at index:" + playerList.indexOf("Goku"));

        System.out.println("The first occurrence of Yamcha is at index:" + playerList.indexOf("Yamcha"));

        System.out.println("The first occurrence of Vegeta is at index:" + playerList.indexOf("Vegeta"));

        System.out.println("The first occurrence of Broly Power Level is at index:" + playerList.indexOf("20000"));
        // enhanced for loop
        /**
         for (Player p : playerList) {
         System.out.println(p);
         }
         */
    }
}