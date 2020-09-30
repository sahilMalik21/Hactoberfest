// Program insertion at any position in node...
import java.util.*;
class LinkedList2
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
  Node newNode =  new Node(d);
  if(head == null)
  {
   head = newNode;
   tail = newNode;
  }
  else
  {
    tail.next = newNode;
    tail = newNode ;
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
      while(current != null)
      {
        System.out.println(current.data);
        current = current.next;
      }
    }
  }
   
  public void insert(int n,int a)
  {
    int i=1;
    Node n1 = new Node(n);
    Node current = head;
    Node c;
    while(i<a)
    {
      if(i==a-1)
      {
        c=current.next;
        current.next=n1;
        n1.next=c;
      }
      current = current.next;
      i++;
      if(current == null){System.out.println("Position not Found"); break;}
    }
  } 
  
  public static void main(String args[])
  {
    LinkedList2 li = new LinkedList2();
    Scanner cin = new Scanner(System.in);
    li.add(1);
    li.add(2);
    li.add(3);
    li.add(4);
    li.add(5);
    li.display();
    int n=cin.nextInt();
    int a=cin.nextInt();  
    li.insert(n,a);
    li.display();
  }
}