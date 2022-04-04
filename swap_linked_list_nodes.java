class swap_linked_list_nodes {
    public ListNode swapNodes(ListNode head, int k) {
        
         ListNode temp = new ListNode(0);
         ListNode left = head;
         ListNode right = head;
         ListNode temp1 = new ListNode(0);
        
        for(int x = 1; x < k; x++)
        {
           left = left.next;
        }
        
        temp = left;
        
        while(temp.next != null)
        {
            temp = temp.next;
            right = right.next;
        }
        
        temp1.val = left.val;
        left.val = right.val;
        right.val = temp1.val;
        
        
        return head;
        
    }
}
