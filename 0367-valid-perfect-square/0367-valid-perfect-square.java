class Solution {
    public boolean isPerfectSquare(int num) {
        long low=1;
        long high=num/2;
        if(num==1) return true;
        while(low<=high){
            long mid=low+(high-low)/2;
            long square=mid*mid;
            if(square==num){
                return true;
            }
            else if(square>num){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}