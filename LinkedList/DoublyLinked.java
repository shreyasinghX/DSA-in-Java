package Patterns.LinkedList;

public class DoublyLinked {
    
    static class DLL{
        Node head;
        int size;
        public DLL(){
           this.size=0;
        }
        
        public void insertFirst(int val){
           Node node=new Node(val);
           node.next=head;
           node.prev=null;
           if(head!=null){

               head.prev=node;
           }
           head=node;
           size++;
        }

        public void InsertLast(int val){
            Node node = new Node(val);
            Node last = head;
            if(head == null){
                node.prev = null;
                head=node;
                return;
            }
            while(last.next!=null){
                 last=last.next;         
            }
            node.next=null;
            last.next=node;
            node.prev=last;
            last=node; 
            size++;

        }
        public Node get(int index){
            Node node=head;
            for(int i=0;i<index;i++){
                node=node.next;
            }
            return node;
        }
        public void Insert(int index,int val){
            if(index==0){
                insertFirst(val);
                return;
            }
            if(index==size-1){
                InsertLast(val);
                return;
            }
            Node node=get(index-1);
             Node newnode = new Node(val) ;
             newnode.next=node.next;
             node.next=newnode;
             

             newnode.prev=node;
             if(newnode.next!=null){
                 newnode.next.prev=newnode;

             }
             size++;

        }
        public void display(){
            Node node=head;
            Node last=null;
            while(node!=null){
                System.out.print(node.val + "->");
                last=node;
                node=node.next;
            }
            System.out.println ("END");

            System.out.println("Print in reverse");
            while(last!=null){
                System.out.print(last.val + "->");
                last=last.prev;
            }
            
            System.out.println("START");
        }

       


       
        private class Node{
            int val;
            Node next;
            Node prev;

            public Node(int val){
               this.val=val;
            }

            public Node(int val,Node next,Node prev){
                this.val=val;
                this.next=next;
                this.prev=prev;
            }
        }
    }
    public static void main(String args[]){
           DLL list = new DLL();
           list.insertFirst(8);
           list.insertFirst(7);
           list.insertFirst(67);
           list.insertFirst(5);
           list.insertFirst(12);
           list.InsertLast(89);
           list.Insert(3,17);
           
           list.display();
    }
}
