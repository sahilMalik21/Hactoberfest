// sorted order insertion....
public class LinkedList4
{
 Node head;
 class Node
 {
  int data;
  Node next;
  public Node(int d)
  {
   data = d; next = null;
  }
 }

 void sortedInsert(Node new_node)
 {
  Node current;
  if (head == null || head.data >= new_node.data)
  {
   new_node.next = head;
   head = new_node;
  }
  else
 {
  current = head;
  while (current.next != null && current.next.data < new_node.data)
  current = current.next;
  new_node.next = current.next;
  current.next = new_node;
 }
}

 Node newNode(int data)
 {
  Node x = new Node(data);
  return x;
 }

 void printList()
 {
  Node temp = head;
  while (temp != null)
  {
   System.out.print(temp.data+" ");
   temp = temp.next;
  }
 }
 public static void main(String args[])
 {
  LinkedList4 llist = new LinkedList4();
  Node new_node;
  new_node = llist.newNode(5);  
  llist.sortedInsert(new_node);
  new_node = llist.newNode(10);
  llist.sortedInsert(new_node);
  new_node = llist.newNode(7);
  llist.sortedInsert(new_node);
  new_node = llist.newNode(3);
  llist.sortedInsert(new_node);
  new_node = llist.newNode(1);
  llist.sortedInsert(new_node);
  new_node = llist.newNode(9);
  llist.sortedInsert(new_node);
  new_node = llist.newNode(0);
  llist.sortedInsert(new_node);
  llist.printList();
 }
} 