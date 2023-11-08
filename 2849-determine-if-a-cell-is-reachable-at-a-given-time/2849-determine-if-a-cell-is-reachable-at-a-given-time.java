class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int horizontal = Math.abs(sx-fx);
        int vertical = Math.abs(sy-fy);
        
        if(horizontal==0 && vertical==0 && t==1)
            return false;
        
        int maxDistance = Math.max(horizontal,vertical);
        
        if(maxDistance > t)
            return false;
        
        return true;  
    }
}