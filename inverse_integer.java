public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (x < 0) {
            int y = -1 * x;
            String intStr = Integer.toString(y);
            return  -1 * Integer.parseInt((new StringBuilder(intStr)).reverse().toString());
        }
        else {
            String intStr = Integer.toString(x);
            return  Integer.parseInt((new StringBuilder(intStr)).reverse().toString());
        }
        
       
    }
}
