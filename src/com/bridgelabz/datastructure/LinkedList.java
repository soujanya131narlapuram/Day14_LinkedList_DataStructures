package com.bridgelabz.datastructure;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T key) {
        Node<T> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void displaylinkedlist() {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.key);
            } else {
                System.out.print(temp.key + " -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void insert(T key, int position) {
        //Create a new node
        Node<T> newNode = new Node(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp, current;
            temp = head;
            current = null;
            for (int i = 0; i < position; i++) {
                current = temp;
                temp = temp.next;
            }
            current.next = newNode;
            newNode.next = temp;
        }

    }

    public void  pop() {
        if (head == null) {
            System.out.println("List is empty");

        } else {

            if (head != tail) {
                head = head.next;
            }
            else {
                head = tail = null;
            }
        }
    }
    public void  popLast(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if(head != tail ) {
                Node current = head;
                while(current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
        }
    }
    public int linkedListSize() {
        Node current = head;
        int i = 0;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                current = current.next;
                i++;
            }
        }
        return (i);
    }
    public void searchAndDelete(T search){      // search and insert  UC4
        Node current = head;
        Node prev = current;
        while(current!=null){
            if(current.key == search) {
                prev.next = current.next;
                current.next = null;
                return;
            }
            prev = current;
            current=current.next;
        }
        System.out.println("Search Element is not found");
    }

}