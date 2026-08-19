class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right = height.length-1;
        int waterLevel=0;
        for(int i=0; i<height.length; i++){
            int min = Math.min(height[left], height[right]);
            int currentLevel = min * (right-left);
            waterLevel = Math.max(currentLevel, waterLevel);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return waterLevel;
    }
}