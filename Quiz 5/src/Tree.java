public class Tree {
    public Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }
    public void traverseInOrder() {
        if (root != null)
        {
            root.traverseInOrder();
        }
    }
}