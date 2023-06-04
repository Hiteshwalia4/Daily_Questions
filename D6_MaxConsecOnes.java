// https://leetcode.com/problems/max-consecutive-ones/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxcount= Math.max(maxcount,count);
            }
            else
                count=0;    
        }   
        return maxcount;
    }
}
