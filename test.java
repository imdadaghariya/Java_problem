import java.util.Scanner;
class Node{
    private int data;
    private Node next;
    //constructor
    public Node(){
        int data= 0;
        next = null;
    }
    public Node(int d, Node n){
         data= d;
         next = n;
    }
    public void setdata(int d)
    {
         data = d;
    }
    public Node setnext(Node n)
    {
        return next = n;
    }
    public int getdata()
    {
        return(data);
    }
    public Node getnext()
    {
        return(next);
    }
}
class linkedlist{
    private int size;
    private Node start;

    public linkedlist(){
        int size=0;
        Node start = null;
    }

    public boolean isempty(){
        if(start == null){
            return true;
        }
        return false;
    }
    public int getsize(){
        return size;
    }
    public void viewlist(){
        Node t;
        if(isempty())
        {
            System.out.println(start.getdata());
        }
        else{
            t=start;
            for(int i =1;i<size;i++)
            {
                System.out.println(" "+t.getdata());
                t= t.getnext();
            }
        }
    }
    public void insertatfirst(int val){
        Node n;
        n = new Node();
        n.setdata(val);
        n.setnext(start);
        size++;
    }
    public void insertatlast(int val){
       Node n,t;
       n = new Node();
       n.setdata(val);
       t= start;
       if(t== null){
         start = n;
       }
       else{
        while(t.getnext() != null){
             t= t.getnext();
        }
            size++;
       }   
}
    public void insertatpos(int val, int pos){
        if(pos == 1){
            insertatfirst(val);
        }
        else if(pos == size+1){
            insertatlast(val);
        }
        else if(pos >1 && pos <=size+1){
            Node n,t;
            n = new Node(val, null);
            t = start;
            for(int i=0;i<pos-1;i++){
                t = t.getnext();
            }
            n.setnext(t.getnext());
            t.setnext(n);
            size++;
        }
    }
    public void delatfirst(){
        if(start==null){
            System.out.println("Empty list");
        }
        else{
            start= start.getnext();
            size--;
        }
    }
    public void delatlast(){
        Node t;
        t= start;
        if(isempty()){
            System.out.println("Empty list");
        }
        else if(size ==1){
            start =null;
        }
        else{
            for(int i=0;i<size-1;i++){
                t= t.getnext();
            }
            t = t.setnext(null);
            size--;
        }
    }
    public void delatpos(int pos){
        if(start == null){
            System.out.println("empty list");
        }
        else if(pos<1&& pos >=size){
            System.out.println("Invalid pos");
        }
        else if(pos==1 ){
            delatfirst();
        }
        else if(pos==size){
            delatlast();
        }
        else{
            Node t,t1;
            t = start;
            for(int i =0;i<pos-1;i++){
                t =t.getnext();
            }
            t1 = t.getnext();
            t.setnext(t1.getnext());
            size--;
        }
    }
}

public class test {
    public static void main(String []args)
    {
        int pos,data;
        Scanner sc = new Scanner(System.in);
        linkedlist list = new linkedlist();
        while(true){
        System.out.println("1: Add item at First");
        System.out.println("2: Add item at Last");
        System.out.println("3: Add item at Position");
        System.out.println("4: Delete Item at first");
        System.out.println("5: Delete Item at last");
        System.out.println("6: Delete Item at pos");
        System.out.println("7: View list");
        System.out.println("Enter Choice ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Enter Data");
            data = sc.nextInt();  
                list.insertatfirst(data);
                break;
            case 2:
            System.out.println("Enter Data");
            data = sc.nextInt();  
                list.insertatlast(data);
                break;
            case 3:
                System.out.println("Enter position");
                System.out.println("Enter the Data");
                data = sc.nextInt();
                pos = sc.nextInt();
                list.insertatpos(data,pos);

            case 4:
                list.delatfirst();
                break;
            case 5:
                list.delatlast();
                break;
            case 6:
                System.out.println("enter the position");
                pos = sc.nextInt();
                list.delatpos(pos);
                break;
            case 7:
                list.viewlist();
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
    }
}
