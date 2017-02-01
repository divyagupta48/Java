
import java.io.*; 
class Queue
{
    int Q[]; // Array to implement Queue
    int size; // Maximum size of the Queue
    int front; // Index of front element
    int rear; // Index of rear element
     
    Queue(int cap) // Parameterised Constructor
    {
        size = cap;
        Q = new int[size];
        front = 0;
        rear = 0;
    }
     
    void insert(int v) // Function to insert element in Queue
    {
        if(rear == size) // Condition for Overflow
        {
            System.out.println("OVERFLOW");
        }
        else
        {
            Q[rear] = v; // Storing value in Queue
            rear = rear + 1;   
        }
    }
    public static void main(String[] args) throws IOException {
        Queue q = new Queue(5);
        boolean yes=true;
        int choice;
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in)); 
        do{
            System.out.println("1).Enqueue\n2).Dequeue\n3).Exit\n\nEnter Choice");
            choice = Integer.parseInt(is.readLine());
                        switch(choice)
            {
                case 1: System.out.println("Enter Item: ");
                        q.insert(Integer.parseInt(is.readLine()));
                        break;
                case 2: q.delete();break;
                case 3: yes = false;break;
                default: System.out.println("Invalid Choice");
            }
        }while(yes==true);
            }

     
    void delete() // Function to delete element from Queue
    {
        if(front == 0 && rear == 0) // Condition for Underflow
        {
            System.out.println("UNDERFLOW");
        }
        else
        {
            int val = Q[front]; // Storing the element which will be removed
            front = front + 1;
            if(front == rear) // Condition for emptying the Queue 
            {
                front = 0;
                rear = 0;
            }
        }
    }
     
    void display() // Function for printing elements in the queue
    {
        if(front == 0 && rear == 0)
        {
            System.out.println("The Queue is empty");
        }
        else
        {
            System.out.println("The elements in the queue are : ");
            for(int i=front; i<rear; i++)
            {
                System.out.println(Q[i]);
            }
        }
    }
}  