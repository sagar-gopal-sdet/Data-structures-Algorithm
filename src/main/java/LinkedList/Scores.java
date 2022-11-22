package LinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Stack;

public class Scores {
    @Test
    public void td1(){
        Assert.assertEquals(calculateScores(new String[] {"5","-2","4","C","D","9","+","+"}), 27);
    }

    @Test
    public void td2(){
        Assert.assertEquals(calculateScores(new String[]{"5","2","C","D","+"}), 30);
    }

    public int calculateScores(String[] operations){

            Stack<Integer> stack = new Stack<>();

            for (String s : operations) {
                if (s.equals("+")) {
                    int a = stack.pop();
                    int newScore = a + stack.peek();
                    stack.push(a);
                    stack.push(newScore);
                }
                else if (s.equals("D")) {
                    stack.push(2 * stack.peek());
                }
                else if (s.equals("C")) {
                    stack.pop();
                }
                else stack.push(Integer.parseInt(s));
            }

            int totalScore = 0;
            while (!stack.isEmpty()) totalScore += stack.pop();

            return totalScore;
        }


    }

