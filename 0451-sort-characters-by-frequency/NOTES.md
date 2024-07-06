1.Create a character array which will keep the count of every character in the string. The index will work as a character.
2.After this we will have an array with the frequency of each character against the index of the array which represents a character. We want to sort the characters according to the frequency of each characters. But we cannot do so using the character array.
3.So we will create a treemap which will have frequency of the characters as the key and ArrayList of characters as it's value.
4.Now we just create a new string and append characters from the treemap which reprsents values in the form of ArrayList<Character> to the string.
5.Now we reverse the string and return it.