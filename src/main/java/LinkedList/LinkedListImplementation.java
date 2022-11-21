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

    public void remove(int index){
        int in = 0;
        int flag = 0;
        Node temp = head;
        while(temp.next!=null){
            if(in == index-1){
                temp.next = temp.next.next;
                flag=1;
                break;
            }
            else {
                temp = temp.next;
                in++;
            }

        }
        if(flag==0) System.out.println("Index not found");
    }

    public void set(int index, int val){
        int in = 0;
        int flag = 0;
        Node temp = head;
        while(temp.next!=null){
            if(in == index){
                temp.value = val;
                flag=1;
                break;
            }
            else {
                temp = temp.next;
                in++;
            }

        }
        if(flag==0) System.out.println("Index not found");
    }

    public int indexOf(int val){
        Node temp = head;
        int in = 0;
        while(temp!=null){
            if(temp.value==val){
                return in;
            } else {
                temp=temp.next;
                in++;
            }
        }
        return -1;
    }

    public int lastIndexOf(int val){
        Node temp = head;
        int in = 0,lastIndex=-1;
        while(temp!=null){
            if(temp.value==val){
                lastIndex = in;
                temp=temp.next;
                in++;
            } else {
                temp=temp.next;
                in++;
            }
        }
        return lastIndex;
    }

    public Node deleteDuplicates(){
        while(head!=null && head.next!=null && head.next.value==head.value){
            head=head.next;
        }
        if(head==null) return head;
        Node temp = head;
        while(temp.next!= null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
