# 03. Palindrome Number

## Input

```text
12321
```

---

## Initial Values

| Variable | Value |
|----------|------:|
| target | 12321 |
| original | 12321 |
| reverse | 0 |

---

## Iteration 1

```text
lastDigit = 12321 % 10 = 1
reverse = 0 × 10 + 1 = 1
target = 12321 / 10 = 1232
```

| Target | Last Digit | Reverse |
|--------:|-----------:|--------:|
| 1232 | 1 | 1 |

---

## Iteration 2

```text
lastDigit = 1232 % 10 = 2
reverse = 1 × 10 + 2 = 12
target = 1232 / 10 = 123
```

| Target | Last Digit | Reverse |
|--------:|-----------:|--------:|
| 123 | 2 | 12 |

---

## Iteration 3

```text
lastDigit = 123 % 10 = 3
reverse = 12 × 10 + 3 = 123
target = 123 / 10 = 12
```

| Target | Last Digit | Reverse |
|--------:|-----------:|--------:|
| 12 | 3 | 123 |

---

## Iteration 4

```text
lastDigit = 12 % 10 = 2
reverse = 123 × 10 + 2 = 1232
target = 12 / 10 = 1
```

| Target | Last Digit | Reverse |
|--------:|-----------:|--------:|
| 1 | 2 | 1232 |

---

## Iteration 5

```text
lastDigit = 1 % 10 = 1
reverse = 1232 × 10 + 1 = 12321
target = 1 / 10 = 0
```

| Target | Last Digit | Reverse |
|--------:|-----------:|--------:|
| 0 | 1 | 12321 |

---

## Final Comparison

Original

```text
12321
```

Reversed

```text
12321
```

Result

```text
true
```

---

## Complexity

Time

```text
O(d)
```

Space

```text
O(1)
```