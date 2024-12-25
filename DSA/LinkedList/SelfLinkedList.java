package DSA.LinkedList;

public class SelfLinkedList {

    // Node class representing each element in the linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the linked list

    // Method to add a new element at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display all elements in the linked list
    public void display() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to remove an element by value
    public void remove(int data) {
        if (head == null) {
            System.out.println("The linked list is empty. Nothing to remove.");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Element " + data + " not found in the list.");
        } else {
            current.next = current.next.next;
        }
    }

    // Method to search for an element in the linked list
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SelfLinkedList list = new SelfLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Linked list elements:");
        list.display();

        System.out.println("Removing 20 from the list.");
        list.remove(20);

        System.out.println("Updated linked list elements:");
        list.display();

        System.out.println("Searching for 30: " + list.search(30));
        System.out.println("Searching for 40: " + list.search(40));
    }
}
