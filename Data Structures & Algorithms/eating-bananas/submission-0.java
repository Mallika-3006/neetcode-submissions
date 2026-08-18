class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();
        while(low<high){
            int mid=low+(high-low)/2;
            if(hours(piles,mid)<=h){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
    public int hours(int[] piles,int mid){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=(piles[i]+mid-1)/mid;
        }
        return hours;
    }
}
