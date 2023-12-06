class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int currentAmount =1;
        for(int i=1; i<=n; i++) {
            total += currentAmount;
            currentAmount++;
            
            if(i%7 == 0)
                currentAmount = i/7 + 1;
                
        }
        return total;
    }
}