# Big O Simplification Rules

## Why Do We Simplify?

Big O is used to describe how an algorithm grows as the input size grows.

It does **not** represent the exact number of operations.

Instead, it focuses on the **growth rate**.

---

# Rule 1 - Ignore Constants

## Example

O(5)

↓

O(1)

---

O(3n)

↓

O(n)

---

O(100n)

↓

O(n)

### Why?

Constants never change as the input size grows.

Whether the algorithm performs:

3n

or

100n

both grow linearly.

---

# Rule 2 - Keep the Dominant Term

## Example

O(n² + n)

↓

O(n²)

---

O(n³ + n² + n)

↓

O(n³)

---

O(n² + log n)

↓

O(n²)

### Why?

As the input becomes very large, the highest growing term dominates all smaller terms.

---

# Rule 3 - Different Variables Stay Different

If the inputs are different, do not simplify them.

Example

O(n + m)

↓

O(n + m)

---

O(n × m)

↓

O(n × m)

### Why?

n and m represent different input sizes.

Neither dominates the other.

---

# Rule 4 - Consecutive Loops

```java
for (int i = 0; i < n; i++) {

}

for (int j = 0; j < n; j++) {

}
```

Operations

n + n

↓

2n

↓

O(n)

---

# Rule 5 - Nested Loops

```java
for (int i = 0; i < n; i++) {

    for (int j = 0; j < n; j++) {

    }

}
```

Operations

n × n

↓

n²

↓

O(n²)

---

# Rule 6 - Constant Space

Creating only a few variables does not increase memory with input size.

```java
int max = 0;
int min = 0;
```

Space Complexity

O(1)

---

# Rule 7 - Extra Memory

Creating additional arrays or collections increases Space Complexity.

```java
int[] temp = new int[n];
```

Space Complexity

O(n)

---

```java
ArrayList<Integer> list = new ArrayList<>();

for (int i = 0; i < n; i++) {
    list.add(i);
}
```

Space Complexity

O(n)

---

# Big O Simplification Examples

| Original | Simplified |
|----------|------------|
| O(10) | O(1) |
| O(5n) | O(n) |
| O(2n + 5) | O(n) |
| O(n + n) | O(n) |
| O(n² + n) | O(n²) |
| O(n³ + n² + n) | O(n³) |
| O(log n + n) | O(n) |
| O(n + m) | O(n + m) |
| O(n × m) | O(n × m) |

---

# Golden Rules

✅ Ignore constants.

✅ Ignore lower-order terms.

✅ Keep only the dominant term.

✅ Do not combine different variables.

✅ Consecutive loops → Add the work.

✅ Nested loops → Multiply the work.

---

# Interview Tips

When an interviewer asks for Time Complexity:

- Do not provide the exact operation count.
- Always provide the simplified Big O notation.

Example:

Exact Operations

2n + 5

Interview Answer

O(n)

---

# Key Learning

Big O measures the growth of an algorithm, not the exact number of operations.

Always simplify the complexity by removing constants and lower-order terms while preserving the dominant growth.