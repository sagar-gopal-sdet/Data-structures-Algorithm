package General;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveAnagrams {
    @Test
    public void td1(){
        Assert.assertEquals(removeAnagramStrings(Arrays.asList("code","doce","ocde","framer","frame")),Arrays.asList("code","framer","frame"));
    }

    public List<String> removeAnagramStrings(List<String> s){
        List<String> al = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(String a:s){
            int temp=set.size();
            char[] ch = a.toCharArray();
            Arrays.sort(ch);
            set.add(String.valueOf(ch));
            if(temp!=set.size()) al.add(a);
        }


        return al;
    }
}
