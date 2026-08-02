# Bubble Sort

## What is Bubble Sort?

Bubble Sort is one of the simplest comparison-based sorting algorithms.

It repeatedly compares two adjacent elements and swaps them if they are in the wrong order.

After every pass, the largest unsorted element automatically moves (or "bubbles") to the end of the array.

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

Instead of finding the smallest element immediately, Bubble Sort focuses only on two adjacent elements.

If

```text
Left > Right
```

Swap them.

Otherwise,

Move to the next pair.

By continuously swapping adjacent elements, the largest element naturally reaches the last position after one complete pass.

---

# Working Principle

Suppose the array is

```text
5 3 8 4 2
```

### Pass 1

Largest element moves to the end.

```text
3 5 4 2 8
```

---

### Pass 2

Second largest element reaches its correct position.

```text
3 4 2 5 8
```

---

### Pass 3

Third largest element reaches its correct position.

```text
3 2 4 5 8
```

---

### Pass 4

Remaining elements are sorted.

```text
2 3 4 5 8
```

---

# Key Observation

After every pass,

one more element reaches its final sorted position.

The sorted portion always grows from the end of the array.

```text
Pass 1

_ _ _ _ 8

↓

Pass 2

_ _ _ 5 8

↓

Pass 3

_ _ 4 5 8

↓

Pass 4

2 3 4 5 8
```

---

# Optimization

Suppose the input is already sorted.

```text
1 2 3 4 5
```

If an entire pass completes without performing a single swap,

the array is already sorted.

We can terminate the algorithm immediately.

This optimization improves the Best Case Time Complexity from O(n²) to O(n).

---

# Algorithm

1. Traverse the array.
2. Compare adjacent elements.
3. Swap if the left element is greater than the right element.
4. Continue until the end of the unsorted portion.
5. Reduce the unsorted portion by one.
6. Stop early if no swaps occur during a pass.

---

# Time Complexity

## Best Case

```text
O(n)
```

(Array already sorted)

---

## Average Case

```text
O(n²)
```

---

## Worst Case

```text
O(n²)
```

(Array sorted in reverse order)

---

# Space Complexity

```text
O(1)
```

Bubble Sort is an in-place sorting algorithm.

---

# Stable?

✅ Yes

Equal elements maintain their original relative order.

---

# In-Place?

✅ Yes

No additional array is required.

---

# Advantages

- Very easy to understand.
- Easy to implement.
- Good for learning sorting concepts.
- Can terminate early if the array is already sorted.

---

# Disadvantages

- Extremely slow for large datasets.
- Performs unnecessary comparisons.
- Rarely used in production systems.

---

# Interview Pattern

Bubble Sort teaches:

- Adjacent Comparisons
- Swapping
- Multiple Passes
- Optimization using a Swap Flag

---

# Key Learning

Bubble Sort does not search for the smallest element.

Instead, it repeatedly swaps adjacent elements, allowing the largest unsorted element to move to its correct position after each pass.