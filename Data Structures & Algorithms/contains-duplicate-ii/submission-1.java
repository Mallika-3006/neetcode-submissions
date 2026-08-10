class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            while(j>=0 && i-j<=k){
                if(nums[i]==nums[j]){
                    return true;
                }
                j--;
                
            }
        }
        return false;
        //while(i<j)
        
    }
}