public class Solution {
    public int romanToInt(String s) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        Map<Character, Integer> romanNums = new HashMap<Character, Integer>();
        romanNums.put('I', 1);
        romanNums.put('V', 5);
        romanNums.put('X', 10);
        romanNums.put('L', 50);
        romanNums.put('C', 100);
        romanNums.put('D', 500);
        romanNums.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            char currChar = s.charAt(i);
            if (romanNums.get(currChar) < romanNums.get(s.charAt(i+1))) {
                sum = sum - romanNums.get(currChar);
            }
            else {
                sum = sum + romanNums.get(currChar);
            }
        }
        sum += romanNums.get(s.charAt(s.length()-1));
            return sum;
    }

}
