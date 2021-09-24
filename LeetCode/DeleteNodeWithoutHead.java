  public void deleteNode(ListNode node) {
    ListNode temp = node;
    ListNode prev = node;
        if(temp == null){
            return;
        }
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
            
            prev.val = temp.val;
            
        }
        
        prev.next = null;
    }