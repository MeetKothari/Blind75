I used Kadane's Algo to solve this problem!

This algorithm uses optimal substructures (the maximum subarray ending at each position is calculated in a simple way from a related but smaller and overlapping subproblem: the maximum subarray ending at the previous position) this algorithm can be viewed as a simple example of dynamic programming.

Kadane’s algorithm is able to find the maximum sum of a contiguous subarray in an array with a runtime of O(n).
