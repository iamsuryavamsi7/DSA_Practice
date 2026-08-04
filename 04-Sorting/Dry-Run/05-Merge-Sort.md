# Dry Run - Merge Sort

## Input

```text
[7, 3, 8, 2, 6, 4, 5]
```

---

# Step 1 — Divide

```text
7 3 8 2 6 4 5

↓

7 3 8 2 | 6 4 5
```

---

```text
7 3 | 8 2 | 6 4 | 5
```

---

```text
7 | 3 | 8 | 2 | 6 | 4 | 5
```

Every subarray now contains one element.

Each is already sorted.

---

# Step 2 — Merge

```text
7 + 3

↓

3 7
```

---

```text
8 + 2

↓

2 8
```

---

```text
6 + 4

↓

4 6
```

---

```text
5

↓

5
```

---

# Step 3 — Merge Again

```text
3 7

+

2 8

↓

2 3 7 8
```

---

```text
4 6

+

5

↓

4 5 6
```

---

# Final Merge

```text
2 3 7 8

+

4 5 6

↓

2 3 4 5 6 7 8
```

---

# Key Observation

Merge Sort first divides the array completely.

Sorting actually happens during the merge phase.

The merge step combines two already sorted arrays into one sorted array.