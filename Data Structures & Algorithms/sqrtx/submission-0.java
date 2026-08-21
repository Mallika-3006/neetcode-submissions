class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int low=1;
        int high=x/2;
        int res=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            long midSquared=(long)mid*mid;
            if(midSquared==x){
                return mid;
            }else if(midSquared<=x)
            {
                res=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
        
    }
}