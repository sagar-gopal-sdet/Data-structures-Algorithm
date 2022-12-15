package InterviewQuestions;

import jdk.dynalink.beans.StaticClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TraverseMapUsingLambda {


    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.forEach((k,v)->{
            System.out.println(k+v);
        });
    }
}
