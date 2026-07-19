# Lesson 07 - Prime Number

## Objective

Learn how to determine whether a number is Prime by applying divisor concepts and mathematical optimization.

---

# Concepts Covered

- Divisors
- Prime Numbers
- Modulus Operator (%)
- Brute Force
- Optimization
- Square Root Technique
- Time Complexity
- Space Complexity

---

# What is a Prime Number?

A Prime Number has exactly two divisors.

- 1
- Itself

Examples

Prime

```text
2
3
5
7
11
13
17
19
```

Not Prime

```text
1
4
6
8
9
10
12
```

---

# Brute Force Algorithm

```text
Loop from 1 to n

↓

Count divisors

↓

If divisor count == 2

Prime

Else

Not Prime
```

---

# Complexity

Time Complexity

```text
O(n)
```

Space Complexity

```text
O(1)
```

---

# Key Learning

A Prime Number is simply a number with exactly two divisors.

This problem is directly related to the previous Divisors problem.

---

# Interview Tip

Always explain the brute-force solution first before discussing the optimized √n approach.