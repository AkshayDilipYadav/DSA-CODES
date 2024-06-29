import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){head = newNode;}
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

    }
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = sc.nextInt();
        for(int i = 0; i < n ; i++){
            int element = sc.nextInt();
            list.add(element);
        }
        list.printList();

    }
}