class Solution {
    public void sortColors(int[] nums) {
        int i=0,l=0,r=nums.length-1;
        while(i<=r){
            if(nums[i]==0){
                swap(nums,l,i);
                i++;
                l++;
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                swap(nums,r,i);
                r--;
            }
            }
        }
    public void swap(int[] nums, int x, int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}