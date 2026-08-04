# Insertion Sort

## What is Insertion Sort?

Insertion Sort is a comparison-based sorting algorithm that builds the sorted portion of an array one element at a time.

Instead of finding the smallest element or repeatedly swapping adjacent elements, it picks one element (called the key) and inserts it into its correct position within the already sorted portion of the array.

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

Imagine you are sorting playing cards in your hand.

Initially, you have one card.

A single card is already sorted.

Now pick the next card.

Insert it into the correct position among the cards already in your hand.

Repeat the same process until every card has been inserted.

Insertion Sort follows exactly this idea.

---

# Working Principle

Initially,

```text
[5] | [3 8 4 2]
```

The left side is already sorted.

Take the next element.

```text
3
```

Insert it before 5.

```text
[3 5] | [8 4 2]
```

Next,

Insert 8.

```text
[3 5 8] | [4 2]
```

Insert 4.

```text
[3 4 5 8] | [2]
```

Insert 2.

```text
[2 3 4 5 8]
```

---

# Key Observation

After every pass,

the sorted portion grows from the beginning of the array.

Unlike Selection Sort,

Insertion Sort shifts elements instead of directly swapping them.

---

# Algorithm

1. Assume the first element is already sorted.
2. Pick the next element (Key).
3. Compare it with elements in the sorted portion.
4. Shift larger elements one position to the right.
5. Insert the key into its correct position.
6. Repeat until the array is completely sorted.

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

---

# Stable?

✅ Yes

---

# In-Place?

✅ Yes

---

# Advantages

- Very efficient for small datasets.
- Excellent when the array is already nearly sorted.
- Stable sorting algorithm.
- Easy to implement.

---

# Disadvantages

- Slow for large datasets.
- Worst-case complexity is O(n²).

---

# Interview Pattern

Insertion Sort teaches:

- Growing a sorted prefix.
- Element shifting.
- Insertion into a sorted region.

---

# Key Learning

Insertion Sort does not search for the smallest element.

It repeatedly inserts the next element into its correct position inside the already sorted portion of the array.