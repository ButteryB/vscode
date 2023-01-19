//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.LinkedList;
import java.util.Stack;

public class BinarySearchTree {
    private TreeNode root;
    private int size;

    public BinarySearchTree() {
        root = null;
    }

    public void add(Comparable val) {
        root = add(val, root);
    }

    private TreeNode add(Comparable val, TreeNode tree) {
        if (tree == null)
            tree = new TreeNode(val);

        Comparable treeValue = tree.getValue();
        int dirTest = val.compareTo(treeValue);

        if (dirTest < 0)
            tree.setLeft(add(val, tree.getLeft()));
        else if (dirTest > 0)
            tree.setRight(add(val, tree.getRight()));

        return tree;
    }

    public void inOrder() {
        inOrder(root);
        System.out.println("\n");
    }

    private void inOrder(TreeNode tree) {
        if (tree != null) {
            inOrder(tree.getLeft());
            System.out.print(tree.getValue() + " ");
            inOrder(tree.getRight());
        }
    }

    // preOrder

    // postOrder

    // revOrder

    // levelOrder - use a queue

    public void zigzagOrder() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while (!s1.empty() || !s2.empty()) {
            while (!s1.empty()) {
                TreeNode temp = s1.pop();
                System.out.print(temp.getValue() + " ");

                if (temp.getRight() != null) {
                    s2.push(temp.getRight());
                }
                if (temp.getLeft() != null) {
                    s2.push(temp.getLeft());
                }
            }
            while (!s2.empty()) {
                TreeNode temp = s2.pop();
                System.out.print(temp.getValue() + " ");
                if (temp.getLeft() != null) {
                    s1.push(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    s1.push(temp.getRight());
                }
            }
        }
    }
    // zigzagOrder - hint below but could be solved in a different manner
    // loop thru a stack and load all nodes to a new stack(loading is based on direction)
    // set new stack to old and repeat

    // getNumLevels

    // getNumLeaves

    // getWidth - insure this works right for the 2nd test case

    // getHeight

    // getNumNodes

    // isFull

    // contains

    // maxNode

    // minNode

    // getSmallest

    // getLargest

    // remove - follow adds set up very closely and check powerpoint if needed
    // 1st case = no children
    // 2nd case = one child
    // 3rd case two children

    // ****BONUS****
    // display like a tree


    public String toString() {
        return "";
    }

    private String toString(TreeNode tree) {
        return "";
    }
}