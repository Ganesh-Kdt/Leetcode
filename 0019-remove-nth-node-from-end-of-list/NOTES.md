1.There are 2 ways to solve this problem.
2.The main thing to remember here is that the way to delete a node is by reaching to the previous node of the target node that is to be deleted. And then make previous.next=deleteNode.next.next. This will automatically remove the target node from the list.
3.The formula to reach to the previous node is length-n+1;
4.So in brute force approach I will first find length of the linkedlist.
5.Then I will use the formula and reach to the l-n+1 index.
6.And perform previous.next=previous.next.next.
7.Another way to perform this operation is using fast and slow pointer. Move fast pointer to n distance away from slow pointer.
8.Now move both fast and slow untill fast reaches to the last node.
9.Now slow must have reached to the previous index node.
10.Now we will perform the same operation again of previous.next=previous.next.next.