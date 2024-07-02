1.Use counter.
2.Increment the counter if we encounter opening parantheses. "("
3.Decrement the counter if we encounter closing parantheses. ")"
4.If we encounter opening parantheses check first if the counter is zero, if not then add the "(" parantheses to the stringbuilder and increment the counter. Else if the counter is zero do not add the "(" parantheses to the builder.
5.If we encounter closing parantheses decrement the counter and check if the counter is zero, if not then add the ")" parantheses to the stringbuilder, else do not add.
6.Originally this question can be solved easily using stack.