# Heap Sort

## Difficulty

Advanced

---

# Problem Statement

Given an integer array, sort the array in ascending order using the **Heap Sort** algorithm.

---

# Example

### Input

```text
[4, 10, 3, 5, 1]
```

### Output

```text
[1, 3, 4, 5, 10]
```

---

# Concepts Required

Before solving Heap Sort, understand:

- Complete Binary Tree
- Max Heap
- Min Heap
- Heap property
- Array representation of a Heap
- Parent and child indexes
- Heapify
- Build Heap

---

# Max Heap Property

For every node:

```text
Parent >= Children
```

Example:

```text
        10
       /  \
      5    3
     / \
    4   1
```

Array:

```text
[10, 5, 3, 4, 1]
```

---

# Approach

To perform Heap Sort:

1. Build a Max Heap.
2. The largest element will be at index `0`.
3. Swap the root with the last element of the Heap.
4. Reduce the Heap size.
5. Heapify the root.
6. Repeat until the array is sorted.

---

# Heapify

Heapify restores the Max Heap property for a specific node.

For index `i`:

```java
int left = 2 * i + 1;
int right = 2 * i + 2;
```

Find the largest among:

```text
Current Node
Left Child
Right Child
```

If a child is larger:

```text
Swap
↓
Continue Heapify
```

---

# Build Max Heap

Start from the last non-leaf node:

```java
targetArr.length / 2 - 1
```

Then move backwards to the root:

```java
for (int i = targetArr.length / 2 - 1; i >= 0; i--) {
    heapify(targetArr, targetArr.length, i);
}
```

---

# Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n log n) |
| Average | O(n log n) |
| Worst | O(n log n) |

---

# Space Complexity

Iterative implementation:

```text
O(1)
```

Recursive heapify:

```text
O(log n)
```

due to recursion stack.

---

# Key Learning

Heap Sort uses a Max Heap to repeatedly obtain the largest remaining element.

The Heap region decreases while the sorted region grows:

```text
[ Heap | Sorted ]
```

---

# Current Status

## 🟨 Pending

Heap Sort has not yet been fully implemented.

Completed learning:

- [x] Heap vs BST
- [x] Max Heap
- [x] Min Heap
- [x] Heap array representation
- [x] Parent/child formulas
- [x] Heapify concept
- [x] Build Max Heap concept

Remaining:

- [ ] Complete heapify implementation
- [ ] Build Max Heap implementation
- [ ] Heap extraction
- [ ] Complete Heap Sort implementation
- [ ] Full dry run
- [ ] Complexity verification