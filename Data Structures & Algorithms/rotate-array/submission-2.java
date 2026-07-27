class Solution {
    public void rotate(int[] nums, int k) {
         k = k%nums.length;
        reverse(nums,0,nums.length);
        reverse(nums,0,k);
        reverse(nums,k,nums.length);
    }
    public void reverse (int[] nums , int i , int j){
     
        while (i<j){
         
            int temp = nums[i] ;
            nums[i] = nums[j-1];
            nums[j-1] = temp ;
               i++;
               j--;
        }
    }
}