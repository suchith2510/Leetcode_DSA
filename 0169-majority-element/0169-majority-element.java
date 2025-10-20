class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int max=0;
        int res=0;
        for(int num: nums){
            int count=hs.getOrDefault(num,0)+1;
            hs.put(num,count);
            if(count>max){
                max=count;
                res=num;
            }
        }
        return res;
    }
}