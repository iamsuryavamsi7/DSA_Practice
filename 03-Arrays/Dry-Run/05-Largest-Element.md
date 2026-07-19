# 📝 Dry Run - Largest Element

---

## Input

```
[10, 5, 25, 8, 15]
```

---

## Initialization

```
largest = 10
```

---

## Step 1

Current Element

```
5
```

Comparison

```
5 > 10
```

Result

```
False
```

Largest

```
10
```

---

## Step 2

Current Element

```
25
```

Comparison

```
25 > 10
```

Result

```
True
```

Update

```
largest = 25
```

---

## Step 3

Current Element

```
8
```

Comparison

```
8 > 25
```

Result

```
False
```

Largest

```
25
```

---

## Step 4

Current Element

```
15
```

Comparison

```
15 > 25
```

Result

```
False
```

Largest

```
25
```

---

# Final Answer

```
25
```

---

# Dry Run Table

| Index | Element | Largest Before | Update | Largest After |
|------:|--------:|---------------:|:------:|--------------:|
| 0 | 10 | 10 | Initial | 10 |
| 1 | 5 | 10 | ❌ | 10 |
| 2 | 25 | 10 | ✅ | 25 |
| 3 | 8 | 25 | ❌ | 25 |
| 4 | 15 | 25 | ❌ | 25 |

---

# Complexity

Time

```
O(n)
```

Space

```
O(1)
```