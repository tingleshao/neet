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

   public TreeNode sortedArrayToBST(int[] num) {

       // Note: The Solution object is instantiated only once and is reused by each test case.

       if (num.length == 0) {

           return null;

       }

       else {

           if (num.length == 1) {

               TreeNode node = new TreeNode(num[0]);

               return node;

           }

           else {

                int len = num.length;

                if (len%2==0) {

                    int[] leftHalfNum = new int[len/2];

                    int[] rightHalfNum = new int[len/2-1];

                    TreeNode center = new TreeNode(num[len/2]);

                    for (int i = 0; i < len/2-1; i++) {

                        leftHalfNum[i] = num[i];

                        rightHalfNum[i] = num[len/2+i+1];

                    }

                    leftHalfNum[len/2-1] = num[len/2-1];

                    center.left = sortedArrayToBST(leftHalfNum);

                    center.right = sortedArrayToBST(rightHalfNum);

                    return center;

                }

                else {

                    int[] leftHalfNum = new int[(len-1)/2];

                    int[] rightHalfNum = new int[(len-1)/2];

                    TreeNode center = new TreeNode(num[(len-1)/2]);

                    for (int i = 0; i < (len-1)/2; i++) {

                        leftHalfNum[i] = num[i];

                        rightHalfNum[i] = num[(len-1)/2+i+1];

                    }

                    center.left = sortedArrayToBST(leftHalfNum);

                    center.right = sortedArrayToBST(rightHalfNum);

                    return center;

                }

           }

       }

   }

}


