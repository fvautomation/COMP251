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
        System.out.println(binaryTree.root().getElement());

    }
}