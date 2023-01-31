package ClaassicalQuestions.LinkedList;

import ClaassicalQuestions.LinkedList.Template.Node;

import java.util.Scanner;

import static ClaassicalQuestions.LinkedList.Template.PrintLL.printLL;

public class ReverseLL {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. of elements in LL: ");
        int n=sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node tail = head;
        for (int i=0; i<n-1; i++){
            tail.next=new Node(sc.nextInt());
            tail=tail.next;
        }
        sc.close();
        System.out.println("Original Linked List: ");
        printLL(head);

        Node ansHead  = reverseLL(head);
        System.out.println("Answer: ");
        printLL(ansHead);
    }

    private static Node reverseLL(Node head) {
        if(head==null || head.next==null) return head;

        // ITERATIVE APPROACH

//        Node current = head;
//        Node prev = null;
//        Node forward = null;
//
//        while(current!=null){
//            forward=current.next;   //backup the link that has to be broken
//            current.next=prev;  //establish new link
//
//            prev=current;   //move pointer
//            current=forward;    //move pointer
//        }
//
//        return prev;    //prev becomes the new head of the reversed linked list

        // RECURSIVE
        Node newHead = reverseLL(head.next);    //newHead is the head of the reversed part of LL
        Node HeadNext = head.next;  //HeadNext is retrieved as previous known connection head.next from original LL
        HeadNext.next = head;   //new link is established between the reversed and un-reversed terminals of the LL
        head.next = null;   //finally tail is made to point NULL

        return newHead;
    }
}
