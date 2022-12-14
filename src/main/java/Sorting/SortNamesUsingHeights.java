package Sorting;

import com.sun.source.tree.Tree;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class SortNamesUsingHeights {

    @Test
    public void td1(){
        Assert.assertEquals(sortPeopleOptimised(new String[]{"Mary","John","Emma"}, new int[] {180,165,170}),new String[] {"Mary","Emma","John"});
    }

    public String[] sortPeople(String[] names, int[] heights){

        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        TreeMap<Integer,String> sorted = new TreeMap<>(Collections.reverseOrder());
        sorted.putAll(map);
        return sorted.values().toArray(new String[0]);
    }

    public String[] sortPeopleOptimised(String[] names, int[] heights){

        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            names[i]= map.get(heights[heights.length-1-i]);
        }
        return names;
    }

    public String[] sortPeopleOptimisedII(String[] names, int[] heights){


        return names;
    }


}
