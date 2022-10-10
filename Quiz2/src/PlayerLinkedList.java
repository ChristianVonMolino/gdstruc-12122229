public class PlayerLinkedList {

    private PlayerNode head;


    // function to add a new player to the front of the linked lists
    public void addtoFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }
    //remove the first value
    public Main removeFirst(PlayerNode head) {
        if (head == null)
            return null;
        PlayerNode temp = head;
        head = head.getNextPlayer(head);
        return temp;

    }

    // function to print the elements of the linked list
    public void printList() {
        System.out.print("HEAD -> ");
        PlayerNode current = head;


        while (current != null) {

            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayer(head);

        }

        System.out.print(" NULL\n");
    }
}