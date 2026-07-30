class Solution {
public:
   
    ListNode* revLL(ListNode *head) {
        ListNode* prev = nullptr;
        ListNode* curr = head;
        ListNode* n = nullptr;

        while (curr) {
            n = curr->next;
            curr->next = prev;
            prev = curr;
            curr = n;
        }
        return prev; 
    }
 
    bool isPalindrome(ListNode* head) {
        if (!head || !head->next) {
            return true;
        }
       
        ListNode* slow = head;
        ListNode* fast = head;
        
        
        while (fast->next && fast->next->next) {
            slow = slow->next;
            fast = fast->next->next;
        }
        
        
        ListNode* newHead = revLL(slow->next);
        
       
        ListNode *c1 = head;
        ListNode *c2 = newHead;
        bool result = true;

        while (c2) {
            if (c1->val != c2->val) {
                result = false;
                break; 
            }
            c1 = c1->next;
            c2 = c2->next;
        }
        
       
        slow->next = revLL(newHead);

        
        return result;
    }
};