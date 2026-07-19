# 📚 Lesson 05 - Largest Element in an Array

---

# Problem Statement

Given an integer array, find the largest element present in the array.

Example

Input

```
[10, 5, 25, 8, 15]
```

Output

```
25
```

---

# Real-Life Example

Imagine a teacher wants to find the highest mark among students.

```
Rahul : 78
Surya : 95
Ravi  : 84
John  : 67
Anil  : 89
```

Instead of sorting all marks, the teacher simply keeps track of the highest mark seen so far.

This is exactly how the optimal solution works.

---

# Approach 1 - Brute Force (Sorting)

## Algorithm

1. Sort the array.
2. Return the last element.

Example

Before

```
10 5 25 8 15
```

After Sorting

```
5 8 10 15 25
```

Largest

```
25
```

### Time Complexity

```
O(n log n)
```

### Space Complexity

Depends on the sorting implementation.

---

# Why is Sorting Not the Best Choice?

Sorting rearranges every element in the array even though we only need one value.

It performs unnecessary work.

---

# Approach 2 - Optimal (Single Traversal)

Maintain one variable named `largest`.

Initialize it with the first element.

Visit every remaining element.

Whenever a larger value is found, update `largest`.

---

## Algorithm

```
largest = arr[0]

For every remaining element

    if current element > largest

        largest = current element

Return largest
```

---

# Why Start from Index 1?

The first element has already been stored in `largest`.

Starting from index `0` would compare the element with itself.

---

# Complexity Analysis

| Approach | Time | Space |
|----------|------|-------|
| Sorting | O(n log n) | Depends on sorting |
| Single Traversal | O(n) | O(1) |

---

# Edge Cases

## Single Element

```
[8]
```

Answer

```
8
```

---

## Descending Order

```
50 40 30 20 10
```

Answer

```
50
```

---

## All Equal

```
7 7 7 7
```

Answer

```
7
```

---

## Negative Numbers

```
-5 -10 -2 -8
```

Answer

```
-2
```

---

# Common Mistakes

## Incorrect Initialization

```java
int largest = 0;
```

Fails for arrays containing only negative numbers.

Correct

```java
int largest = arr[0];
```

---

## Unnecessary Sorting

Sorting increases the time complexity to **O(n log n)**.

A single traversal is sufficient.

---

# Key Takeaways

- Sorting is not required to find the largest element.
- Maintain the best answer seen so far.
- Initialize using the first element.
- Scan the array only once.
- This introduces the **Running Answer Pattern**, one of the most common DSA techniques.

---

# Interview Questions

1. Why is sorting not optimal?
2. Why do we initialize `largest` with `arr[0]`?
3. Why does the loop start from index `1`?
4. How does the solution handle negative numbers?
5. What are the time and space complexities?