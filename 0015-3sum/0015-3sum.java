class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int l=i+1,r=n-1;
            while(l<r){
                int sum=nums[l]+nums[r]+nums[i];
                if(sum==0){
                    List<Integer> li=new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[l]);
                    li.add(nums[r]);
                    res.add(li);
                    while(l<r&&nums[l]==nums[l+1]){
                        l++;
                    }
                    while(r>0&&nums[r]==nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }
                else{
                    if(sum>0){
                        r--;
                    }
                    else{
                        l++;
                    }
                }
            }
        }
        return res;
    }
}