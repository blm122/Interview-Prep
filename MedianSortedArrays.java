import java.util.Arrays;

//given two sorted arrays, find the median
//EX) nums1 = [1, 2] and nums2 = [3]
// median = 2 since [1, 2, 3]

class MedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int x = nums1.length;
        int y = 0;
        int total = 0;
        double median;        
        
        int[] nums3 = Arrays.copyOf(nums1, nums1.length + nums2.length);
        
        for(x = nums1.length; x < nums3.length; x++)
        {
            
            nums3[x] = nums2[y];
            y = y + 1;
        }
        
        Arrays.sort(nums3);
        
        if(nums3.length % 2 == 0)
        {
            int a = (nums3.length / 2) - 1;
            int b = a + 1;
            median = (double)(nums3[a] + nums3[b])/2;
        }
        else
        {
           int medianIndex = (nums3.length - 1)/2;
           median = nums3[medianIndex];
        }
        
        return median;
    }
}
