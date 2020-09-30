import java.util.*;
public class LinkedList3
{
  class Node
  {
    int data;
    Node next;
    public Node(int d)
    {
      data = d;
      next = null;
    }
  }
 public Node head = null;
 public Node tail = null;
 public void add(int d)
 {
   Node newNode = new Node(d);
   if(head == null)
   {
     head = newNode;
     tail = newNode;
   }
   else
   {
     tail.next = newNode;
     tail = newNode;  
   }
 }

  public void insert(int d1)
  {
   Node newNode1 = new Node(d1);
   Node current1 = head;
   Node previous = head;
   while(current1!=null)
   {
     if(newNode1.data<current1.data)
     {
       previous = current1;
       current1 = current1.next;
     }
     else
     {
       previous.next = newNode1;
       newNode1.next = current1;
       break;
     }
   }
  }
 
  public void display()
  {
    Node current = head;
    if(current == null)
    {
      System.out.println("Empty List");
    }
    else
    {
      while(current!=null)
      {
       System.out.print(current.data+" ");
       current = current.next;
      }
      System.out.println();
    }
  }
 
 public static void main(String args[])
 {
   LinkedList3 ls = new LinkedList3();
   Scanner sc = new Scanner(System.in); 
   int n = sc.nextInt();
   while(n!=0)
   {
    ls.add(sc.nextInt());
    n--;
   }
   ls.display();
   ls.insert(sc.nextInt());
   ls.display();
 }
}