1.We are using 2 pointer algo.
2.Basically since the array is sorted we can just check if the current element is different from the future elements.
3.If they are different then increment counter and move the different element to i+1, and then increment j.
4.i will only increment when i and j are different, but j will always increment.
5.i is bascially used to place elements at index (i+1) and j is used for comparison.