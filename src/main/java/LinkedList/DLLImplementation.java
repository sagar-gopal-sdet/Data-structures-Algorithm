package LinkedList;

public class DLLImplementation {

    DNode head, tail;
    int length;

    public void add(int value){
        if(head == null){
            DNode temp = new DNode(value);
            head = temp;
            tail = temp;
            tail.prev = null;
        } else {
            DNode temp = new DNode(value);
            tail.prev = tail;
            tail.next = temp;
            tail = temp;
        }
    }

    public void print(){
        DNode temp = head;
        while(temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void removeLast(){

    }

}
