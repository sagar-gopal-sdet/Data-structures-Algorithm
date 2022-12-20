package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Intersection {

    @Test
    public void td1(){
        Assert.assertEquals(findIntersection(new int[] {1,2,2,1}, new int[] {2,2}),new int[] {2});
    }

    public int[] findIntersection(int[] nums1, int[] nums2){
        ArrayList<Integer> al = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(!al.contains(nums2[i]) && map.containsKey(nums2[i])) al.add(nums2[i]);
        }
        int[] out = al.stream().mapToInt(Integer::intValue).toArray();
        return out;
    }

    public int[] findIntersectionII(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            int temp=set.size();
            set.add(nums2[i]);
            if(set.size()==temp && !al.contains(nums2[i])) al.add(nums2[i]);
        }
        int[] out = al.stream().mapToInt(Integer::intValue).toArray();
        return out;
    }
}
