package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DestinationCity {

    @Test
    public void td1(){
        //Assert.assertEquals(findDestination(new List<List<String>> (("London","New York"),("New York","Lima"),("Lima","Sao Paulo"))), "Sao Paulo");

    }

    public String findDestination(List<List<String>> paths){
       // String output = "";
        ArrayList<String> ans=new ArrayList<String>();
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<paths.size();i++)
        {
            map.put(paths.get(i).get(0),map.getOrDefault(paths.get(i).get(0),0)+1);
            ans.add(paths.get(i).get(1));

        }
        for(String a:ans)
        {
            if(map.get(a)==null)
            {
                return a;
            }

        }
        return "";
    }

    public String findDestinationOptimised(List<List<String>> paths){
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<paths.size();i++) map.put(paths.get(i).get(0),1);
        for(int i=0;i<paths.size();i++) if(map.get(paths.get(i).get(1))==null) return paths.get(i).get(1);
        return "";
    }
}
