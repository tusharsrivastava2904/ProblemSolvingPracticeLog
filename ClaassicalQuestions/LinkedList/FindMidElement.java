package ClaassicalQuestions.LinkedList;
import ClaassicalQuestions.LinkedList.Template.Node;
import java.util.Scanner;
import static ClaassicalQuestions.LinkedList.Template.PrintLL.printLL;

public class FindMidElement {
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
        int ans  = findMidElement(head);
        System.out.println("Answer: ");
        System.out.println(ans);
    }

    private static int findMidElement(Node head) {
        // take a fast pointer and a slow pointer move them at different speeds
        //formulate condition when fast should stop, so that slow points to null

        //in this particular question we return the 2nd element in the middle in case of even length

        Node f  = head;
        Node s = head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s.data;
    }
}
