# Dry Run - Maximum Consecutive Ones

## Example

Input

```text
[1,1,0,1,1,1]
```

---

## Initial State

```text
count = 0

maxConsecutive = 0
```

---

## Iteration 1

Current Element

```
1
```

Increase count.

```
count = 1

max = 1
```

---

## Iteration 2

Current Element

```
1
```

Increase count.

```
count = 2

max = 2
```

---

## Iteration 3

Current Element

```
0
```

Sequence breaks.

Reset count.

```
count = 0

max = 2
```

---

## Iteration 4

Current Element

```
1
```

Increase count.

```
count = 1

max = 2
```

---

## Iteration 5

Current Element

```
1
```

Increase count.

```
count = 2

max = 2
```

---

## Iteration 6

Current Element

```
1
```

Increase count.

```
count = 3

max = 3
```

---

## Final Answer

```text
3
```

---

## Dry Run Table

| Index | Value | Count | Maximum |
|------:|------:|------:|---------:|
| 0 | 1 | 1 | 1 |
| 1 | 1 | 2 | 2 |
| 2 | 0 | 0 | 2 |
| 3 | 1 | 1 | 2 |
| 4 | 1 | 2 | 2 |
| 5 | 1 | 3 | 3 |

---

## Time Complexity

```
O(n)
```

Every element is visited exactly once.

---

## Space Complexity

```
O(1)
```

Only two integer variables are used.

---

## Key Observation

- Traverse the array once.
- Increase the count when encountering `1`.
- Reset the count when encountering `0`.
- Keep updating the maximum consecutive count throughout the traversal.