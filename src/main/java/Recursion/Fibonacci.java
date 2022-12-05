package Recursion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Fibonacci {
    @Test
    public void td1(){
        Assert.assertEquals(fib(3), 2);
    }



    public int fib(int n){
        if(n<=1) return n;
        else return fib(n-1)+fib(n-2);
    }

    public int fibBruteForce(int n){
        int a=0,b=1;
        for(int i=1;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }


}
