import java.util.Scanner;

public class Main{
    static class ListNode{
        int val ;
        ListNode next;
        ListNode(int x ){val=x;}
    }
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
ListNode head = new ListNode(sc.nextInt());
ListNode current = head;
for(int i =1; i < n; i++){
    current.next = new ListNode(sc.nextInt());
    current = current.next;
}
int b = sc.nextInt();
ListNode newHead = deleteNode(head, b);
current = newHead;
while(current != null){
    System.out.print(current.val+ " ");
    current = current.next;
}
System.out.println();
    }
    public static ListNode deleteNode(ListNode head, int b){
        if(b == 0){return head.next;}
        ListNode current = head;
        for(int i = 0; i < b-1; i++){
            current = current.next;
        }
        if(current != null && current.next != null){
            current.next = current.next.next;
        }
        return head;
    }

}