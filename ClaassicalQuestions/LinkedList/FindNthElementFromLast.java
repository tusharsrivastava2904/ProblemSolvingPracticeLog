package ClaassicalQuestions.LinkedList;

import ClaassicalQuestions.LinkedList.Template.Node;

import java.util.Scanner;

import static ClaassicalQuestions.LinkedList.Template.PrintLL.printLL;

public class FindNthElementFromLast {
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

        System.out.println("Original Linked List: ");
        printLL(head);

        System.out.println("Enter Nth Pos: ");
        int t = sc.nextInt();
        sc.close();
        int ans  = findNthElementFromEnd(head, t);
        System.out.println("Answer: ");
        System.out.println(ans);
    }

    private static int findNthElementFromEnd(Node head, int n) {
        //APPROACH 1: Naive
        //calculate the length of the LL
        //calculate the position from beginning of n
        //move forward to the pos -> return

//        if (head==null) return -1;
//         	Node iNode = head;
//         	Node resNode = head;
//         	int len = 1;
//
//         	while (iNode.next!=null){
//         	    len++;
//         	    iNode = iNode.next;
//         	}
//
//         	int posResNode = len-n+1;
//         	if (n>len) return -1;
//
//         	for(int i=1; i<posResNode; i++){
//         	    resNode=resNode.next;
//         	}
//
//         	return resNode.data;
//        -------------------------------------------------------------------------
        //APPROACH 2: Two Pointer
        //move the forward pointer to nth pos from beginning
        //once reached, keep moving the backward and forward pointers in parallel (fixed frame size)
        //as soon as forward pointer reaches the last node, return backward.data

        if (head==null) return -1;
        Node fNode = head;
        Node lNode = head;

        Node iNode = head;

        for(int i=1; i<n; i++){
            lNode=lNode.next;
            if(lNode==null) return -1;
        }

        while(lNode.next!=null){
            fNode=fNode.next;
            lNode=lNode.next;
        }

        return fNode.data;
    }
}
