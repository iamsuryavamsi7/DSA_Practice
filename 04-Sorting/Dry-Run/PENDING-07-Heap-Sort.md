# Dry Run - Heap Sort

## Status

**Pending**

This dry run documents the concepts learned so far. The complete Heap Sort dry run will be completed after the Heap data structure is studied properly.

---

# Input

```text
[4, 10, 3, 5, 1]
```

---

# Step 1 - Represent the Array as a Binary Tree

```text
        4
       / \
     10   3
    / \
   5   1
```

Array:

```text
[4, 10, 3, 5, 1]
```

Indexes:

```text
  0   1  2  3  4
```

---

# Step 2 - Identify Children

For index `i`:

```text
Left Child  = 2 * i + 1
Right Child = 2 * i + 2
```

For index `0`:

```text
Left  = 1
Right = 2
```

Therefore:

```text
        4
       / \
     10   3
```

---

# Step 3 - Build Max Heap

Max Heap rule:

```text
Parent >= Children
```

Current root:

```text
4
```

Children:

```text
10
3
```

Largest value:

```text
10
```

Swap `4` and `10`.

Array becomes:

```text
[10, 4, 3, 5, 1]
```

---

# Step 4 - Continue Heapify

After the swap:

```text
        10
       /  \
      4    3
     / \
    5   1
```

The node `4` now has child `5`.

Since:

```text
5 > 4
```

swap them.

Array becomes:

```text
[10, 5, 3, 4, 1]
```

Now:

```text
        10
       /  \
      5    3
     / \
    4   1
```

This is a valid Max Heap.

---

# Step 5 - Heap Sort Extraction

The largest element is at the root:

```text
10
```

Swap it with the last element:

```text
[1, 5, 3, 4, 10]
```

The `10` is now in its final sorted position.

```text
[1, 5, 3, 4 | 10]
```

The remaining Heap is:

```text
[1, 5, 3, 4]
```

---

# Remaining Steps

The remaining Heap must be heapified and the process repeated.

Conceptually:

```text
Build Max Heap
      ↓
Move maximum to end
      ↓
Reduce Heap size
      ↓
Heapify
      ↓
Move next maximum
      ↓
Repeat
```

---

# Final Result

```text
[1, 3, 4, 5, 10]
```

---

# Important Learning

Heap Sort separates the array into two logical regions:

```text
[ Heap | Sorted Elements ]
```

The Heap region becomes smaller after every extraction.

The sorted region becomes larger.

---

# Status

This dry run is currently incomplete because the complete Heap Sort implementation has not yet been completed.