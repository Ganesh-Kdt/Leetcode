1.Instead of changing the data of the linked list we can change the links of the linked list.
2.There are 3 steps to it.
3.In the 1st step we have to connect last node to the head to create a cycle.
4.In the 2nd step we have to iterate the cycle using the formula length of LL-k%length of LL to reach to a node.
5.In the 3rd step we make the next node of the step 4 node as new head, and make the step4 node point to null.