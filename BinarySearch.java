public class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int first=0;
        int last=nums.length-1;
        int mid=0;
         while(first<=last){
                mid= last+((first-last)/2);
                
                if(target==nums[mid]){
                    return mid;
                }
                
                if(target>nums[mid]){
                    first=mid+1;
                }
                else
                    last=mid-1;
               }
                
          return -1;
     }
}
