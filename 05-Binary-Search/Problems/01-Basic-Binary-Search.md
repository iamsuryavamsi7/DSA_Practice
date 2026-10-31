# Problem 01 - Basic Binary Search

## Difficulty

Easy

---

# Problem Statement

Given a **sorted array** of integers and a target value, find the index of the target using Binary Search.

If the target does not exist, indicate that it was not found.

---

# Example 1

### Input

```text
Array:
[2, 5, 8, 12, 16, 23, 38, 45, 50]

Target:
23
```

### Output

```text
5
```

---

# Example 2

### Input

```text
Array:
[2, 5, 8, 12, 16, 23, 38, 45, 50]

Target:
20
```

### Output

```text
Target Not Found
```

---

# Requirements

- The array is sorted in ascending order.
- Use Binary Search.
- Do not use Java's built-in search methods.
- The search should eliminate approximately half of the search space on every iteration.

---

# Core Variables

The algorithm uses:

```text
left
mid
right
```

Initial boundaries:

```text
left = 0
right = array.length - 1
```

---

# Decision Rules

If:

```text
array[mid] == target
```

the target is found.

If:

```text
array[mid] > target
```

search the left half.

If:

```text
array[mid] < target
```

search the right half.

---

# Important Boundary Rules

When the middle value is not the target, remove `mid` from the next search space.

Therefore:

```text
array[mid] > target
        ↓
right = mid - 1
```

and:

```text
array[mid] < target
        ↓
left = mid + 1
```

Using `right = mid` or `left = mid` can cause an infinite loop.

---

# Time Complexity

```text
O(log n)
```

---

# Space Complexity

For an iterative implementation:

```text
O(1)
```

---

# Status

## ✅ Completed

- [x] Understand sorted search space
- [x] Understand left boundary
- [x] Understand right boundary
- [x] Understand middle
- [x] Eliminate left half
- [x] Eliminate right half
- [x] Handle target found
- [x] Handle target not found
- [x] Understand O(log n)
- [x] Understand O(1) auxiliary space