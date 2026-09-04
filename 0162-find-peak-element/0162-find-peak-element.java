class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1){ // jab array me ak hi elemet ho 
            return 0;
        }else if (nums[0]>nums[1]){ // jab pahla element hi peak element ho 
            return 0;
        }else if ( nums[nums.length-1]>nums[nums.length-2]){ // jab last element peak element ho
            return nums.length-1;
        }else{

            int start = 1 ;
            int end = nums.length-2;

            while(start<=end){

                int mid = (start + end)/2;
                // jab mid element hi peak element ho...

                if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    return mid ;
                    // jab ye sab nahi ho ga tab start ki value mid+1 ho jaye ge ya mid-1 according to their question
                }else if ( nums[mid]<nums[mid+1]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

            return -1;
        }
        
    }
}