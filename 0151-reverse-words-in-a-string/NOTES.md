1.Split the string into an array.
2.Keep appending strings in stringbuilder by running the array in reverse.(StringBuilder only appends non-empty values).
3.Convert the stringbuilder into string and trim the string for leading and trailing spaces.
​
OR
​
1.We can iterate the string from 0 to last index of the string.
2.Keep creating a temp string untill we find a space character.
3.Once space character is encountered, stop and concat this string to a reverseString variable.
4.Now make the temp string empty and again keep concating characters untill space is found.
5.Once space is encountered then concat the temp string to the reverseString.
6.One big thing to learn from this problem is **reverse concatenation.**
7.Normally we do s = s+temp;
8.but here we will do s=temp+s;
9.This means going forward we can iterate the loop from the front and concat or we can iterate from the back and **reverse concat**.