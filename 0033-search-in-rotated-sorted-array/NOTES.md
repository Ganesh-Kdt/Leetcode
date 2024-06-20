1.In Binary search we find our element in the array at the mid. If not found we keep splitting our array using the comparison condition between target and mid to find where our target element lies in the array, does it lie on the left side or on the right side. And the comparison condition works only if the array is sorted.

2.But since the array is sorted and rotated therefore there will be a index at which the array will not be sorted. So we cannot directly use the comparison condition.
eg. - arr = [3,4,5,0,1,2] array is sorted but between 5 and 0 it is not sorted.

3.So we can infer from this observation that the array will always be sorted at either the left or right side of the array. And we can use this condition for comparison.

4.According to our above example the array was sorted on the left side of the mid, we found this out using the arr[low] and arr[mid] elements.

5.Now we will check if the target is present in the left side using arr[low] and arr[mid]. Since the left side is sorted the target element could be between arr[low] and arr[mid].

6.If the target element is not present in the left side then we eliminate the left side and go to the right side and make the right side as our new subarray.

7.But what if the left side is not sorted? We then need to check the right side and check if my element is present on the right side using arr[mid] and arr[high].

8.So the main thing to do is keep checking which part of the array is sorted, whether left is sorted or right is sorted and then check if the element is present on that side, if not then move to the opposite side and make it as the new subarray.
