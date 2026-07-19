# Dry Run - Prime Number

## Input

```text
13
```

---

# Initial State

| Variable | Value |
|----------|------:|
| target | 13 |
| divisorCount | 0 |

---

# Dry Run

| Current Number | 13 % Current Number | Divisor? | Divisor Count |
|---------------:|--------------------:|:--------:|---------------:|
| 1 | 0 | ✅ | 1 |
| 2 | 1 | ❌ | 1 |
| 3 | 1 | ❌ | 1 |
| 4 | 1 | ❌ | 1 |
| 5 | 3 | ❌ | 1 |
| 6 | 1 | ❌ | 1 |
| 7 | 6 | ❌ | 1 |
| 8 | 5 | ❌ | 1 |
| 9 | 4 | ❌ | 1 |
| 10 | 3 | ❌ | 1 |
| 11 | 2 | ❌ | 1 |
| 12 | 1 | ❌ | 1 |
| 13 | 0 | ✅ | 2 |

---

# Final Comparison

```text
Divisor Count = 2

Prime Number ✅
```

---

# Complexity Analysis

Time Complexity

```text
O(n)
```

Space Complexity

```text
O(1)
```

---

# Observation

The brute-force solution checks every number from 1 to n.

In the next step, we'll optimize it using the same √n observation learned in the previous lesson.