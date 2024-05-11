
Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.


Example 1:

Input:
N = 5, K = 6
arr[] = {1,2,3,4,6}
Output: 1
Exlpanation: Since, 6 is present in 
the array at index 4 (0-based indexing),
output is 1.


class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        int index=arr.length/2;
        if(arr[index]>K)
            return findElement(arr,0,index,K);
        else
            return findElement(arr,index,arr.length-1,K);
    }
    
    static int findElement(int arr[],int startIndex,int endIndex,int K){
        for(int i=startIndex;i<=endIndex;i++){
            if(K==arr[i]){
                return 1;
            }
        }   
        return -1;
    }
}

Note - divide the array in half then search for the element either on right side or left side of the array.