class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i:asteroids){
            boolean destroyed=false;
            while(!st.isEmpty() && st.peek()>0 && i<0){
                if(st.peek()<-i){
                    st.pop();
                }else if(st.peek()==-i){
                    st.pop();
                    destroyed=true;
                    break;
                }else{
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed){
                st.push(i);
            }
        }
        int[] ans=new int[st.size()];
        for(int i=0;i<st.size();i++){
            ans[i]=st.get(i);
        }
        return ans;
        
    }
}