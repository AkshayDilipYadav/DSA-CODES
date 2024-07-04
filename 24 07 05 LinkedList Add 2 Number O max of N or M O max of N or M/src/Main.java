import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}

class LinkedListSum{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dumyHead = new ListNode(0);
        ListNode p = l1, q = l2, current = dumyHead;
        int carry = 0;
        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val :0;

            int sum = carry + x+ y;
            carry = sum / 10;
            current.next = new ListNode(sum %10);
            current = current.next;
            if(p != null){p=p.next;}
            if(q != null){q=q.next;}
        }
        if(carry > 0){
            current.next = new ListNode(carry);
        }
        return dumyHead.next;
    }

    public static void printList(ListNode node){
        while(node != null){
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode l1 = new ListNode(sc.nextInt());
        ListNode current = l1;
        for(int i = 1; i < n; i++){
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }

        int m = sc.nextInt();
        ListNode l2 = new ListNode(sc.nextInt());
        current = l2;
        for(int i =1; i < m; i++){
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }

        ListNode result = addTwoNumbers(l1, l2);
        printList(result);

    }


}