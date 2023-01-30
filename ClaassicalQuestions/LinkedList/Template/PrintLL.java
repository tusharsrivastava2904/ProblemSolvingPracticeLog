package ClaassicalQuestions.LinkedList.Template;

public class PrintLL {
    public static void printLL(Node node){
        while(node!=null&&node.next!=null){
            System.out.print(node.data+" -> ");
            node=node.next;
        } if (node.next==null) {
            System.out.println(node.data+" -> NULL");
        }
        System.out.println();
    }
}
