class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length * 2 ;
        int[] ans = new int [len] ; 
        for (int i = 0 ; i < nums.length ; i++){
            ans [i] = nums [i] ;
        }
         int j = 0 ;
         for (int i = nums.length ; i < len ; i++){
           
            ans [i] = nums [j] ;
            j++;
        }
        return ans ;
    }
}