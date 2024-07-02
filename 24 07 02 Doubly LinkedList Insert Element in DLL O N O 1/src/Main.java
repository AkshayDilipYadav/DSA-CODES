import java.util.Scanner;
class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList{
    Node head;

    public DoublyLinkedList(){
        this.head = null;
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position == 1){
            newNode.next = head;
            if(head != null){
                head.prev = newNode;
            }
            head = newNode;
            return;
        }

        Node temp = head;
        for(int i = 1; i < position -1 && temp != null; i++){temp = temp.next;}

        if(temp == null){
            return;
        }
        newNode.next = temp.next;
        if(temp.next != null){
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            int element = sc.nextInt();
            list.insertAtEnd(element);
        }
        int newElement= sc.nextInt();
        int position = sc.nextInt();

        list.insertAtPosition(newElement, position);
        list.printList();

    }
}