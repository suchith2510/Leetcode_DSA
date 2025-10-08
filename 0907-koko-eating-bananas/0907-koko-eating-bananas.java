class Solution {
    public boolean isOk(int[] piles, int h, long k){
        int ht=0;
        for(int x:piles){
            ht+=Math.ceil((double)x/k);
        }
        return ht<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
       long l=0;
        long r=1000000000;
        long ans=0;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(isOk(piles,h,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(ans!=0){
            return (int)ans;
        }
        else{
            return -1;
        }
    }
}