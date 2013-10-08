public class Solution {
    public String intToRoman(int num) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        Map<Integer, Character> romanNums = new HashMap<Integer, Character>();
        romanNums.put(1, 'I');
        romanNums.put(5, 'V');
        romanNums.put(10, 'X');
        romanNums.put(50, 'L');
        romanNums.put(100, 'C');
        romanNums.put(500, 'D');
        romanNums.put(1000, 'M');
        int numOfM = num / 1000;
        String roman = new String();
        for (int i = 0; i < numOfM; i++) {
            roman += 'M';
        }
        int remain = num % 1000;
        if (remain >= 900) {
            roman += 'C';
            roman += 'M';
        }
        else {
            int numOfD = (num % 1000) / 500;
            for (int i = 0; i < numOfD; i++) {
                roman += 'D';
            }
            remain = num % 500;
            if (remain >= 400) {
                roman += 'C';
                roman += 'D';
            }
            else {
              int numOfC = (remain) / 100;
              for (int i = 0; i < numOfC; i++) {
                  roman += 'C';
              }
            }
        
        }
        remain = num % 100;
        if (remain >= 90) {
            roman += 'X';
            roman += 'C';
        }
        else {
            if (remain >= 40 && remain < 50) {
                roman += 'X';
                roman += 'L';
            }
            else {
                int numOfL = remain / 50;
                for (int i = 0; i < numOfL; i++) {
                    roman += 'L';
                }
                int numOfX = ( remain % 50 ) / 10;
                for (int i = 0; i < numOfX; i++) {
                    roman += 'X';
                }
            }
        }
        remain = num % 10;
        {
            if (remain == 9) {
                roman += 'I';
                roman += 'X';
            }
            else {
                if (remain == 4) {
                    roman += 'I';
                    roman += 'V';
                }
            
                else {
                    int numOfV = remain / 5;
                    if (numOfV == 1) {
                        roman += 'V';
                    }
                    int numOfI = (remain %5);
                    for (int i = 0; i < numOfI; i ++) {
                        roman += 'I';
                    }
                }
            }
        }
        return roman;
    }
}
