# Basic Binary Search

## Overview

Binary Search is a searching algorithm used to find a target element in a **sorted search space**.

Instead of checking every element one by one like Linear Search, Binary Search repeatedly eliminates half of the remaining search space.

---

# Linear Search vs Binary Search

## Linear Search

Linear Search checks elements sequentially.

Example:

```text
[2, 5, 8, 12, 16, 23, 38]
```

Search for:

```text
23
```

We may check:

```text
2  → No
5  → No
8  → No
12 → No
16 → No
23 → Found
```

Time complexity:

```text
O(n)
```

---

# Binary Search

Binary Search uses the sorted order of the array.

Example:

```text
[2, 5, 8, 12, 16, 23, 38, 45, 50]
```

Search:

```text
23
```

Instead of checking from the beginning, we check the middle.

```text
[2, 5, 8, 12, 16, 23, 38, 45, 50]
                 ↑
                mid
```

Middle value:

```text
16
```

Since:

```text
23 > 16
```

we know the target cannot be in the left half.

Therefore, we discard:

```text
[2, 5, 8, 12, 16]
```

and continue with:

```text
[23, 38, 45, 50]
```

The search space is repeatedly reduced by approximately half.

---

# Core Variables

Binary Search uses three important variables:

```text
left
mid
right
```

Initially:

```text
left = 0
right = array.length - 1
```

The middle index is calculated from the current search space.

A safe calculation is:

```text
left + (right - left) / 2
```

---

# Basic Algorithm

```text
1. Set left to the first index.
2. Set right to the last index.
3. While left <= right:
      Find middle.
      Compare middle value with target.

      If middle == target:
          Target found.

      If middle > target:
          Search left half.

      If middle < target:
          Search right half.

4. If left > right:
      Target does not exist.
```

---

# Eliminating the Left Half

If:

```text
middle value > target
```

then the target, if present, must be before `mid`.

Therefore:

```text
right = mid - 1
```

The `mid` element itself is removed from the next search because we already know it is not the target.

---

# Eliminating the Right Half

If:

```text
middle value < target
```

then the target must be after `mid`.

Therefore:

```text
left = mid + 1
```

Again, `mid` itself is removed because it is not the target.

---

# Why `mid - 1` and `mid + 1`?

This is extremely important.

Incorrect:

```text
right = mid
left = mid
```

This can cause an infinite loop.

Example:

```text
left = 1
right = 2
```

Then:

```text
mid = 1
```

If we do:

```text
left = mid
```

we get:

```text
left = 1
right = 2
```

Nothing changed.

The next iteration produces the same values forever.

Correct:

```text
right = mid - 1
left = mid + 1
```

This guarantees that `mid` is removed from the next search space.

---

# Example

Array:

```text
[2, 5, 8, 12, 16, 23, 38, 45, 50]
```

Target:

```text
23
```

### Iteration 1

```text
left = 0
right = 8
mid = 4
```

Value:

```text
16
```

Since:

```text
23 > 16
```

search right:

```text
left = 5
```

---

### Iteration 2

```text
left = 5
right = 8
mid = 6
```

Value:

```text
38
```

Since:

```text
23 < 38
```

search left:

```text
right = 5
```

---

### Iteration 3

```text
left = 5
right = 5
mid = 5
```

Value:

```text
23
```

Target found.

Result:

```text
index = 5
```

---

# Missing Target

Suppose:

```text
Array:
[3, 7, 11, 15]

Target:
10
```

The algorithm keeps reducing the search space.

Eventually:

```text
left > right
```

At this point:

```text
Search space = empty
```

Therefore the target does not exist.

---

# Time Complexity

Each iteration eliminates approximately half of the search space.

Therefore:

```text
O(log n)
```

### Why?

If the array contains:

```text
n
```

elements:

```text
n
n/2
n/4
n/8
n/16
...
1
```

The number of times we can divide `n` by 2 until reaching 1 is:

```text
log₂(n)
```

Therefore:

```text
Time Complexity = O(log n)
```

---

# Space Complexity

The iterative implementation uses only:

```text
left
right
mid
```

No additional data structure is required.

Therefore:

```text
Space Complexity = O(1)
```

---

# Requirements

Basic Binary Search requires the search space to have an ordering that allows half of it to be eliminated safely.

For the standard array implementation:

```text
The array must be sorted.
```

Example:

```text
[2, 5, 8, 12, 16, 23, 38]
```

works.

An unsorted array such as:

```text
[8, 2, 23, 5, 16, 3]
```

cannot be searched using standard Binary Search.

---

# Important Mental Model

Do not think:

```text
"Binary Search checks the middle."
```

Think:

```text
"Binary Search eliminates half of the search space."
```

The middle element is simply the information that allows us to decide which half can be discarded.

---

# Common Mistakes

### Mistake 1

Using:

```text
right = mid
```

instead of:

```text
right = mid - 1
```

### Mistake 2

Using:

```text
left = mid
```

instead of:

```text
left = mid + 1
```

### Mistake 3

Using Binary Search on an unsorted array.

### Mistake 4

Incorrectly calculating the search boundaries.

---

# Key Pattern

```text
Sorted Search Space
        ↓
      Find Mid
        ↓
Compare Target and Mid
        ↓
 ┌──────┴──────┐
 ↓             ↓
Target < Mid  Target > Mid
 ↓             ↓
Move Right    Move Left
Boundary      Boundary
        ↓
     Repeat
```

---

# Complexity Summary

| Operation | Complexity |
|---|---:|
| Time | O(log n) |
| Space | O(1) |

---

# Status

## ✅ Completed

Problem 01 - Basic Binary Search