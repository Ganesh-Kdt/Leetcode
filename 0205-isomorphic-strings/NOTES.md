1.Isomorphic strings - 2 strings where characters of one string is uniquely mapped to characters of another string.
2.eg. - "badc","baba" - Consider these 2 as our input strings.
3.We can map characters of both strings using hashmap. eg. - b->b,a->a,d->b,c->a
4.First we will create a hashmap where characters of first string will act as keys and characters of second string will act as values.
5.If the character from the first string is not present as key in the map we will add the character as key to the map. And we will add corresponding character at the same index from the second string as value in the map.
6.If the character from the first string is already present as key in the map we will check if the value for that key i.e. the character is same as the character in the second string. If it is not then it is not an isomorphic string and we will return false.
7.We will do the same process again but this time we will make the second string as the key and first string as the value. We will return false if the condition does not match.
8.And finally return true at the end of the logic. This specifies that the characters from the first string is uniquely mapped to the characters from the second string.