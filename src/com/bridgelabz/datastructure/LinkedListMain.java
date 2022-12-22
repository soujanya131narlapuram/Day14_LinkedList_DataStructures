
package com.bridgelabz.datastructure;

import static java.lang.System.*;

public class LinkedListMain {

        public static void main(String[] args) {
            LinkedList<Integer> linkedList1 = new LinkedList<>();
            int found_pos=0;

            linkedList1.push(70);
            linkedList1.push(56);
            linkedList1.displaylinkedlist();
            linkedList1.insert(30,1);
            linkedList1.displaylinkedlist();
            System.out.println("Search element is 30:");
            found_pos=linkedList1.searchNode(30);
            System.out.println("position of search element is "+found_pos);
            linkedList1.insert(40,found_pos+1);
            linkedList1.displaylinkedlist();
        }
    }

