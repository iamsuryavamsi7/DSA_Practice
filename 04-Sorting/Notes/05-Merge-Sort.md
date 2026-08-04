# Merge Sort

## What is Merge Sort?

Merge Sort is a Divide and Conquer sorting algorithm.

Instead of repeatedly swapping or selecting elements, Merge Sort repeatedly divides the array into smaller halves, sorts each half, and finally merges them back together in sorted order.

---

## Example

### Input

```text
[7, 3, 8, 2, 6, 4, 5]
```

### Output

```text
[2, 3, 4, 5, 6, 7, 8]
```

---

# Intuition

Imagine you have a stack of papers.

Instead of sorting all of them together,

you divide the stack into two smaller stacks.

Then divide those again.

Continue until every stack contains only one element.

Since a single element is already sorted,

begin merging the stacks while maintaining sorted order.

---

# Working Principle

```text
7 3 8 2 6 4 5

↓

Divide

7 3 8 2 | 6 4 5

↓

Divide Again

7 3 | 8 2 | 6 4 | 5

↓

Divide Again

7 | 3 | 8 | 2 | 6 | 4 | 5

↓

Merge

3 7

2 8

4 6

5

↓

Merge Again

2 3 7 8

4 5 6

↓

Final Merge

2 3 4 5 6 7 8
```

---

# Divide and Conquer

Merge Sort follows three steps.

1. Divide
2. Conquer
3. Merge

---

# Time Complexity

Best

```text
O(n log n)
```

Average

```text
O(n log n)
```

Worst

```text
O(n log n)
```

---

# Space Complexity

```text
O(n)
```

---

# Stable?

✅ Yes

---

# In-Place?

❌ No

Extra memory is required while merging.

---

# Advantages

- Guaranteed O(n log n)
- Stable sorting
- Excellent for Linked Lists
- Predictable performance

---

# Disadvantages

- Requires extra memory
- Slower than Quick Sort for arrays in practice

---

# Interview Pattern

Merge Sort introduces:

- Divide & Conquer
- Recursion
- Merging Two Sorted Arrays

---

# Key Learning

Merge Sort repeatedly divides the array until every subarray contains one element.

It then merges those sorted subarrays to produce the final sorted array.