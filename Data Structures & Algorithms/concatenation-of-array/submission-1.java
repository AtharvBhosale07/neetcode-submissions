class Solution {
    public int[] getConcatenation(int[] nums) {
        int first = 0 ;
        int second = nums.length ;
        //int trav ;
        int len = 2*nums.length ;
        int [] ans = new int [len];
        while(second < len){
          ans[first] = nums[first] ;
          ans[second] = ans[first] ;
          first++;
          second++;
        }
        return ans ;
    }
}