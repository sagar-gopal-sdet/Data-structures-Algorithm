package General;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class UncommonString {

    @Test
    public void td1(){
        String[] arr = findUncommonStrings("this apple is sweet", "this apple is sour");
        System.out.println(Arrays.toString(arr));
       Assert.assertEquals(findUncommonStrings("this apple is sweet", "this apple is sour"),new String[] {"sweet","sour"});
    }

    @Test
    public void td2(){
        //String[] arr = findUncommonStrings("this apple is sweet", "this apple is sour");
        //System.out.println(Arrays.toString(arr));
        Assert.assertEquals(findUncommonStringsOptimised("this apple is sweet", "this apple is sour"),new String[] {"sweet","sour"});
    }

    public String[] findUncommonStrings(String s1, String s2){

        HashMap<String,Integer> map = new HashMap<>();
        String[] arr1 = s1.split(" ");
        for (String key : arr1){
            map.put(key,map.getOrDefault(key,0)+1);
        }

        String[] arr2 = s2.split(" ");
        for (String key : arr2){
            map.put(key,map.getOrDefault(key,0)+1);
        }

        List<String> al = new ArrayList<>();
        for(Map.Entry<String,Integer> val:map.entrySet()){
            if(val.getValue() == 1) al.add(val.getKey());
        }

        String[] arr = al.toArray(new String[0]);

        return arr;
    }

    public String[] findUncommonStringsOptimised(String s1, String s2){


        Set<String> set = new HashSet<>();
        List<String> al = new ArrayList<>();
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        for(String key:arr1){
            if(set.contains(key)){
                al.add(key);
                set.remove(key);
            } else if(!set.contains(key) && !al.contains(key)) set.add(key);
        }
        for(String key:arr2){
            if(set.contains(key)){
                al.add(key);
                set.remove(key);
            } else if(!set.contains(key) && !al.contains(key)) set.add(key);
        }
        System.out.println(set);
        String[] arr = new String[set.size()];
        arr = set.toArray(arr);

        return arr;
    }

}
