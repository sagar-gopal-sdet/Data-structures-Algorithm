package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;

public class BuddyStrings {
    @Test
    public void td1(){
        Assert.assertEquals(buddyStringCheck("abcd","cbad"),true);
    }

    @Test
    public void td2(){
        Assert.assertEquals(buddyStringCheck("ab","ba"),true);
    }

    @Test
    public void td3(){
        Assert.assertEquals(buddyStringCheck("aa","aa"),true);
    }

    @Test
    public void td4(){
        Assert.assertEquals(buddyStringCheck("ab","ab"),false);
    }

    @Test
    public void td5(){
        Assert.assertEquals(buddyStringCheck("aaaaaaabc","aaaaaaacb"),true);
    }

    @Test
    public void td6(){
        Assert.assertEquals(buddyStringCheck("aba","aba"),true);
    }




    public boolean buddyStringCheck(String s, String goal){
        if(s.length() != goal.length()) return false;
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        char temp=Character.MIN_VALUE;
        int i=0;
        for(;i<s.length();i++){
            set1.add(s.charAt(i));
            set2.add(s.charAt(i));
            if(s.charAt(i)!=goal.charAt(i)){
                temp = s.charAt(i);
                break;
            }
        }

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(i);

        if(set1.size()==1 && set1.equals(set2)) return true;
        if(s.length()==2 && set1.size()==2 && set1.equals(set2) && i==s.length()) return false;

        if(temp!=-1){

        }

        int x = s.indexOf(temp);
        System.out.println(x);
        int y = goal.indexOf(temp);
        s=s.replace(temp,s.charAt(y));
        System.out.println(s);
        s=s.substring(0,y)+temp+s.substring(y+1);
        System.out.println(s);



        if(s.equalsIgnoreCase(goal)) return true;
        return false;
    }
}
