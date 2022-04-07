Problem
An array A consisting of n integers is given. A triplet (p, q, r) is “triangular” if 0 ≤ p < q < r < n and A[p] + A[q] > A[r], A[q] + A[r] > A[p], A[r] + A[p] > A[q].

For example, consider array A such that: A[0] = 10, A[1] = 2, A[2] = 5, A[3] = 1, A[4] = 8, A[5] = 20. Triplet (0, 2, 4) is triangular.

Write a function that, given an array A consisting of n integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

For example, given array A such that: A[0] = 10, A[1] = 2, A[2] = 5, A[3] = 1, A[4] = 8, A[5] = 20, the function should return 1, as explained above.
Given array A such that: A[0] = 10, A[1] = 50, A[2] = 5, A[3] = 1, the function should return 0.

Assume that:
• n is an integer within the range [0 … 100,000];
• each element of array A is an integer within the range [-2,147,483,648 … 2,147,483,647].

Complexity:
• expected worst-case time complexity is O(n · log(n));
• expected worst-case space complexity is O(n), beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.
