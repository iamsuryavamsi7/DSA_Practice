# Lesson 06 - Print All Divisors

## Objective

Learn how to find all divisors of a number using a brute-force approach and later optimize it.

---

# Concepts Covered

- Modulus Operator (`%`)
- for Loop
- Divisibility
- Brute Force Thinking
- Time Complexity
- Space Complexity
- Mathematical Observation
- Algorithm Optimization

---

# What is a Divisor?

A divisor is a number that divides another number completely without leaving any remainder.

Example

```text
12

Divisors

1 2 3 4 6 12
```

Verification

```text
12 % 1 = 0

12 % 2 = 0

12 % 3 = 0

12 % 4 = 0

12 % 6 = 0

12 % 12 = 0
```

---

# Brute Force Algorithm

```text
Loop from 1 to target

↓

Check

target % currentNumber == 0

↓

If true

Print currentNumber

↓

Continue until target
```

---

# Complexity Analysis (Brute Force)

## Time Complexity

Every number from 1 to n is checked.

```text
Time Complexity = O(n)
```

---

## Space Complexity

Only constant variables are used.

```text
Space Complexity = O(1)
```

---

# Key Learning

The first solution is not always the best solution.

The goal is:

1. Solve the problem correctly.
2. Analyze its complexity.
3. Improve it.

---

# Interview Tip

In interviews, always explain the brute-force solution first.

Only after that, discuss optimization.