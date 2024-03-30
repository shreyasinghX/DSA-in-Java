package Patterns.LinkedList;

public class LinkedListCode {
    static  class LL{
     
        private Node head;
        private Node tail;
   
        public int size;
        public LL(){
           this.size =0;
        }
   
        public void insertFirst(int val){
           Node node=new Node(val);
           node.next=head;
           head=node;
           if(tail==null){
               tail=head;
   
           }
           size++;
        }
        

        public void InsertLast(int val){
            if(tail==null){
                insertFirst(val);
                return;
             }
            Node node=new Node(val);
            
            tail.next=node;
            tail=node;
            size++;
        }

        public void InsertAtIndex(int val,int index){
            if(index==0){
               insertFirst(val);
               return ;
            }
            if(index==size){
                InsertLast(val);
                return ;
             }

             Node temp=head;
             for(int i=1;i<index;i++){
                temp=temp.next;
             }

             Node node = new Node(val,temp.next);
             temp.next=node;
             size++;
        }

        public int DeleteFirst(){
            int val=head.value;
            head=head.next;
            if(head==null){
                tail=null;
            }
            size--;
            return val;
        }

        public Node get(int index){
            Node node =head;
            for(int i=0;i<index;i++){
                node=node.next;

            }
            return node;
        }

        public int DeletLast(){
            if(size<=1){
                return DeleteFirst();
            }
            Node secondLast=get(size-2);
            int val=tail.value;
            tail=secondLast;
            tail.next=null;
            return val;

        }

        public int delete(int index){
            if(index==0){
                return DeleteFirst();
            }
            if(index==size-1){
                return DeletLast();

            }
            Node prev=get(index-1);
            int val=prev.next.value;
            prev.next=prev.next.next;
            return val;
        }

        public Node find(int value){
            Node node=head;
            while(node!=null){
                if(node.value==value){
                    return node;
                }
            }
            return null;
        }
        public void display(){
           Node temp=head;
           while(temp!=null){
               System.out.print(temp.value + "-->");
               temp=temp.next;
           }
           System.out.print("END");
        }
        
        private class Node{
           private int value;
           private Node next;
   
           public Node(int value){
               this.value=value;
           }
   
           public Node(int value,Node next){
              this.value=value;
              this.next=next;
           }
       }
       
       }
        public static void main(String []args){
           LL list = new LL();
           
           list.insertFirst(34);
           list.insertFirst(8);
           list.insertFirst(2);
           list.insertFirst(18);
           list.insertFirst(7);
           list.InsertLast(88);
           list.InsertAtIndex(100,3);
           System.out.println(list.DeleteFirst());
           System.out.println(list.DeletLast());
           System.out.println(list.delete(3));
        //    System.out.println(list.find(100));
           list.display();
   
   
       
          }
}
