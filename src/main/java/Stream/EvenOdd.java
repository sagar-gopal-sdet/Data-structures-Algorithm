package Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    @Test
    public void td1(){
        Assert.assertEquals(findEvenNumber(Arrays.asList(1,2,3,4,5)),Arrays.asList(2,4));

    }

    public List<Integer> findEvenNumber(List<Integer> l){
        List<Integer> even = l.stream().filter(e -> e%2 == 0).collect(Collectors.toList());
        return even;

    }

}
