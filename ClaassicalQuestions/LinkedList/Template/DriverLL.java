package ClaassicalQuestions.LinkedList.Template;

import java.util.Scanner;

import static ClaassicalQuestions.LinkedList.Template.PrintLL.printLL;

//Just copy the code inside the method, and paste in each solution as main() body, and finally pass the head as parameter to the function
//responsible for calculating the answer

public class DriverLL {
    public static void CreateLL(){
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
//        int ans  = SOLUTION_METHOD(head);
        System.out.println("Answer: ");
//        System.out.println(ans);
    }
}
