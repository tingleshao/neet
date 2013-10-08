public class Solution {

   public ArrayList<ArrayList<Integer>> generate(int numRows) {

       // Note: The Solution object is instantiated only once and is reused by each test case.

       

       ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();

       if (numRows == 0)

       {

           return triangle;

       }

       ArrayList<Integer> firstRow = new ArrayList<Integer>();

       firstRow.add(1);

       triangle.add(firstRow);

       if (numRows == 1) {

           return triangle;

       }

       

       for (int i = 1; i < numRows; i++) {

           ArrayList<Integer> row = new ArrayList<Integer>();

           row.add(1);

           for (int j = 1; j < i; j++) {

               row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));

           }

           row.add(1);

           triangle.add(row);

       }

       return triangle;

   }

}


