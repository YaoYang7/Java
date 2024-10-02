public class Problem3 {

    static class Node { // Create a Node class, static so that main can access it
        int data;
        Node next; // Pointer to next node

        public Node(int data) { // Constructor
            this.data = data;  // Assign data to the new node
            this.next = null;  // Initialize next as null
        }
    }

    static class LinkedList {
        public Node head; // Head of the list

        public LinkedList() { // Constructor
            this.head = null; // Initialize head as null
        }

        public void addFirst(int data) { // Add a new node at the beginning
            Node newNode = new Node(data); // Create a new node
            newNode.next = head; // Make next of new node as head
            head = newNode; // Move the head to point to the new node
        }

        public void addLast(int data) { // Add a new node at the end
            Node newNode = new Node(data); // Create a new node
            if (head == null) { // If the Linked List is empty, then make the new node as head
                head = newNode;
                return;
            }
            Node last = head; // Else traverse till the last node
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode; // Change the next of last node
        }

        public void removeFirst() { // Remove the first node
            if (head == null) { // If the Linked List is empty, then return
                return;
            }
            head = head.next; // Move the head to the next node
        }

        public void removeLast() { // Remove the last node
            if (head == null) { // If the Linked List is empty, then return
                return;
            }
            if (head.next == null) { // If there is only one node in the list, then make the head as null
                head = null;
                return;
            }
            Node secondLast = head; // Else traverse till the second last node
            while (secondLast.next.next != null) {
                secondLast = secondLast.next;
            }
            secondLast.next = null; // Change the next of second last node to null
        }
        
        public int getFirst() {
            if (head == null) { // If the Linked List is empty, then return
                return -1;
            }
            return head.data; 
          // Return the data of the first node
        }       

        public int getLast() {
            if (head == null) { // If the Linked List is empty, then return
                return -1; 
            }
            Node last = head; // Else traverse till the last node
            while (last.next != null) {
                last = last.next;
            }
            return last.data; // Return the data of the last node
        }

        public int insertItem (int index, int data) {
            if (index < 0) { // If the index is less than 0, then return -1
                return -1;
            }
            if (index == 0) { // If the index is 0, then add the new node at the beginning
                addFirst(data);
                return 0;
            }
            Node newNode = new Node(data); // Create a new node
            Node current = head; // Start at the beginning of the list
            for (int i = 0; i < index - 1; i++) { // Traverse till the (index-1)th node
                if (current != null) {
                    current = current.next;
                } else {
                    return -1; // If the index is greater than the length of the list, then return -1
                }
            }
            if (current == null) { // If the current node is null, then return -1
                return -1;
            }
            newNode.next = current.next; // Change the next of the new node to the next of the current node
            current.next = newNode; // Change the next of the current node to the new node
            return 0;
        }

        public int removeItem (int index) {
            if (index < 0) { // If the index is less than 0, then return -1
                return -1;
            }
            if (index == 0) { // If the index is 0, then remove the first node
                removeFirst();
                return 0;
            }
            Node current = head; // Start at the beginning of the list
            for (int i = 0; i < index - 1; i++) { // Traverse till the (index-1)th node
                if (current != null) {
                    current = current.next;
                } else {
                    return -1; // If the index is greater than the length of the list, then return -1
                }
            }
            if (current == null || current.next == null) { // If the current node or the next node is null, then return -1
                return -1;
            }
            current.next = current.next.next; // Remove the next node
            return 0;
        }

        public void displayLL() { // Display the Linked List
            Node current = head; // Start at the beginning of the list
            while (current != null) { // While the current node is not null
                System.out.print(current.data + " "); // Print the data of the current node
                current = current.next; // Move to the next node
            }
            System.out.println("           "); // Print a new line
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // Create a new Linked List

        // Write a program in Java to implement a linked list containing 5 numbers <11, 22, 6, 89, 99>
        ll.addLast(11); // Add 11 to the end of the list
        ll.addLast(22); // Add 22 to the end of the list
        ll.addLast(6); // Add 6 to the end of the list
        ll.addLast(89); // Add 89 to the end of the list
        ll.addLast(99); // Add 99 to the end of the list

        // Insert a number <50> in the third position of the linked list and print the new linked list <11, 22, 50, 6, 89, 99>
        ll.insertItem(2, 50); // Insert 50 at the 3rd position
        ll.displayLL(); // Display the Linked List

        // Delete the 2nd element of the linked list and print the remaining linked list <11, 50, 6, 89, 99>
        ll.removeItem(1); // Remove the 2nd element
        ll.displayLL(); // Display the Linked List

        // Delete the 1st element of the linked list and print the remaining linked list <50, 6, 89, 99>
        ll.removeFirst(); // Remove the 1st element
        ll.displayLL(); // Display the Linked List

        // Delete the last element of the linked list and print the remaining linked list <50,6,89>
        ll.removeLast(); // Remove the last element
        ll.displayLL(); // Display the Linked List
    }
    
} 
