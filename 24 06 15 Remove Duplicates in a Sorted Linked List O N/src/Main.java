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
        if(n == 0){return;}
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;
        for(int i =1; i < n; i++){
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        ListNode newHead = deleteDuplicates(head);
        current = newHead;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static ListNode deleteDuplicates(ListNode head){
        ListNode current = head;
        while(current != null && current.next!= null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }
            else{current = current.next;}
        }
        return head;
    }
}