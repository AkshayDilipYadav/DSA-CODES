import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val = x; next = null;}
}

class ReverseNodesIntGroups{
    public static ListNode createLinkedList(int[] values){
        if(values.length == 0) { return null;}
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for(int i = 1; i < values.length; i++){
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
    public static void printLinkedList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static ListNode reverseKGroup(ListNode head, int k){
        if(head == null || k == 1){return head;}
        ListNode dumy = new ListNode(0);
        dumy.next = head;
        ListNode curr = dumy, nex = dumy, pre = dumy;
        int count =0;
        while(curr.next != null){
            curr = curr.next;
            count++;
        }
        while(count >= k){
            curr = pre.next;
            nex = curr.next;
            for(int i = 1; i < k; i++){
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre = curr;
            count -= k;
        }
        return dumy.next;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for(int i = 0; i< n ; i++){
            values[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        ListNode head = createLinkedList(values);
        ListNode modifiedHead = reverseKGroup(head, B);
        printLinkedList(modifiedHead);
    }

}