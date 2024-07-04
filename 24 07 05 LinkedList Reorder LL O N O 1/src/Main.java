import java.util.Scanner;
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val =x;
        next = null;
    }
}

 class ReorderLinkedList{
    public static ListNode reorderList(ListNode head){
        if(head == null || head.next == null){
            return head;

        }
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null, curr = slow, temp;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode first = head, second = prev;

        while(second.next != null){
            temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
        return head;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n <= 0){return;}
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;
        for(int i = 1; i < n; i++){
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        head = reorderList(head);
        current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

 }