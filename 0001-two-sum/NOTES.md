1.We can solve this using 2 for loops with O(n^2) time complexity.
2.But for a more optimal approach we can think of hashmap.
3.The intuition is that two numbers in the array will add to form the target value. eg. if target is 22 and array is [2,7,11,15] then the numbers will be 15 and 7.
4.So instead of finding both the numbers say x and y, we can **find one number** using **target-x**.
5.We will loop through the array and perform **target-arr[i]** to check if the resultant is present in the hashmap, if it is present then the value of that key will be our index that we need to return.
6.If the **target-arr[i]** value is not present then we will add the **arr[i]** value with it's index to the hashMap.