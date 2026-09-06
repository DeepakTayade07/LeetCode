class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        for(int i=0; i<= haystack.length() - needle.length(); i++){
            String part = haystack.substring(i, i + needle.length());
            if(part.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}