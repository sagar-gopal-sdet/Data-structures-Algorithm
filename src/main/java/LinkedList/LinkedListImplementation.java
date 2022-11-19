package LinkedList;

public class LinkedListImplementation {

    Node head,tail;
    int length;
    int index = -1;

    public void add(int input){
        if(head == null){
            Node temp = new Node(input);
            head = temp;
            tail = temp;
        } else {
            Node temp = new Node(input);
            tail.next = temp;
            tail = temp;
        }
        length++;
        index++;

    }

    public void print(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int size(){
        return length;
    }

    public void removeIndex(int indexToRemove){
        int in = 0;
        Node temp = head;
        while(temp.next!=null){

        }

    }

    public int get(int index){
        int in = 0;
        Node temp = head;
        while(temp!=null){
            if(in == index) return temp.value;
            else {
                temp = temp.next;
                in++;
            }

        }
        return -1;
    }

    public int remove(int index){
        int in = 0;
        Node temp = head;
        while(temp.next!=null){
            if(in == index){

            }
            else {
                temp = temp.next;
                in++;
            }

        }
        return -1;
    }
}
