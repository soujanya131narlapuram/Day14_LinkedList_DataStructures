
package com.bridgelabz.datastructure;

import static java.lang.System.*;

public class LinkedListMain {

        public static void main(String[] args) {
            LinkedList<Integer> linkedList1 = new LinkedList<>();
            linkedList1.push(70);
            linkedList1.push(56);
            linkedList1.displaylinkedlist();

            linkedList1.insert(30,1);
            linkedList1.displaylinkedlist();
//            linkedList1.pop();
//            linkedList1.display();
//            linkedList1.insert(56,0);
            linkedList1.popLast();
            linkedList1.displaylinkedlist();


        }
    }

