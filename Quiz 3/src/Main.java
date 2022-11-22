public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            ArrayQueue arrayQueue = new ArrayQueue(5);

            // add initial players to the queue
            arrayQueue.enqueue(new Player(1, "Goku", 9001));
            arrayQueue.enqueue(new Player(2, "Vegeta", 8000));
            arrayQueue.enqueue(new Player(3, "Broly", 15000));
            System.out.println("Initial Array =============================");

            arrayQueue.printQueue();

            System.out.println("1 Player Added ==================== \n\n");

            // add a new player
            arrayQueue.enqueue(new Player(4, "Yamcha", 500));
            arrayQueue.enqueue(new Player(5,"Broc", 800));
            arrayQueue.printQueue();

            System.out.println("1 Player Removed ==================== \n\n");

            // remove a player
            Player removedPlayer = arrayQueue.dequeue();
            System.out.println("Removed Player: " + removedPlayer);
            System.out.println("New Front Player: " + arrayQueue.peek());

            System.out.println("After Player Removed ==================== \n\n");

            arrayQueue.printQueue();
        }
    }
}