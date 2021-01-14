import java.util;
import java.util.Scanner;
import java.util.LinkedList;

//import org.graalvm.compiler.lir.alloc.lsra.LinearScan_OptionDescriptors;
 
public class SinglyLinkedlist{
private ListNode head;
private static class ListNode
{
    private int data;
    private ListNode next;
     public ListNode(int data)
     {
         this.data = data;
         this.next = null;
     }
    }
      public void display()
     {
         ListNode current = head;
         while(current!=null)
         {
             System.out.print(current.data +"-->" );
             current = current.next;

         }
         System.out.print("Null");
     }



public static void main(String[] args){
    SinglyLinkedlist sll= new SinglyLinkedlist();   // creating nodes
    sll.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(18);
    ListNode fourth = new ListNode(11);
     
    // connecting to form a node
    sll.head.next = second;
    second.next = third;
    third.next = fourth; // fourth points to null
    sll.display();
}
}



