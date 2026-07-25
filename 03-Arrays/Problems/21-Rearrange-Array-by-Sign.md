# Rearrange Array by Sign

## Problem Statement

You are given an integer array consisting of an equal number of positive and negative integers.

Rearrange the array such that:

- Positive numbers appear at even indices.
- Negative numbers appear at odd indices.
- The relative order of positive numbers remains the same.
- The relative order of negative numbers remains the same.

Return the rearranged array.

---

## Example 1

Input

```text
[3, 1, -2, -5, 2, -4]
```

Output

```text
[3, -2, 1, -5, 2, -4]
```

---

## Example 2

Input

```text
[-1, 1]
```

Output

```text
[1, -1]
```

---

## Constraints

```text
2 <= n <= 2 * 10^5

n is even

Half of the elements are positive

Half of the elements are negative
```

---

## Expected Approaches

- Extra Array (Optimal)
- In-place Rearrangement (Advanced Variation)