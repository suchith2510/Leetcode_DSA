class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> out=new ArrayList<>();
        int b=(1<<n);
        for(int i=0;i<b;i++){
            List<Integer> in=new ArrayList<>();
            for(int k=0;k<n;k++){
                    if((i & (1<<k))!=0){
                        in.add(nums[k]);
                    }
            }
            out.add(in);
        }
        return out;
    }
}