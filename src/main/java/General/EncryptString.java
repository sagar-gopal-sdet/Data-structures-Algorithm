package General;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EncryptString {
    @Test
    public void td1(){
        Assert.assertEquals(rotateAndEncrypt(11, "middle-Outz", 2), "okffng-Qwvb");
    }

    public String rotateAndEncrypt(int n, String s, int k){
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<k;i++){
            s1 += s1.charAt(0);
            s1=s1.substring(1);
        }
        for(int i=0;i<s.length();i++){
            int a = s2.indexOf(s.charAt(i));
            if(a==-1){
                a = s2.indexOf(s.toLowerCase().charAt(i));
                if(a!=-1) sb.setCharAt(i,Character.toUpperCase(s1.charAt(a)));
            } else sb.setCharAt(i,s1.charAt(a));
        }
        return sb.toString();
    }
}
