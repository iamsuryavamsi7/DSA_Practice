# Find the Number That Appears Once

## Problem Statement

Given an integer array where every element appears exactly twice except for one element, find the element that appears only once.

---

## Example 1

Input

```text
[2,2,1]
```

Output

```text
1
```

---

## Example 2

Input

```text
[4,1,2,1,2]
```

Output

```text
4
```

---

## Example 3

Input

```text
[7]
```

Output

```text
7
```

---

## Constraints

- Every element appears exactly twice.
- Only one element appears once.
- Array size is at least 1.

---

# Brute Force Approach

For every element, count how many times it appears by traversing the entire array.

Return the element whose frequency is one.

### Time Complexity

```
O(n²)
```

### Space Complexity

```
O(1)
```

---

# Better Approach (HashMap)

Store the frequency of every element using a HashMap.

Traverse the map and return the key whose frequency is one.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(n)
```

---

# Optimal Approach (Bit Manipulation - XOR)

Use the XOR operator.

Properties of XOR:

```
a ^ a = 0

a ^ 0 = a
```

Since every element appears twice,

all duplicate values cancel each other.

Only the unique element remains.

Example

```text
4 ^ 1 ^ 2 ^ 1 ^ 2

= 4 ^ (1 ^ 1) ^ (2 ^ 2)

= 4 ^ 0 ^ 0

= 4
```

---

## Time Complexity

```
O(n)
```

---

## Space Complexity

```
O(1)
```

---

# Pattern

- Frequency Counting
- Hashing
- Bit Manipulation (XOR)

---

# Key Learning

- HashMap is useful when counting frequencies.
- XOR can eliminate duplicate values efficiently.
- XOR is one of the most important operators in Bit Manipulation.
- Always think whether duplicate elements can cancel each other.

---

# Similar Problems

- Single Number II
- Single Number III
- Missing Number
- Find Duplicate Number