class segregrateNode
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node head1=head;
        Node head2=head;
        int one=0,two=0,zero=0;
        while(head1!=null){
            if(head1.data==0) zero++;
            if(head1.data==1) one++;
            if(head1.data==2) two++;
            head1=head1.next;
        }
        while(head2!=null){
            if(zero>0){
                head2.data=0;
                head2=head2.next;
                zero--;
            }
            else if(one>0){
                head2.data=1;
                head2=head2.next;
                one--;
            }
            else if(two>0){
                head2.data=2;
                head2=head2.next;
                two--;
            }
        }
        return head;
    }
}