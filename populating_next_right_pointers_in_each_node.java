/**

* Definition for binary tree with next pointer.

* public class TreeLinkNode {

*     int val;

*     TreeLinkNode left, right, next;

*     TreeLinkNode(int x) { val = x; }

* }

*/

public class Solution {

   public void connect(TreeLinkNode root) {

       // Note: The Solution object is instantiated only once and is reused by each test case.

       if (root == null) {

           return;

       }

       else {

           TreeLinkNode currNode1 = root.left;

           TreeLinkNode currNode2 = root.right;

           while (currNode1 != null) {

               currNode1.next = currNode2;

               currNode1 = currNode1.right;

               currNode2 = currNode2.left;

           }

           connect(root.left);

           connect(root.right);

           return;

       }

   }

}


