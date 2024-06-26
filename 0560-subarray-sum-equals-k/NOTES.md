1.This was our dynamic sliding window pattern question.

2.But the main difference here was that instead of storing the index of sum-k in the hashmap, we were storing the number of times sum-k has appeared.

3.Because when we need to find largest subarray with sum k, we only care about the index of sum-k i.e. where sum-k appeared for the very first time. This gives us k for a subarray which is largest. Eg if the sum of my window after adding 7 elements is 6 and my k is 3. then sum-k will be 3. And if sum-k=3 has appeared on index number 1 and 3, then I will consider only index 1 and therefore while keeping my index and sum in the hashmap we only use mp.putIfAbsent(sum,index) - Add sum only for the first time to get the maximum range subarray with sum k.

4.But when we need to find the count of the subarray's with sum k, we care how many times sum-k has occured.

5.The number of times we will find a subarray with sum k = the number of times sum-k is present in the array.

6.So in the hashmap this time we keep the count of the number of times sum-k has occured.

7.Using the same example as above if the sum of my window after adding 7 elements is 6 and my k is 3, then sum-k will be 3. And if sum-k has appeared on index 1 and 3, then I will count this as 2. So my hashmap will store sum-k=3 as mp.put(sum,increment the count whenever the sum is encountered).

8.So in conclusion to find largest subarraywith sum k, find sum-k when it occured for the very first time and use the index.

9.And to find the number of subarrays with sum k, find number of times sum-k has occured and use the count.
