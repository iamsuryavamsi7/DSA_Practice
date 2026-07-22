# Dry Run - Find the Number That Appears Once

## Example

Input

```text
[4,1,2,1,2]
```

---

# Better Approach (HashMap)

## Step 1

Store frequencies.

| Number | Frequency |
|--------:|----------:|
| 4 | 1 |
| 1 | 2 |
| 2 | 2 |

---

## Step 2

Traverse the HashMap.

```
4 -> 1 ✅
```

Answer

```text
4
```

---

# Optimal Approach (XOR)

Initial value

```
result = 0
```

---

### Iteration 1

```
result = 0 ^ 4

= 4
```

---

### Iteration 2

```
result = 4 ^ 1

= 5
```

---

### Iteration 3

```
result = 5 ^ 2

= 7
```

---

### Iteration 4

```
result = 7 ^ 1

= 6
```

---

### Iteration 5

```
result = 6 ^ 2

= 4
```

---

Final Answer

```text
4
```

---

## Why XOR Works

```
4 ^ 1 ^ 2 ^ 1 ^ 2

↓

4 ^ (1 ^ 1) ^ (2 ^ 2)

↓

4 ^ 0 ^ 0

↓

4
```

Every duplicate pair becomes zero.

Only the unique element remains.

---

## Time Complexity

HashMap

```
O(n)
```

XOR

```
O(n)
```

---

## Space Complexity

HashMap

```
O(n)
```

XOR

```
O(1)
```

---

## Key Observation

Whenever every element appears twice except one,

think about XOR before using extra space.