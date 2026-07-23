# Maximum Subarray Sum (Kadane's Algorithm)

## What is a Subarray?

A subarray is a continuous part of an array.

Example

```text
Array

[2,3,4,5]
```

Possible subarrays

```text
[2]

[3]

[2,3]

[3,4]

[2,3,4]

[3,4,5]

[2,3,4,5]
```

Not valid

```text
[2,4]

[3,5]
```

because they are not contiguous.

---

## Goal

Find the contiguous subarray whose sum is maximum.

---

## Learning Objectives

After completing this problem you should understand

- Subarray concept
- Brute Force approach
- Better approach
- Kadane's Algorithm
- Running Sum
- Greedy thinking

---

## Interview Importance

Difficulty

Medium

Frequently Asked In

- Amazon
- Microsoft
- Google
- Adobe
- Walmart
- Flipkart
- Oracle

---

## Time Complexity

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n³) |
| Better | O(n²) |
| Kadane | O(n) |

---

## Key Learning

Kadane's Algorithm teaches how to maintain the best answer while traversing an array only once.