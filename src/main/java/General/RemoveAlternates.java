package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class RemoveAlternates {

    @Test
    public void td1(){
        Assert.assertEquals(shootElements(5), 11);
    }

    @Test
    public void td2(){
        Assert.assertEquals(shootElements(7), 24);
    }

    @Test
    public void td3(){
        Assert.assertEquals(shootElements(8), 28);
    }

    @Test
    public void td4(){
        Assert.assertEquals(shootElements(100000), 705017168);
    }
    public int shootElements(int n){
        int points=0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=n;i++){
            al.add(i);
        }
        while (al.size()!=1){
            ArrayList<Integer> al1 = new ArrayList<>();
            for(int j=0;j<al.size();j+=2){
                al1.add(al.get(j));
                points+=al.get(j);
            }
            al.removeAll(al1);
        }
        System.out.println(points);
        return points;
    }
}
