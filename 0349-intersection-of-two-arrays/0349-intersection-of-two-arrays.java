class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> temp=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            temp.add(nums2[i]);
        }
        HashSet<Integer> temp2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(temp.contains(nums1[i])){
                temp2.add(nums1[i]);
            }
        }
        int[] res=new int[temp2.size()];
        int k=0;
        for(int i: temp2){
            res[k++]=i;
        }
        return res;
    }
}