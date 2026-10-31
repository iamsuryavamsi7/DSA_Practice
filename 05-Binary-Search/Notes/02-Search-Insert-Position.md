# Search Insert Position

## Overview

Given a sorted array and a target value, find the index where the target exists.

If the target does not exist, return the index where it should be inserted so that the array remains sorted.

---

## Examples

```text
Array:  [1, 3, 5, 6]
Target: 5

Answer: 2
```

Target exists at index `2`.

---

```text
Array:  [1, 3, 5, 6]
Target: 2

Answer: 1
```

Because:

```text
[1, 2, 3, 5, 6]
    ↑
  index 1
```

---

```text
Array:  [1, 3, 5, 6]
Target: 7

Answer: 4
```

Because `7` belongs after all existing elements.

---

```text
Array:  [1, 3, 5, 6]
Target: 0

Answer: 0
```

Because `0` belongs before all existing elements.

---

# Core Idea

Search Insert Position is based on Basic Binary Search.

The main difference is:

```text
Basic Binary Search
→ Find the target.

Search Insert Position
→ Find the target OR determine where it belongs.
```

---

# Binary Search Boundaries

Initialize:

```text
left = 0
right = array.length - 1
```

Calculate:

```text
mid = (left + right) / 2
```

Compare:

```text
target
```

with:

```text
array[mid]
```

---

# Decision Rules

## Target is greater than middle value

If:

```text
array[mid] < target
```

the target must be to the right.

Therefore:

```text
left = mid + 1
```

---

## Target is smaller than middle value

If:

```text
array[mid] > target
```

the target must be to the left.

Therefore:

```text
right = mid - 1
```

---

## Target Found

If:

```text
array[mid] == target
```

return:

```text
mid
```

---

# Important Insight

The most important part of this problem is what happens when the target does not exist.

Eventually:

```text
left > right
```

The search space is empty.

At this point:

```text
left
```

represents the correct insertion position.

Therefore:

```text
return left;
```

---

# Why Does `left` Become the Answer?

Consider:

```text
[1, 3, 5, 6]
```

Target:

```text
4
```

Eventually the search boundaries become:

```text
left = 2
right = 1
```

Therefore:

```text
left > right
```

The target belongs at:

```text
index 2
```

Result:

```text
[1, 3, 4, 5, 6]
       ↑
     index 2
```

Therefore:

```text
return left;
```

---

# Java Implementation

```java
public static int searchInsertPosition(int[] targetArr, int target) {

    int left = 0;
    int right = targetArr.length - 1;

    while (left <= right) {

        int mid = (left + right) / 2;
        int midVal = targetArr[mid];

        if (midVal < target) {
            left = mid + 1;
        } else if (midVal > target) {
            right = mid - 1;
        } else {
            return mid;
        }
    }

    return left;
}
```

---

# Complexity

## Time Complexity

Binary Search eliminates approximately half of the search space on every iteration.

```text
O(log n)
```

## Space Complexity

The iterative implementation uses only a few variables.

```text
O(1)
```

---

# Key Difference

### Basic Binary Search

```text
Target exists?
    ↓
Return index

Target doesn't exist?
    ↓
Not found
```

### Search Insert Position

```text
Target exists?
    ↓
Return index

Target doesn't exist?
    ↓
Return left
```

---

# Important Pattern

```text
Sorted Array
     ↓
Binary Search
     ↓
Target Found?
  ↙       ↘
YES       NO
 ↓         ↓
mid       left
 ↓         ↓
Answer    Insertion Position
```

---

# Common Mistakes

### Mistake 1

Using:

```text
left = mid
```

instead of:

```text
left = mid + 1
```

### Mistake 2

Using:

```text
right = mid
```

instead of:

```text
right = mid - 1
```

These can cause an infinite loop.

### Mistake 3

Returning `mid` after the loop.

When the target isn't found, `mid` is not necessarily the insertion position.

The correct boundary is:

```text
left
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

Problem 02 - Search Insert Position