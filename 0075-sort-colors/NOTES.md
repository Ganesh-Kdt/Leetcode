2 ways to solve this problem -
1.Dutch Flag Algo - 3 pointer.
a)Keep low and mid at the 0 index and high at the last index. low and high will be used to place the numbers 0 and 2. While mid will be used for comparison.
b)If mid==2 then swap the number with high and do high--.
c)If mid==0 then swap the number with low and do low++,mid++.
d)If mid==1 then do mid++.
2.Creating 3 variables for counting number of 0,1,2. Then add the 0,1,2 the same number of times in a new array.