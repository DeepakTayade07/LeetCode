import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int current = 0;
        int count =0;
        map.put(0,1);
        for(int num : nums){
            current += num;
            if(map.containsKey(current-k)){
                count += map.get(current-k);
            }
            map.put(current,map.getOrDefault(current,0)+1);  
        }
        return count;
    }
}