# Insertion Sort

## Problem Statement

Given an unsorted array of integers, sort the array in ascending order using the Insertion Sort algorithm.

---

## Example

### Input

```text
[5, 3, 8, 4, 2]
```

### Output

```text
[2, 3, 4, 5, 8]
```

---

## Constraints

- Sort the array using Insertion Sort.
- Perform the sorting in-place.
- Do not use any built-in sorting methods.

---

# Expected Approach

Treat the first element as already sorted.

For every remaining element,

insert it into its correct position inside the sorted portion by shifting larger elements one position to the right.

---

## Time Complexity

Best

```text
O(n)
```

Average

```text
O(n²)
```

Worst

```text
O(n²)
```

---

## Space Complexity

```text
O(1)
```