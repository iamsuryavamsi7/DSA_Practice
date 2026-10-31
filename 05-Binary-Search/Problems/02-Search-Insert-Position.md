# Problem 02 - Search Insert Position

## Difficulty

Easy

---

# Problem Statement

Given a sorted array of distinct integers and a target value, return the index if the target is found.

If the target is not found, return the index where it would be inserted in order.

You must use Binary Search.

---

# Example 1

### Input

```text
Array:  [1, 3, 5, 6]
Target: 5
```

### Output

```text
2
```

---

# Example 2

### Input

```text
Array:  [1, 3, 5, 6]
Target: 2
```

### Output

```text
1
```

---

# Example 3

### Input

```text
Array:  [1, 3, 5, 6]
Target: 7
```

### Output

```text
4
```

---

# Example 4

### Input

```text
Array:  [1, 3, 5, 6]
Target: 0
```

### Output

```text
0
```

---

# Requirements

- Array is sorted in ascending order.
- Use Binary Search.
- Return the target index if it exists.
- Otherwise return the correct insertion position.
- Do not use Java built-in search or sorting methods.

---

# Core Logic

```text
midVal < target
    ↓
left = mid + 1
```

```text
midVal > target
    ↓
right = mid - 1
```

```text
midVal == target
    ↓
return mid
```

If the loop finishes:

```text
left > right
```

return:

```text
left
```

---

# Key Insight

The final `left` boundary represents the position where the target belongs.

```text
Target Found
    ↓
return mid

Target Not Found
    ↓
left > right
    ↓
return left
```

---

# Time Complexity

```text
O(log n)
```

# Space Complexity

```text
O(1)
```

---

# Status

## ✅ Completed

- [x] Basic Binary Search reused
- [x] Handle target already present
- [x] Handle target not present
- [x] Find insertion position
- [x] Understand final `left` boundary
- [x] O(log n) time
- [x] O(1) space