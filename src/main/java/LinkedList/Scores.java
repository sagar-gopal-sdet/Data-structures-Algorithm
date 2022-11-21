package LinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Stack;

public class Scores {
    @Test
    public void td1(){
        Assert.assertEquals(calculateScores(new String[] {"C", "5","-2","4","C","D","9","+","+"}), 27);
    }

    @Test
    public void td2(){
        Assert.assertEquals(calculateScores(new String[]{"5","2","C","D","+"}), 30);
    }

    public int calculateScores(String[] s){
        int sum=0;
        if(s.length == 0) return 0;
        if(s.length==1){
            if(s[0] != "C" || s[0] != "+" || s[0]!="D") return Integer.parseInt(s[0]);
            else return 0;
        }

        Stack<Integer> ss = new Stack<>();
        for(int i=0;i<s.length;i++){
            if(!ss.isEmpty()){
                if(s[i]=="C") ss.pop();
                else if (s[i]=="D") ss.add(ss.peek()*2);
                else if (s[i]=="+") {
                    if(ss.size()>=2) ss.add(ss.get(ss.size()-1)+ss.get(ss.size()-2));
                } else ss.add(Integer.parseInt(s[i]));

            } else {
                if(s[i] != "C" || s[i] != "+" || s[i]!="D") ss.add(Integer.parseInt(s[i]));
                else continue;
            }
            System.out.println(ss);
        }


        for(int i=0;i<ss.size();i++){
            sum+=ss.get(i);
        }
        return sum;
    }
}
