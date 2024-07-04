1.Take the first string in the array.
2.Traverse through every character of the first string and check if same character is present in remaining strings of the array at the exact same index.
3.Return a substring of the first string in the array with index 0 to an index where the condition breaks.
4.The condition should be -
4.1.The character index of the fist string becomes equal to or greater than the length of   another string in the array.
4.2.The character at a given index in the first string is not available at the the same index in other strings.