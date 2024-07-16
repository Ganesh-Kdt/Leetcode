There are 2 ways to solve this problem.

A.Brute force aproach -
1.We will find number of substrings with k distinct characters for each character and add the total count to find count of substrings.
2.This will take 2 for loops and thus the time complexity will be O(n**2).

B.Optimized Solution -
1.Similar to the brute force approach I will find the number of substrings for each character but it will be for atmost k distinct characters.
2.I will use sliding window along with 2 pointers and hashmap.
3.To find the total number of substrings with k distinct characters, the formula is # of substrings with atmost k characters - # of sbstrings with atmost k-1 character.
4.eg. - string = "aabc",k=2.
5.sliding window=[],i=0,j=0;
6.string=aabc, window=['a'],map={a->1}. Now for character a, we need to find # of substrings with atmost 2 characters which will be in this case only a. We can find this using i and j, so the # of substrings with atmost 2 characters will be j-i+1; so 0-0+1=1(a);
7.Now increment j and new window is window=['a','a']. Now the # of substrings with atmost 2 characters will be a,aa. So 1-0+1=2.
8.Now increment j and new window is window=['a','a','b']. Now the # of substrings with atmost 2 characters will be b,ab,aab. So 2-0+1=3.
9.Now increment j and new window is window=['a','a','b','c']. Now the # of substrings with atmost 2 characters will be c,bc. But according to our formula j-i+1, we will not get 2 instead we will get 3-0+1=4(c,bc,abc,aabc). Which is wrong.
10.So our i should be at 'b' which is at index 2. So we will need to handle this condition where if the distinct characters go above k then we will increment the value of i and we will do this using hashmap. So we will keep adding the elements at j index to the hashmap and we will keep checking the size of hashmap to check number of distinct characters. If the size of map goes above 2 then we will start removing elements from the map until the size goes back to less than 2.  
11.The condition will be while(map.size()>k){keep reducing characters from map and keep incrementing i}
12.The above condition should be kept before adding # of substrings with atmost 2 characters for each character in the total count variable.
13.Now we will run the same function for finding # of substrings with atmost 1(k-1) characters. And our answer will be # of substrings with atmost 2 characters - # of substrings with atmost 1 character.
13.So the final steps for this algorithm is -
13.1.add character to the hashmap along with it's frequency.
13.2.check if the size of the map goes above k, then reduce the map size and increment i. This step is very important for the formula (j-i+1).
13.3.Add # of substrings with atmost 2 characters for each character into the final count variable. 