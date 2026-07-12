# Dry Run - Print All Divisors

## Problem

Print all divisors of a given number.

---

# Input

```text
12
```

---

# Initial State

| Variable | Value |
|----------|------:|
| target | 12 |

---

# Dry Run

| Current Number | 12 % Current Number | Divisor? | Output |
|---------------:|--------------------:|:--------:|:------:|
| 1 | 0 | ✅ | 1 |
| 2 | 0 | ✅ | 1 2 |
| 3 | 0 | ✅ | 1 2 3 |
| 4 | 0 | ✅ | 1 2 3 4 |
| 5 | 2 | ❌ | - |
| 6 | 0 | ✅ | 1 2 3 4 6 |
| 7 | 5 | ❌ | - |
| 8 | 4 | ❌ | - |
| 9 | 3 | ❌ | - |
| 10 | 2 | ❌ | - |
| 11 | 1 | ❌ | - |
| 12 | 0 | ✅ | 1 2 3 4 6 12 |

---

# Final Output

```text
1 2 3 4 6 12
```

---

# Complexity Analysis

## Time Complexity

The loop checks every number from `1` to `n`.

```text
1 → 2 → 3 → ... → n
```

```text
Time Complexity = O(n)
```

---

## Space Complexity

Only the loop variable is used.

```text
Space Complexity = O(1)
```

---

# Observation

The brute-force solution checks every number between `1` and `n`.

Although correct, many of these checks are unnecessary.

In the next step, we'll use a mathematical observation to optimize the algorithm from:

```text
O(n)

↓

O(√n)
```

This will be the first major optimization in our DSA journey.