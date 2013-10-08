/**

* Definition for binary tree

* public class TreeNode {

*     int val;

*     TreeNode left;

*     TreeNode right;

*     TreeNode(int x) { val = x; }

* }

*/

public class Solution {

   public ArrayList<Integer> inorderTraversal(TreeNode root) {

       // Note: The Solution object is instantiated only once and is reused by each test case.

       

       ArrayList<Integer> tri = new ArrayList<Integer>();

       if (root == null) {

           return tri;

       }

       ArrayList<Integer> res = inorderTraversal(root.left);

       for (int i = 0; i< res.size(); i++){

           tri.add(res.get(i));

       }

       tri.add(root.val);

       ArrayList<Integer> res2 = inorderTraversal(root.right);

       for (int i = 0; i< res2.size(); i++){

           tri.add(res2.get(i));

       }

       return tri;

   }

}


