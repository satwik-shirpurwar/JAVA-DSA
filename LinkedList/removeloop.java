package LinkedList;

public class removeloop {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    Node head;

    public  void removecycle(){

        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
            
        }

        if(cycle==false){
            return;
        }

            //find meeting point
        
             slow=head;
            Node prev=null;
             while(slow!=fast){
                prev=fast;
                slow=slow.next;
               
                fast=fast.next;
             }

             prev.next=null;






    }


       // Helper method to print the list safely
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        removeloop list = new removeloop();

        list.head=new Node(1);
        Node temp=new Node(2);

        list.head.next=temp;

        list.head.next.next=new Node(3);

         list.head.next.next.next=temp;

         list.removecycle();
         list.printList();

         






    }
}
