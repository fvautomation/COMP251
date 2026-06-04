package Assignment_6;

class task1{
    public static void main(String[] args) {
        //create a new binary tree
        LinkedBinaryTree<Integer> binaryTree = new LinkedBinaryTree<>();
        //adding the root element
        Position<Integer> root = binaryTree.addRoot(1);

        //Adding left and right children (2 and 3) to the root
        Position<Integer> leftChild = binaryTree.addLeft(root, 2);
        Position<Integer> rightChild = binaryTree.addRight(root, 3);

        //your code should come here
        Position<Integer> p1 = binaryTree.addLeft(leftChild, 4);
        Position<Integer> p2 = binaryTree.addRight(leftChild, 5);
        Position<Integer> p3 = binaryTree.addLeft(p2, 6);
        Position<Integer> p4 = binaryTree.addRight(p2, 7);

        System.out.println("Binary Tree Structure:");
        System.out.println("Root: " + root.getElement());
        System.out.println("Left Child of Root: " + leftChild.getElement());
        System.out.println("Right Child of Root: " + rightChild.getElement());
        System.out.println("Left Child of 2: " + p1.getElement());
        System.out.println("Right Child of 2: " + p2.getElement());
        System.out.println("Left Child of 5: " + p3.getElement());
        System.out.println("Right Child of 5: " + p4.getElement());
    }
}