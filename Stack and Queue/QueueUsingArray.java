public class QueueUsingArray{
    public static void main(String args[]){
        Queue q =new Queue(5);
        q.push(5);
        q.push(10);
        q.push(15);
        q.push(20);
        System.out.println("queue");
        q.print();
        q.push(25);
        System.out.println("queue");
        q.print();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        System.out.println("queue");
        q.print();
        q.pop();
        System.out.println("queue");
        q.print();
        System.out.println("queue");
        q.pop();
    }
}

class Queue{
    int maxsize;
    int start;
    int end;
    int currentSize;
    int arr[];
    Queue(int maxsize){
        this.maxsize=maxsize;
        arr=new int[maxsize];
        start=-1;
        end=-1;
    }

    public void push(int x){
        if(currentSize==maxsize)
        return;
        if(end==-1){
            end=0;
            start=0;
        }
        else
        end=(end+1)%maxsize;
        arr[end]=x;
        currentSize++;
    }
    public int pop(){
        if(start==-1)
        return -1;
        int x=arr[start];
        if(currentSize==1){
            start=-1;
            end=-1;
        }
        start=(start+1)%maxsize;
        currentSize--;
        return x;
    }
    public int top(){
        if(start==-1)
        return -1;
        return arr[start];
    }
    public int size(){
        return currentSize;
    }
    public void print(){
        for(int i=start;i<=end;i++){
            if(arr[i]!=0)
            System.out.println(arr[i]);
        }
    }
}