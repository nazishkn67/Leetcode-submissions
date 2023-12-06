class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        int matchesInRound = 0;
        
        while(n > 1){
            matchesInRound = n/2;
            count += matchesInRound;
            n = n - matchesInRound;
        }
        return count;
    }
}