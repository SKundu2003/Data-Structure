//Subtree of a tree

import java.util.LinkedList;
import java.util.Queue;

public class q5 {
    public static node findSameRoot(node root,node subRoot){
        if(root ==null ||subRoot==null){
            return null;
        }
        if (root.data == subRoot.data){
            return root;
        }
        node leftNode = findSameRoot(root.left,subRoot);
        node rightNode = findSameRoot(root.right,subRoot);
        if(leftNode == null){
            return leftNode;
        }
        return rightNode;
    }
    public static node
    public static boolean isPresent(node root,node subRoot){
        node ptr = findSameRoot(root,subRoot);

    }
    public static void main(String[] args) {
        node head = null;
        creatBT BT = new creatBT();
        head = BT.InsertAtleft(head, 1);
        head = BT.InsertAtleft(head, 2);
        head = BT.InsertAtRight(head, 3);
        head = BT.InsertAtRight(head, 4);

        node test = null;
        creatBT BT2 = new creatBT();
//        test = BT2.InsertAtleft(test, 1);
//        test = BT2.InsertAtleft(test, 2);
//        test = BT2.InsertAtRight(test, 3);
        test = BT2.InsertAtRight(test, 4);

        System.out.println(isSubtreePresent(head,test));
    }
}
