public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        // traverse the tree (in-order)
        tree.traverseInOrder();
        System.out.println("Maximum Element is: " + Node.seekMax(tree.root));
        System.out.println("Maximum Element is: " + Node.seekMin(tree.root));
        // search a node by value
        //System.out.println(tree.get(30));

    }
}