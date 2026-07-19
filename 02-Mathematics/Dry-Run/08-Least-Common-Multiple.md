# Dry Run - Least Common Multiple (LCM)

## Input

```text
a = 12

b = 18
```

---

# Initial State

| Variable | Value |
|----------|------:|
| a | 12 |
| b | 18 |
| current | 18 |

---

# Dry Run

| Current Number | Divisible by 12? | Divisible by 18? | LCM Found? |
|---------------:|:----------------:|:----------------:|:----------:|
| 18 | ❌ | ✅ | ❌ |
| 19 | ❌ | ❌ | ❌ |
| 20 | ❌ | ❌ | ❌ |
| ... | ... | ... | ... |
| 36 | ✅ | ✅ | ✅ |

---

# Final Output

```text
36
```

---

# Complexity Analysis

Time Complexity

Worst Case

```text
O(a × b)
```

Space Complexity

```text
O(1)
```

---

# Observation

The brute-force solution checks every number until it finds the first common multiple.

Although correct, it may perform many unnecessary checks.

In the next step, we'll optimize this using the relationship between GCD and LCM:

```text
LCM(a, b) = (a × b) / GCD(a, b)
```

This reduces the problem to a constant-time calculation after computing the GCD.