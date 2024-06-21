Intuition -
1.We need to find the minimun in a sorted rotated array using binary search.
2.We can observe that in a sorted rotated array most of the array will be sorted, thus we can check if the left or right side of the array is sorted from the mid.
3.If the right is sorted we already have our minimum which is our **mid value**. We will store it in min variable. And move to the left side of the array. eg.-[4,5,1,2,3].
4.If the left side is sorted then the **low pointer** might be our minimum value so we can compare and store it in min value and move to the right side of the array. eg.-[4,5,6,7,0,1,2].
​