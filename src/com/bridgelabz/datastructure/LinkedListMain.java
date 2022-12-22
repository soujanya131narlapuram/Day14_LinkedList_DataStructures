
package com.bridgelabz.datastructure;

import static java.lang.System.*;

public class LinkedListMain {

        public static void main(String[] args) {
            LinkedList<Integer> linkedList1 = new LinkedList<>();
            int ll_size=0;

            linkedList1.push(70);
            linkedList1.push(56);
            linkedList1.insert(30,1);
            linkedList1.insert(40,2);
            linkedList1.displaylinkedlist();
            linkedList1.searchAndDelete(40);
            ll_size=linkedList1.linkedListSize();
            System.out.println("the size of the LinkedList after deletion is "+ll_size);
            linkedList1.displaylinkedlist();
        }
    }

