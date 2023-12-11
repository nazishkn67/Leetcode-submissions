class Solution {
    public int findSpecialInteger(int[] arr) {
        int quarter = (arr.length)/ 4;
        int count = 1;
        int p = arr[0];
        
        for(int i = 1; i < arr.length; i++) {

            if(p == arr[i]) 
                count++;
            else 
                count = 1;
            
            if(count > quarter) 
                return arr[i];
            
            p = arr[i];
        }
        return p;
    }
}