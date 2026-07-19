# Dry Run - Linear Search

## Example

Input

```text
Array  = [5, 8, 2, 9, 4]
Target = 9
```

---

## Initial State

```text
Index : 0 1 2 3 4

Value : 5 8 2 9 4
```

---

## Iteration 1

```
i = 0

5 == 9 ?

No
```

---

## Iteration 2

```
i = 1

8 == 9 ?

No
```

---

## Iteration 3

```
i = 2

2 == 9 ?

No
```

---

## Iteration 4

```
i = 3

9 == 9 ?

Yes

Return 3
```

---

## Dry Run Table

| Iteration | Index | Value | Found? |
|-----------|------:|------:|--------|
| 1 | 0 | 5 | No |
| 2 | 1 | 8 | No |
| 3 | 2 | 2 | No |
| 4 | 3 | 9 | Yes |

---

## Output

```text
3
```

---

## Worst Case

Input

```text
Array = [5,8,2,9,4]

Target = 7
```

The loop checks every element.

Since the target is not found,

```
Return -1
```

---

## Time Complexity

```
O(n)
```

---

## Space Complexity

```
O(1)
```

---

## Key Observation

- Linear Search checks one element at a time.
- It stops immediately once the target is found.
- In the worst case, every element is visited.