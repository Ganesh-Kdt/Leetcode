1.We needed to check here it the array was first sorted and then rotated.

2.So if the array is sorted and then we try to rotate the array, the elements will keep their ascending order intact (Current element will be smaller than the next element in the rotated array).

3.Maximum one element will violate this rule during rotation, and it is the largest element in the sorted array. eg. [1,2,3,4,5]. After rotation [5,1,2,3,4].

4.It might also happen that no element will violate this rule. eg. - [1,1,1] After rotation also it will be [1,1,1].

5.Thus we should run a loop and check whether the current element is larger than the next element in the whole array and if we get more than 1 such violation then it means that the array is not sorted and therefore not correctly rotated.
