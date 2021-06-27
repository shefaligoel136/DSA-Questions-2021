package BinaryTree;

import java.util.Scanner;

public class NodeBasicOperations {

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

    public static int totalNodes(BinaryTreeNode<Integer> root){
        if(root == null)
            return 0;
        int leftNodeCount = totalNodes((root.left));
        int rightNodeCount = totalNodes((root.right));
        return 1+ leftNodeCount + rightNodeCount;
    }

    public static int sumNodes(BinaryTreeNode<Integer> root){
        int sum = 0;
        if(root == null)
            return 0;
        else{
            sum =  root.data;
        }
        int leftNodeSum = sumNodes(root.left);
        int rightNodeSum = sumNodes(root.right);
        return sum + leftNodeSum + rightNodeSum ;
    }

    public static int largestNode(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int data = root.data;
        int leftData = largestNode(root.left);
        int rightData = largestNode(root.right);
        if(data < leftData){
            data = leftData;
        }if(data < rightData){
            data = rightData;
        }
        return data;
    }

    public static int greaterThanX(BinaryTreeNode<Integer> root, int x){
        if(root == null){
            return 0;
        }
        int leftData = greaterThanX(root.left,x);
        int rightData = greaterThanX(root.right,x);

        return (root.data > x ? 1 : 0) + leftData + rightData;
    }

    public static int numLeaf(BinaryTreeNode<Integer> root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null){
            return 1;
        }
        return numLeaf(root.left)+numLeaf(root.right);
    }

    public static void depthK(BinaryTreeNode<Integer> root,  int k){
        if(root == null)
            return;
        if(k == 0){
            System.out.println(root.data);
            return;
        }
        depthK(root.left,k-1);
        depthK(root.right,k-1);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true,1,true);
        System.out.println("Total nodes in tree are "+ totalNodes(root));
        System.out.println("Sum of nodes in tree are "+ sumNodes(root));
        System.out.println("Largest Node "+ largestNode(root));
        System.out.println("Node greater than X "+ greaterThanX(root,2));
        System.out.println("Number of leaf nodes "+ numLeaf(root));
        System.out.println("Printing nodes at depth k ");
        depthK(root,2);
    }
}
