package LinkedList;

public class first {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        } else {
            newNode.next=head; //newNode should now point to the node that was at the beginning of the list (head).
            head=newNode; // newnode la head banavla
        }
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        } else {
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void printList(){

        if(head==null){
            System.out.print("Null");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
        }
        Node temp=head;
        Node newNode=new Node(data);
        size++;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;

        }

        // i=idx-1 temp->prev

        newNode.next=temp.next; //The new node should point to whatever node temp was originally pointing to.(Vimp)
        temp.next=newNode;//This updates temp so it now points to newNode instead of what it was pointing to.


    }

    public int removefirst(){
        if(size==0){
            System.out.print("LL is empty");

        }

        else if(size==1){
            head=tail=null;
            size=0;
             
        }

        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removelast(){

        if(size==0){
            System.out.print("LL is empty");

        }

        else if(size==1){
            head=tail=null;
            size=0;
             
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }

        int value=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return value;
        

    }

    public int itrsearch(int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                System.out.print("Key found ");
                return 1;
            }
            else{
                temp=temp.next;
            }
        }
        return -1;
    }

    public void reverselinkedlist(){

        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){

            next=curr.next;
            curr.next=prev;
            prev=curr; // curr la prev banavla
            curr=next; // next la curr banavla

        }
        head=prev;

    }

    public void removenthfromend(int n){

        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }

        int i=1;
        Node prev=head;
        while(i<size-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }


    public static void main(String[] args) {
        first ll = new first();
       
        ll.addFirst(2);
       
        ll.addFirst(1);
        
        ll.addLast(3);
        
        ll.addLast(4);
         // should print: 1 2 3 4
        
        ll.printList(); 
        
        ll.removenthfromend(3);
        ll.printList();

        
        
        

    }
}

