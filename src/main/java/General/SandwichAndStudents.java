package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SandwichAndStudents {

    @Test
    public void td1(){
        Assert.assertEquals(findStudents(new int[] {1,1,1,0,0,1}, new int[] {1,0,0,0,1,1}), 3);
    }

    /*Pseudocode:
    * */

    public int findStudents(int[] students, int[] sandwiches){
        Deque<Integer> stu = new ArrayDeque<>();
        for(int i=0;i<students.length;i++){
            stu.add(students[i]);
        }
        int i = 0,temp=0;
        while(temp < stu.size()){
            if(stu.peek() == sandwiches[i]){
                i++;
                temp = 0;
                stu.poll();
            } else {
                stu.add(stu.poll());
                temp++;
            }
        }



        return stu.size();
    }
}
