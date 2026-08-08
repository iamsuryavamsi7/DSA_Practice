# Quick Sort

## Difficulty

Medium

---

# Problem Statement

Sort the given array using the Quick Sort algorithm.

---

# Example

Input

```
[7,3,8,2,6,4,5]
```

Output

```
[2,3,4,5,6,7,8]
```

---

# Brute Force

Use any comparison-based sorting algorithm.

Time Complexity:

O(n²)

---

# Optimal Approach

Use the Quick Sort algorithm.

Steps:

1. Select the last element as the pivot.
2. Partition the array.
3. Place the pivot in its correct position.
4. Recursively sort the left partition.
5. Recursively sort the right partition.

---

# Time Complexity

Best:

O(n log n)

Average:

O(n log n)

Worst:

O(n²)

---

# Space Complexity

Best / Average:

O(log n)

Worst:

O(n)

---

# Interview Pattern

- Divide & Conquer
- Partitioning
- Two Pointers
- Recursion

---

# Key Learning

Quick Sort places one pivot in its final position during every recursive call and recursively sorts the remaining partitions.