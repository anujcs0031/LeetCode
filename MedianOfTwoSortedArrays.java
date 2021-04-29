import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        double median = 0.0;

        int len3 = len1 + len2; 
        int[] nums3 = new int[len3];
        if(len1 ==0 && len2 == 0)
            return median;
            
        for(int i=0;i<len1;i++)
            nums3[i] = nums1[i];
      
        
        for(int i = len1; i<len3;i++)
        {
            for(int j=0;j<len2;j++)
            {
            nums3[i] = nums2[j];
                i++;
            }
            break;
        }
       
        
        for(int i=0;i<len3;i++) //sort the array
        {
            for(int j=i+1;j<len3;j++)
            {
                if(nums3[i] > nums3[j])
                {
                    int temp = nums3[i];
                    nums3[i]= nums3[j];
                    nums3[j] = temp;
                }
            }
        }
        for(int i=0;i<len3;i++)
            System.out.println(nums3[i]);
        
        if(len3 == 1) //if array contains only one element
            return (double)nums3[0];
        
        if(len3%2!=0)           //find the median
        {
            median = nums3[len3/2] ;
        }
            else
            {
                median = (nums3[len3/2] + nums3[len3/2 - 1]);
                median = median / 2;
            }
        
        
        
        return median;
        
    }
}