import java.util.*;
public class stack {
    private int size;
    private int arr[];
    private int top=-1;

    public stack(int size)
    {
        this.size=size;
        arr=new int[size];
    }
    public void push(int data)
    {
        if(top==size-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top]=data;
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    public int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    public void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stack st=new stack(5);
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
            int ch=sc.nextInt();
            
            switch(ch)
            {
                case 1: int ele=sc.nextInt();
                st.push(ele);

                break;

                case 2: int popped=st.pop();
                if(popped!=-1)
                {
                    System.out.println("Popped element: "+popped);
                }
                break;

                case 3: st.display();  
                break;
                case 4: int peeked=st.peek();
                if(peeked!=-1)
                {
                    System.out.println("Top element: "+peeked);
                }   
                break;
                case 5: System.exit(0);
                default: System.out.println("Invalid choice");

            }
        }

    }
}
