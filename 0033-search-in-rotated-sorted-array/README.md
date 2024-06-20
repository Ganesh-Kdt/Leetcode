<p>33. Search in Rotated Sorted Array</p>

<p>There is an integer array nums sorted in ascending order (with distinct values).</p>

<p>Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].</p>

<p>Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.</p>

<p>You must write an algorithm with O(log n) runtime complexity.</p>

 

<p>Example 1:</p>

<p>Input: nums = [4,5,6,7,0,1,2], target = 0</p>
<p>Output: 4</p>

<p>Example 2:</p>

<p>Input: nums = [4,5,6,7,0,1,2], target = 3</p>
<p>Output: -1</p>
<p>Example 3:</p>

<p>Input: nums = [1], target = 0</p>
<p>Output: -1</p>
 

<p>Constraints:</p>

<p>1 <= nums.length <= 5000</p>
<p>-104 <= nums[i] <= 104</p>
<p>All values of nums are unique.</p>
<p>nums is an ascending array that is possibly rotated.</p>
-104 <= target <= 104
