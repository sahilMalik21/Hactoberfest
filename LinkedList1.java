// Program insertion at beginning...

class LinkedList1
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
    newNode.next = head;
    head = newNode;
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
    
  
  public static void main(String args[])
  {
    LinkedList1 li = new LinkedList1();
    li.add(1);
    li.add(2);
    li.add(3);
    li.add(4);
    li.add(5);
    li.display();
  }
}