# 📚 Lesson 06 - Second Largest Element in an Array

---

# Problem Statement

Given an integer array, find the **second largest distinct element** in the array.

Example

Input

```
[10, 5, 25, 8, 15]
```

Output

```
15
```

---

# What Does "Second Largest Distinct" Mean?

The second largest element must be **different** from the largest element.

Example

```
[10, 20, 20, 30]
```

Largest

```
30
```

Second Largest

```
20
```

Notice that duplicate values are ignored.

---

# Example

Input

```
[5, 9, 2, 15, 7]
```

Largest

```
15
```

Second Largest

```
9
```

---

# Another Example

Input

```
[8, 8, 8, 8]
```

There is no second largest distinct element.

The program should return an appropriate value based on the problem requirement.

Examples include:

- -1
- Integer.MIN_VALUE
- Throwing an exception

---

# Brute Force Approach

## Idea

1. Sort the array.
2. Start from the second last element.
3. Move left until a different element is found.

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

Second Largest

```
15
```

---

# Drawback

Sorting requires more work than necessary.

Time Complexity

```
O(n log n)
```

---

# Optimal Approach

Instead of sorting,

maintain two values while traversing the array.

```
largest

secondLargest
```

Whenever a larger element is found,

both variables may need to be updated.

This introduces the concept of maintaining **multiple running answers**.

---

# Things to Think About

While designing the algorithm, ask yourself:

- What happens when a new largest element is found?
- What should happen to the old largest element?
- What if duplicate values are present?
- How should arrays with only one unique element be handled?

---

# Complexity Goal

Target

Time

```
O(n)
```

Space

```
O(1)
```

---

# Edge Cases

## Single Element

```
[5]
```

No second largest element exists.

---

## All Elements Equal

```
[8,8,8,8]
```

No second largest distinct element.

---

## Descending Order

```
50 40 30 20
```

Second Largest

```
40
```

---

## Ascending Order

```
10 20 30 40
```

Second Largest

```
30
```

---

## Negative Numbers

```
-10 -5 -20 -2
```

Largest

```
-2
```

Second Largest

```
-5
```

---

# Common Mistakes

- Forgetting to ignore duplicate values.
- Returning the largest element when it appears multiple times.
- Initializing variables incorrectly.
- Sorting when a single traversal is sufficient.

---

# Key Takeaways

- The second largest element must be distinct.
- Sorting solves the problem but is not optimal.
- The optimal solution requires only one traversal.
- This problem introduces the **Multiple Running Answers Pattern**.

---

# Interview Questions

1. Why is sorting not the optimal solution?
2. Why must duplicate values be ignored?
3. What happens when a new largest element is found?
4. What should be returned if no second largest element exists?
5. What are the time and space complexities of the optimal approach?