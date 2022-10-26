package twoPointer;

public class MergeSortedArrays {
    public int[] merge(int[] nums1, int m, int[] nums2, int n){

        int i=0, j=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                int temp = nums1[i];
                nums2[i]=nums1[j];
                nums1[j]=temp;
                i++;
            } else {
                j++;
            }
            while(j<(nums1.length+nums2.length)){

            }
        }
        return nums1;
    }
}
