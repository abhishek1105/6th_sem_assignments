import java.util.*;
class Node{
int data;
Node next;
Node(int data){
this.data=data;
}
}
 class SinglyLinkedList{
Node head;
void insert (int data)
{
Node temp=new Node (data);
temp.data =data;
if(head==null)
{
 head=temp;
 temp.next=null;
}
else
{
  Node temp1=head;
  while (temp1.next!= null)
  {
    temp1=temp1.next;
  }
  temp1.next=temp;
  temp.next=null;
}}


void insert_pos(int data,int pos){
  Node temp=new Node(data);
  if(pos==0){
    temp.next=head;
	head=temp;
	}
  else{
    Node p = head;
    for(int i=0;i<pos-1;i++)
      p=p.next;
      temp.next = p.next;
      p.next=temp;
  }
}
void delete(int pos){
  if(pos==0){
        head=head.next;
      }
      else{
        Node p=head;
        for(int i=0;i<pos-1;i++){
          p=p.next;

        }
        p.next=p.next.next;
      }
}
void display(){
	Node temp=head;
	System.out.println("LINKED LIST");
while(temp!=null){
	System.out.print(temp.data+"    ");
	temp=temp.next;
}
System.out.println();
}
 }
public class SingleLinkedList{
public static void main(String[] x){
	Scanner sc=new Scanner(System.in);
SinglyLinkedList o = new SinglyLinkedList();
System.out.println("enter size");
int size=sc.nextInt();
System.out.println("enter nodes");
for(int i =0;i<size;i++){
int num;
num=sc.nextInt();
o.insert(num);
}
o.display();
 System.out.print("enter number to be insert ");
 int num3=sc.nextInt();
 System.out.print("enter position to be insert ");
int p=sc.nextInt();
o.insert_pos(num3,p);
o.display();
System.out.print("enter position to be delete ");
int pp=sc.nextInt();
o.delete(pp);
o.display();
}
}