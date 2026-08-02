# Selection Sort

## What is Selection Sort?

Selection Sort is a comparison-based sorting algorithm.

Instead of repeatedly swapping adjacent elements, it repeatedly finds the smallest element from the unsorted portion of the array and places it at its correct position.

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

# Intuition

Imagine arranging playing cards.

You first look at all remaining cards.

Pick the smallest one.

Place it in the first position.

Repeat the same process for the remaining unsorted cards.

---

# Key Observation

Unlike Bubble Sort,

Selection Sort performs only one swap per pass.

It first finds the minimum element and then swaps it with the first unsorted element.

---

# Pattern

- Find Minimum
- Swap Once
- Grow Sorted Portion

---

# Time Complexity

Best

```text
O(n²)
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

# Space Complexity

```text
O(1)
```

---

# Stable?

❌ No

---

# In-Place?

✅ Yes

---

# Key Learning

Selection Sort minimizes the number of swaps but still performs the same number of comparisons regardless of whether the array is already sorted.