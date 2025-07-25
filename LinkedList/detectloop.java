package LinkedList;

public class detectloop {

    // Define Node class
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

    // Method to detect cycle
    public boolean iscycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Test the method
    public static void main(String[] args) {
        detectloop list = new detectloop();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        // Create a cycle for testing: 4 -> 2
        list.head.next.next.next.next = list.head.next;

        if (list.iscycle()) {
            System.out.println("Cycle detected!");
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
