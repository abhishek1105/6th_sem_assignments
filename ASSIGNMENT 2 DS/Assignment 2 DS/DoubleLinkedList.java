import java.util.*;
class Node{
  int data;
  Node next;
  Node prev;
  Node(int data){
    this.data=data;
    }
    }
    class DoublyLinkedList{
       Node head;
       Node tail;
       public void Insert(int data){
         Node node = new Node(data);
         if(head==null){
                head=node;
                tail=node;
              }
              else{
                tail.next=node;
                node.prev=tail;
                tail=node;
              }
            }
            public void traverse(){
        if(head==null){
          System.out.println("LIST IS EMPTY");
          }
          else{
            Node current;
            current=head;
             System.out.println(" DOUBLY LINKED LIST");
            while(current!=null){
              System.out.print(current.data+"  ");
              current=current.next;
              }
			  System.out.println();
              }
              }
			  public void insertAt(int data,int pos){
				  int count=0;
			  Node node=head;
			  Node prev=null;
			  while(count!=pos){
				  count++;
				  prev=node;
				  node=node.next;
				  
			  }
			  Node node1=new Node(data);
			  
			  node1.next=node;
			  if(count==0)
				  head=node1;
			  else
				  prev.next=node1;
			  }
			  public void deleteAt(int pos){
				  if(pos==0){
					  head=head.next;
					  }
					  else{
						  Node p=head;
						  for(int i=0;i<pos-1;i++){
							  p=p.next;
							  }
							  p.next=p.next.next;
							  p.next.next.prev=p;
							  }
							  }
							  }
			  class DoubleLinkedList {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    DoublyLinkedList List = new DoublyLinkedList();
      System.out.println("enter size");
      int size=sc.nextInt();
      System.out.println("enter nodes");
      for(int i =0;i<size;i++){
        int num;
        num=sc.nextInt();
        List.Insert(num);
        }
        List.traverse();
		System.out.print("enter number to be insert ");
		int num3=sc.nextInt();
		System.out.print("enter position to be insert ");
		int pos=sc.nextInt();
		List.insertAt(num3,pos);
		List.traverse();
		System.out.print("enter position to be delete ");
		int del=sc.nextInt();
		List.deleteAt(del);
		List.traverse();
        }
        }