package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class TownJudge {

    @Test
    public void td1(){
        Assert.assertEquals(findTownJudge(3,new int[][] {{1,3},{2,3},{3,1}}),-1);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findTownJudge(3,new int[][] {{1,3},{2,3}}),3);
    }

    @Test
    public void td3(){
        Assert.assertEquals(findTownJudge(2,new int[][] {{1,2}}),2);
    }

    @Test
    public void td4(){
        Assert.assertEquals(findTownJudge(4,new int[][] {{1,3},{1,4},{2,3},{2,4},{4,3}}),3);
    }

    public int findTownJudge(int n, int[][] trust){

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> keys = new ArrayList<>();
        Set<Integer> value = new HashSet<>();
        for(int i=0;i<trust.length;i++){
            value.add(trust[i][0]);
            if(map.containsKey(trust[i][1])){
                List<Integer> al = map.get(trust[i][1]);
                al.add(trust[i][0]);
            } else {
                List<Integer> al = new ArrayList<>(Arrays.asList(trust[i][0]));
                map.put(trust[i][1],al);
            }

            }

        for(Map.Entry<Integer,List<Integer>> val : map.entrySet()){
            if(val.getValue().size() == n-1 && !value.contains(val.getKey())) return val.getKey();

        }
        return -1;
    }
}
