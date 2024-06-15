import java.util.Scanner;
public class Main{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
ListNode head = new ListNode(sc.nextInt());
ListNode current = head;
for(int i =1; i< n; i++){
    current.next = new ListNode(sc.nextInt());
    current = current.next;
}
int B = sc.nextInt();
ListNode newHead = removeNthFromEnd(head, B);
current = newHead;
while(current != null){
    System.out.print(current.val + " ");
    current = current.next;

}
System.out.println();
    }
    public static ListNode removeNthFromEnd(ListNode head, int B){
        ListNode fast = head;
        ListNode slow = head;
        for(int i =0; i< B; i++){
            if(fast.next == null){return head.next;}
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}