import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    void add(int data){
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
    boolean contains(int x){
        Node current = head;
        while(current != null){
            if(current.data == x){
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

public class Main{
    public static void main(String[] args){
       LinkedList list = new LinkedList();
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i = 0; i< n; i++){
           int element = sc.nextInt();
           list.add(element);
       }
       int x = sc.nextInt();
       if(list.contains(x)){System.out.print("Present");}
       else{System.out.print("Not Present");}

    }
}