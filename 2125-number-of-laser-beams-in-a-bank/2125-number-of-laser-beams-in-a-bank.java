class Solution {
    public int numberOfBeams(String[] bank) {
        if (bank.length < 2) 
            return 0;

        int solution = 0;
        int previousRow = 0;
        int currentRow = 0;
        for (String row : bank) {
            currentRow = 0;
            for (char c : row.toCharArray()) {
                if (c == '1') 
                    currentRow++;
            }
            solution += currentRow * previousRow;
            previousRow = currentRow == 0 ? previousRow : currentRow;
        }
        return solution;
    }
}