# Maximum Subarray Sum (Kadane's Algorithm)

## Problem Statement

Given an integer array `nums`, find the contiguous subarray (containing at least one element) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

You must return only the maximum possible sum.

---

## Examples

### Example 1

Input

```text
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

Output

```text
6
```

Explanation

```text
Subarray = [4,-1,2,1]

Sum = 4 + (-1) + 2 + 1 = 6
```

---

### Example 2

Input

```text
nums = [1]
```

Output

```text
1
```

---

### Example 3

Input

```text
nums = [5,4,-1,7,8]
```

Output

```text
23
```

Explanation

```text
Subarray = [5,4,-1,7,8]

Sum = 23
```

---

## Constraints

```text
1 <= nums.length <= 10^5

-10^4 <= nums[i] <= 10^4
```

---

## Expected Approaches

- Brute Force
- Better Approach
- Kadane's Algorithm (Optimal)