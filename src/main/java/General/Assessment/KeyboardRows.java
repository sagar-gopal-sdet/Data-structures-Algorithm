package General.Assessment;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class KeyboardRows {

    @Test
    public void td1(){
        Assert.assertEquals(validateRowKeys(new String[] {"queen", "Alaska", "ZXCVIO"}), new String[] {"Alaska"});
    }


    @Test
    public void td2(){
        Assert.assertEquals(validateRowKeys(new String[] {"queen"}), new String[] {});
    }

    @Test
    public void td3(){
        Assert.assertEquals(validateRowKeys(new String[] {"Alaska"}), new String[] {"Alaska"});
    }

    @Test
    public void td4(){
        Assert.assertEquals(validateRowKeys(new String[] {}), new String[] {});
    }

    public String[] validateRowKeys(String[] s){

        String q = "qwertyuiopQWERTYUIOP";
        String a = "asdfghjklASDFGHJKL";
        String z = "zxcvbnmZXCVBNM";
        ArrayList<String> al = new ArrayList<>();

        for(String x : s){
            String temp = "";
            if(q.contains(x.substring(0,1))) temp = q;
            else if (a.contains(x.substring(0,1))) temp = a;
            else if (z.contains(x.substring(0,1))) temp = z;
            int n = 1, flag = 0;
            while(n<x.length()){
                if(temp.indexOf(x.charAt(n))==-1){
                    flag = 1;
                    break;
                } else n++;
            }
            if(flag == 0) al.add(x);
        }
        String[] out = al.toArray(new String[0]);
        return out;
    }
}
