# Maximum Consecutive Ones

## Problem Statement

Given a binary array containing only `0`s and `1`s, find the maximum number of consecutive `1`s present in the array.

---

## Example 1

Input

```text
[1,1,0,1,1,1]
```

Output

```text
3
```

---

## Example 2

Input

```text
[1,0,1,1,0,1]
```

Output

```text
2
```

---

## Example 3

Input

```text
[0,0,0,0]
```

Output

```text
0
```

---

## Example 4

Input

```text
[1,1,1,1]
```

Output

```text
4
```

---

## Constraints

- Array contains only `0` and `1`
- Array size can be `1` or greater

---

# Brute Force Approach

Generate every possible consecutive sequence of `1`s and calculate its length.

Compare all sequence lengths and return the maximum.

### Time Complexity

```
O(n²)
```

### Space Complexity

```
O(1)
```

---

# Optimal Approach

Traverse the array once.

- If the current element is `1`, increase the current count.
- Update the maximum consecutive count whenever needed.
- If the current element is `0`, reset the current count.

Since every element is visited only once, the algorithm runs in linear time.

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

- Array Traversal
- Counting

---

# Key Learning

- Consecutive sequence problems usually require maintaining a running count.
- Reset the count whenever the sequence breaks.
- Continuously update the maximum answer while traversing.
- This problem requires only a single traversal and constant extra space.

---

# Similar Problems

- Longest Continuous Increasing Subsequence
- Maximum Consecutive Ones II
- Maximum Consecutive Ones III
- Longest Subarray of Ones After Deleting One Element