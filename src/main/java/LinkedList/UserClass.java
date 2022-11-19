package LinkedList;

import org.testng.annotations.Test;

public class UserClass {
    @Test
    public void td(){
        LinkedListImplementation ll = new LinkedListImplementation();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(140);
        ll.add(13);
        ll.add(15);
        ll.print();
        System.out.println(ll.get(5));
    }
}
