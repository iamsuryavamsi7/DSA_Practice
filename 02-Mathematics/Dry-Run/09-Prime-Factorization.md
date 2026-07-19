# Dry Run - Prime Factorization

## Input

```text
n = 60
```

---

# Initial State

| Variable | Value |
|----------|------:|
| n | 60 |
| factor | 2 |

---

# Dry Run

| Current Factor | Divides n? | Updated n | Prime Factors |
|---------------:|:----------:|----------:|--------------:|
| 2 | ✅ | 30 | 2 |
| 2 | ✅ | 15 | 2, 2 |
| 2 | ❌ | 15 | 2, 2 |
| 3 | ✅ | 5 | 2, 2, 3 |
| 4 | ❌ | 5 | 2, 2, 3 |
| 5 | ✅ | 1 | 2, 2, 3, 5 |

---

# Final Output

```text
2 2 3 5
```

---

# Complexity

Brute Force

```text
Time : O(n)
Space: O(k)
```

Optimized

```text
Time : O(√n)
Space: O(k)
```