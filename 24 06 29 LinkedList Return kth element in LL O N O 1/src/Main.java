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

  public int getKthElement(int k) {
        if(head == null){return -1;}
        Node current = head;
        int count = 1;
        while(current != null && count < k){
            current = current.next;
            count++;
        }
        if(current == null){return -1;}
        return current.data;
  }

}

public class Main{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
LinkedList list = new LinkedList();

int n = sc.nextInt();

for(int i = 0; i< n; i++){
    int element = sc.nextInt();
    list.add(element);
}

int k = sc.nextInt();
int kthElement = list.getKthElement(k);

if(kthElement != -1){
    System.out.println(kthElement);
}


    }
}