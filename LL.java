import java.util.*;
import java.lang.*;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
		}
		
		public Node(int value,Node next) {
			this.value=value;
			this.next=next;
		}
	}

    public void insertFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		head=node;
		
		if (tail==null) {
			tail=head;
		}
		
		size+=1;
	}

    public void displayLL() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.value + " -> ");
			temp=temp.next;
		}
		
		System.out.println("end");
	}

    public void reverse(){
        if (size<2){
            return;
        }

        Node prev=null;
        Node pres=head;
        Node next=pres.next;

        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;        
    }

    private void reverse(Node node) {		
		if (node==tail) {
			head=tail;
			return;
		}
		reverse(node.next);
		tail.next=node;
		tail=node;
		tail.next=null;		
	}

    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        //System.out.println(list.head.value);
        list.reverse(list.head);
        list.displayLL();

    }


}
