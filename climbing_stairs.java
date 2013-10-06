public class Solution {
    public static Map<Integer, Integer> climbTable = new HashMap<Integer, Integer>();
     public int climbStairs(int n) {
        this.climbTable.put(0,1);
        this.climbTable.put(1,1);

        // Note: The Solution object is instantiated only once and is reused by each test case.
        if (climbTable.containsKey(n)) {
         return climbTable.get(n);
        }
        
        int value =  climbStairs(n-1) + climbStairs(n-2);
        climbTable.put(n,value);
        return value;
    }
}
