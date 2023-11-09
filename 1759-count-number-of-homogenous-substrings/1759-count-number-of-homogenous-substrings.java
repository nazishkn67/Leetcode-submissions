class Solution {
    public int countHomogenous(String s) {
        final int mod = 1000000007;
        int res = 0, i = 0, n = s.length();
        
        while(i < n) {
            int j = i+1;
            char c = s.charAt(i);

            while(j < n && s.charAt(j) == c)
                j++;

            long x = j-i;
            long temp = ((x * (x+1)) / 2l) % mod; 
            res = (((res % mod) + (int)temp) % mod);
            i = j;
        }
        return res; 
    }
}