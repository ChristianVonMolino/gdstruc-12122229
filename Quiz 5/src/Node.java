public class Node {
    private int data;
    private Node rightChild;
    private Node leftChild;

    static int seekMax(Node node)
    {
        if (node == null)
        {
            return Integer.MIN_VALUE;
        }
        int check = node.data;
       int leftcheck = seekMax(node.leftChild);
        int rightcheck = seekMax(node.rightChild);

        if(leftcheck > check)
            leftcheck = check;
        if(rightcheck > check)
        {
            check = rightcheck;
        }
        return check;
    }
    static int seekMin(Node node)
    {
        if (node == null)
        {
            return Integer.MAX_VALUE;
        }
        int checking = node.data;
        int minLcheck = seekMin(node.leftChild);
        int minRcheck = seekMin(node.rightChild);

        if (minLcheck < checking)
            checking = minLcheck;
        if (minRcheck < checking)
            checking = minRcheck;
        return checking;
    }

    public Node(int _data) {
        data = _data;
    }
    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {     // left subtree
            if (leftChild == null) {
                leftChild = new Node(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {                  // right subtree
            if (rightChild == null) {
                rightChild = new Node(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }


    public void traverseInOrder() {
        // left subtree
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }

        // print current node (root or subtree)
        System.out.println("Data: " + data);

        // right subtree
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }
/*    public void traverseInOrderDescending() {
        //Reversed the order of the traverse/checking so that it starts at right tree

        // right subtree
        if (rightChild != null) {
            rightChild.traverseInOrderDescending();
        }
        // print current node (root or subtree)
        System.out.println("Data: " + data);

        // left subtree
        if (leftChild != null) {
            leftChild.traverseInOrderDescending();
        }
    }
    public void getMin() {
        // checks left subtree since all values on that side are lower than root, making it easier to find min value
        if (leftChild != null) {
            leftChild.traverseInOrderDescending();
            System.out.println(leftChild);
        }
    }
    public void getMax() {
        // checks right subtree since all values on that side are higher than root, making it easier to find max value
        if (rightChild != null) {
            rightChild.traverseInOrder();
            System.out.println(rightChild);
        }
    }*/

    public Node get(int value) {
        if (value == data) {
            return this;
        }

        if (value < data) {
            if (leftChild != null) {
                return  leftChild.get(value);
            }
        }
        else {
            if (rightChild != null) {
                return  rightChild.get(value);
            }
        }

        return null;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
