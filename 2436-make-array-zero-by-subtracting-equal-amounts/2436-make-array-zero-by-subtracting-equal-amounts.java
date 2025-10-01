class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) h1.add(nums[i]);
        }
        return h1.size();
    }
}