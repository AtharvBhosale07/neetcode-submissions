class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int i = 0 ;
        int right = m+n;
        while(m<right){
           
            nums1[m] = nums2[i];
            m++;
            i++;

        }
        Arrays.sort(nums1);
        }
    }
