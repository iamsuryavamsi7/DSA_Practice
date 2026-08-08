# Heap Sort

## Overview

Heap Sort is a comparison-based sorting algorithm that uses a **Heap data structure** to sort an array.

Heap Sort primarily uses a **Max Heap** when sorting an array in ascending order.

A Max Heap follows this property:

```text
Parent >= Children
```

The largest element is always present at the root of the heap.

---

# Heap Data Structure

A Heap is a special type of **Complete Binary Tree**.

It is NOT a Binary Search Tree.

A Binary Search Tree follows:

```text
Left < Root < Right
```

A Max Heap follows:

```text
Parent >= Children
```

A Min Heap follows:

```text
Parent <= Children
```

---

# Max Heap Example

```text
        10
       /  \
      8    7
     / \
    5   6
```

Array representation:

```text
[10, 8, 7, 5, 6]
```

The largest element is always at index `0`.

---

# Array Representation of Heap

For an element at index `i`:

### Left Child

```java
2 * i + 1
```

### Right Child

```java
2 * i + 2
```

### Parent

```java
(i - 1) / 2
```

These formulas allow a complete binary tree to be represented directly using an array.

---

# Heapify

Heapify is the process of restoring the Heap property for a particular node.

For a Max Heap:

1. Compare the current node with its left child.
2. Compare the current node with its right child.
3. Find the largest value.
4. If a child is larger than the current node, swap them.
5. Continue heapifying from the new position.

Example:

```text
        4
       / \
     10   3
    / \
   5   1
```

The root violates the Max Heap property.

After heapifying:

```text
        10
       /  \
      5    3
     / \
    4   1
```

---

# Build Max Heap

Before sorting, the array must be converted into a Max Heap.

Leaf nodes do not need heapification because they have no children.

Therefore, we start from the last non-leaf node:

```java
int lastNonLeaf = targetArr.length / 2 - 1;
```

Then heapify backwards:

```java
for (int i = targetArr.length / 2 - 1; i >= 0; i--) {
    heapify(targetArr, targetArr.length, i);
}
```

---

# Heap Sort Process

For ascending order:

1. Build a Max Heap.
2. The maximum element is at index `0`.
3. Swap the root with the last element in the heap.
4. Reduce the heap size.
5. Heapify the root.
6. Repeat until the heap contains one element.

Conceptually:

```text
Build Max Heap
      ↓
Maximum at root
      ↓
Move maximum to end
      ↓
Reduce heap size
      ↓
Heapify
      ↓
Repeat
```

---

# Example

Input:

```text
[4, 10, 3, 5, 1]
```

Build Max Heap:

```text
[10, 5, 3, 4, 1]
```

Move maximum:

```text
[1, 5, 3, 4, 10]
```

Heapify remaining elements:

```text
[5, 4, 3, 1, 10]
```

Move maximum:

```text
[1, 4, 3, 5, 10]
```

Continue until:

```text
[1, 3, 4, 5, 10]
```

---

# Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n log n) |
| Average | O(n log n) |
| Worst | O(n log n) |

Heap Sort has O(n log n) time complexity in all cases.

---

# Space Complexity

Heap Sort can be implemented in-place.

Auxiliary space:

```text
O(1)
```

If recursive heapify is used, the recursion stack can consume additional space proportional to the heap height:

```text
O(log n)
```

An iterative heapify implementation can achieve:

```text
O(1)
```

auxiliary space.

---

# Advantages

- Guaranteed O(n log n) time complexity.
- In-place sorting.
- Does not require an additional array.
- Useful when predictable worst-case performance is required.

---

# Disadvantages

- More difficult to understand than Bubble, Selection, and Insertion Sort.
- Usually not stable.
- Often less cache-friendly than Quick Sort.
- Requires understanding of the Heap data structure.

---

# Interview Patterns

- Heap
- Complete Binary Tree
- Heapify
- Priority Queue
- In-place Sorting

---

# Important Distinction

The Heap data structure is different from Java's JVM Heap Memory.

```text
Heap Data Structure
        ≠
JVM Heap Memory
```

Heap Sort uses the **Heap data structure**.

Java Heap Memory is a runtime memory area managed by the JVM.

---

# Current Learning Status

Heap Sort is currently **not completed**.

Topics understood:

- Heap vs Binary Search Tree
- Max Heap
- Min Heap
- Heap array representation
- Parent/child index formulas
- Heapify concept
- Build Max Heap concept

Remaining:

- Complete `heapify()` implementation
- Build Max Heap implementation
- Heap extraction process
- Complete Heap Sort implementation
- Full dry run