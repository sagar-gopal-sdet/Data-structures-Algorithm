package com.week2;

import java.util.ArrayList;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        int i=0,j=0;
        if(nums1.length > nums2.length){
            while (i<nums2.length){
                if(nums1[i] == nums2[j]){
                    al.add(nums1[i]);
                    i++;
                } else {
                    j++;
                }
            }
        }
        int[] arr = new int[al.size()];

        return arr;

    }
}
