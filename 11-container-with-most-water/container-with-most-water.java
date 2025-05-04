class Solution {
    public int maxArea(int[] height) {
        int Maxarea=0;
       int left=0;
       int right=height.length-1;
       while(left<right){
        int width=right-left;
        int area=Math.min(height[right],height[left])*width;
        Maxarea=Math.max(area,Maxarea);
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
       }return Maxarea;
    }
}