class Solution {
    public int searchInsert(int[] nums, int target) {
       if(nums.length==0){
        return 0;
       }
       int left=0;
       int right=nums.length-1;
       for(int i=0;i<nums.length;i++){
            int mid=(left+right)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){

            left=mid+1;
        }
        else{
            right=mid-1;
        }
       }return left;

    }
}


    
