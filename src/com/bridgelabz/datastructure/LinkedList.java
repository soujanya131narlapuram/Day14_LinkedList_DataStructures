
package com.bridgelabz.datastructure;

    public class LinkedList<T> {

        Node<T> head;
        Node<T> tail;

        public void push(T key) {
            Node<T> newNode = new Node(key);
            head = newNode;
            tail = newNode;
        }



    }

