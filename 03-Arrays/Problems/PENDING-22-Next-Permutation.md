# Next Permutation

## Problem Statement

A permutation is an arrangement of numbers in a particular order.

Given an array representing a permutation of numbers, rearrange it into the **next lexicographically greater permutation**.

If such a permutation does not exist, rearrange it into the **lowest possible order (ascending order)**.

The rearrangement must be performed **in-place** using constant extra memory.

---

## Example 1

### Input

```text
[1, 2, 3]
```

### Output

```text
[1, 3, 2]
```

---

## Example 2

### Input

```text
[3, 2, 1]
```

### Output

```text
[1, 2, 3]
```

---

## Example 3

### Input

```text
[1, 1, 5]
```

### Output

```text
[1, 5, 1]
```

---

## Constraints

- 1 ≤ n ≤ 100
- Rearrangement must be performed in-place.
- Use only constant extra space.

---

# Approaches

## Brute Force

- Generate every permutation.
- Sort all permutations.
- Find the current permutation.
- Return the next permutation.

### Time Complexity

```text
O(n! × n)
```

### Space Complexity

```text
O(n!)
```

---

## Optimal

- Traverse from the right.
- Find the break point.
- Find the next greater element.
- Swap.
- Reverse the remaining suffix.

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(1)
```