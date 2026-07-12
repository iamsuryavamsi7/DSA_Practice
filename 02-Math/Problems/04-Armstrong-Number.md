# Problem 04 - Armstrong Number

## Problem Statement

Given an integer `n`, determine whether it is an Armstrong Number.

An Armstrong Number is a number that is equal to the sum of its digits, where each digit is raised to the power of the total number of digits.

---

# Examples

## Example 1

Input

```text
153
```

Output

```text
true
```

Explanation

```text
Digits = 3

1³ + 5³ + 3³

=

1 + 125 + 27

=

153
```

---

## Example 2

Input

```text
9474
```

Output

```text
true
```

Explanation

```text
Digits = 4

9⁴ + 4⁴ + 7⁴ + 4⁴

=

6561 + 256 + 2401 + 256

=

9474
```

---

## Example 3

Input

```text
123
```

Output

```text
false
```

Explanation

```text
Digits = 3

1³ + 2³ + 3³

=

1 + 8 + 27

=

36

≠ 123
```

---

# Constraints

- Input will be a non-negative integer.
- Assume the number fits within Java's integer range.

---

# Expected Output

Return:

- `true` if the number is an Armstrong Number.
- `false` otherwise.

---

# Learning Workflow

1. Understand the Problem
2. Think Yourself
3. Brute Force Solution
4. Time Complexity
5. Space Complexity
6. Dry Run
7. Java Implementation
8. Edge Cases