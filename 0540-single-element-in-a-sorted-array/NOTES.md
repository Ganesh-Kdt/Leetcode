<p>1.In Binary Search we will always find our required element at the middle.</p>
<p>2.In this question the middle element will be an unique element if the element is not equal to it's previous element or it's next element.</p>
<p>3.But if this condition does not satisfy then we have to keep moving to either left or right side of the array.</p>
<p>4.A critical observation is that the single element in the array will always follow a pattern i.e.     <p>4.1.The index sequence of the duplicate numbers in the left half of the single element is always (even, odd).</p>
<p>4.2.The index sequence of the duplicate numbers in the right half of the single element is always (odd, even).</p>
<p>5.If we are in the left half of the single element, we have to eliminate this left half (i.e. low = mid+1). Because our single element appears somewhere on the right side.</p>
<p>6.If we are in the right half of the single element, we have to eliminate this right half (i.e. high = mid-1). Because our single element appears somewhere on the left side.</p>
