    # Leaders in an Array

## Problem Statement

Given an array of integers, return all leader elements.

An element is called a leader if it is greater than every element to its right.

The rightmost element is always a leader.

---

## Example

Input

```text
[10, 22, 12, 3, 0, 6]
```

Output

```text
[22, 12, 6]
```

---

## Brute Force

For every element,

check every element on its right.

Time Complexity

```text
O(n²)
```

Space Complexity

```text
O(1)
```

---

## Optimal

Traverse from right to left.

Maintain

```text
maxRight
```

Whenever

```text
current > maxRight
```

it is a leader.

Update

```text
maxRight = current
```

---

## Time Complexity

```text
O(n)
```

---

## Space Complexity

```text
O(1)
```

---

## Pattern

- Reverse Traversal
- Running Maximum