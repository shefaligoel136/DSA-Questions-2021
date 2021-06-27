package BinaryTree;

import java.util.Scanner;

public class RemoveLeafNode {

    public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft) {

        if (isRoot) {
            System.out.println("Enter the root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of " + parentData);
            } else {
                System.out.println("Enter right child of " + parentData);
            }
        }

        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInput(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeInput(false, rootData, false);

        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.println(root.data+":");
        if(root.left != null){
            System.out.println("L" + root.left.data);
        }
        if(root.right != null){
            System.out.println("R" + root.right.data);
        }
        System.out.println();

        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
        if(root == null || (root.left == null && root.left == null )){
            return null;
        }
        root.left = removeLeaf(root.left);
        root.right = removeLeaf(root.right);

        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true,1,true);
        printTreeDetailed(removeLeaf(root));
    }
}
