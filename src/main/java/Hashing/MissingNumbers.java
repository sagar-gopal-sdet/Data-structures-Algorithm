package Hashing;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class MissingNumbers {

    @Test
    public void td1(){
        Assert.assertEquals(findMissingNumbersOptimised(new int[] {4,3,2,7,8,2,3,1}), Arrays.asList(5,6));
    }

    public List<Integer> findMissingNumbers(int[] nums){

        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=nums.length;i++){
            map.put(i,0);
        }
        System.out.println(map.entrySet());
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.get(nums[i])+1);
        }
        System.out.println(map.entrySet());
        for(Map.Entry<Integer,Integer> val: map.entrySet()){
            if(val.getValue()==0) l.add(val.getKey());
        }

        return l;
    }

    public List<Integer> findMissingNumbersOptimised(int[] nums) {
        int[] arr = new int[nums.length+1];
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0) l.add(i);
        }

        return l;
    }
    }
