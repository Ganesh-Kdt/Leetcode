package LinkedListImpl;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        int arr1[] = new int[]{5,10,15,20};
        for(int i=0;i<=arr1.length-1;i++){
            ll.inserAtBeg(arr1[i]);
        }
        ll.print();
        System.out.println("--------------------------------");
        int arr2[] = new int[]{25,30,35,40};
        for(int i=0;i<=arr2.length-1;i++) {
        	ll.insertAtEnd(arr2[i]);
        }
        ll.print();
        System.out.println("--------------------------------");
        ll.insert(5,60);
        ll.print();
        System.out.println("--------------------------------");
        
        ll.removeHead();
        ll.print();
        System.out.println("--------------------------------");
        
        ll.removeTail();
        ll.print();
        System.out.println("--------------------------------");
        
        ll.removeAtindex(4);
        ll.print();
        System.out.println("--------------------------------");
        
    }
}

