import java.util.*;
class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high=x;
        while(low<=high){
            int mid = low + (high-low)/2;
            long temp = (long)mid*mid;
            if(temp == x){
                return mid;
            }
            else if(temp<x){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return high;
    }
}
