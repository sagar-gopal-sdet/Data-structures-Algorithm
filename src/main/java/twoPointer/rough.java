package twoPointer;

import java.util.Arrays;

public class rough {
    public static void main(String args[]){
        int[] arr = {4,2,5,7};
        int[] arr1 = new int[arr.length];
        int i=0, j=1;
        for(int k=0;k<arr.length;k++){
            if(arr[k]%2==0){
                arr1[i]=arr[k];
                i=i+2;
            } else {
                arr1[j]=arr[k];
                j=j+2;
            }
        }

        System.out.println(Arrays.toString(arr1));
    }


    }




