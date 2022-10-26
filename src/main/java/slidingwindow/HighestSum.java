package slidingwindow;

import org.testng.annotations.Test;

public class HighestSum {
    public int highestSumOfKElements(int[] arr, int k){
        int sum = 0;
        int i=0, j=1, m=2;
        if(arr.length == k){
            for(int l=0;l<k;l++){
                sum += arr[l];
            }
        }
        if(arr.length>k){

            while(m<arr.length-1){
                int temp = arr[i]+arr[j]+arr[m];
                if(temp>sum){
                    sum = temp;
                }
                i++;
                j++;
                m++;
            }
        }


        return sum;
    }

    public int highestSumOfKElementsOptimised(int[] arr, int k){
        int sum = 0, windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        sum = windowSum;
        for(int i=k;i<arr.length;i++){
            windowSum = windowSum -arr[i-k] + arr[i];
            sum = Math.max(sum,windowSum);
        }

        return sum;
    }

    @Test
    public void testData1(){
        int[] arr = {1,5,2,3,7,1};
        int k=4;
        System.out.println(highestSumOfKElementsOptimised(arr,k));
    }
}
