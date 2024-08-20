
public class StackUsingArray{
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.print();
        System.out.println(s.pop());
        System.out.println(s.top());
        System.out.println(s.size());
    }    
}

class Stack{
    int n=1000;
    int arr[]=new int[n];
    int top=-1;
    void push(int x){
        top++;
        arr[top]=x;
    }
    int pop(){
        int x=arr[top];
        top--;
        return x;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top+1;
    }
    void print(){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0)
            System.out.println(arr[i]);
        }
    }

}