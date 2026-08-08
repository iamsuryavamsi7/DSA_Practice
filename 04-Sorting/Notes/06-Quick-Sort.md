# Quick Sort

## Overview

Quick Sort is a **Divide and Conquer** sorting algorithm that sorts an array by selecting a **pivot** element and partitioning the array into two parts:

- Elements smaller than the pivot
- Elements greater than or equal to the pivot

After partitioning, the pivot reaches its correct sorted position. The same process is recursively applied to the left and right partitions.

Unlike Merge Sort, Quick Sort performs sorting **in-place** and does not require an additional temporary array.

---

# Algorithm

1. Choose a pivot element.
2. Partition the array around the pivot.
3. Place the pivot in its correct position.
4. Recursively sort the left partition.
5. Recursively sort the right partition.

---

# Partition (Lomuto Scheme)

Two pointers are used:

- **first** → Tracks the last position of elements smaller than the pivot.
- **second** → Traverses the current subarray.

Whenever a value smaller than the pivot is found:

- Increment `first`
- Swap `first` and `second`

After traversal:

- Swap the pivot with `first + 1`

The pivot is now at its final sorted position.

---

# Why Quick Sort Works

After partitioning:

```
Smaller Elements | Pivot | Larger Elements
```

The pivot never moves again.

Only the left and right partitions need to be sorted recursively.

---

# Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n log n) |
| Average | O(n log n) |
| Worst | O(n²) |

Worst case occurs when the pivot repeatedly becomes the smallest or largest element.

---

# Space Complexity

| Case | Complexity |
|------|------------|
| Best / Average | O(log n) |
| Worst | O(n) |

No extra array is used.

Only recursion consumes memory.

---

# Advantages

- Fast in practice
- In-place sorting
- Average O(n log n)
- Cache friendly

---

# Disadvantages

- Worst-case O(n²)
- Not Stable
- Performance depends on pivot selection

---

# Interview Pattern

- Divide & Conquer
- Partitioning
- Two Pointers
- Recursion

---

# Key Learning

Quick Sort does **not merge** sorted arrays.

Instead, it repeatedly places one pivot into its correct position and recursively sorts the remaining partitions.