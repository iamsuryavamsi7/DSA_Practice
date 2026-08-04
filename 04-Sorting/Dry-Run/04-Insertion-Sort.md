# Dry Run - Insertion Sort

## Input

```text
[5, 3, 8, 4, 2]
```

---

## Initial State

```text
[5] | [3 8 4 2]
```

Sorted Portion

```text
5
```

---

## Pass 1

Key = 3

Compare with 5.

Shift 5.

Insert 3.

```text
[3 5] | [8 4 2]
```

---

## Pass 2

Key = 8

Compare with 5.

No shifting required.

```text
[3 5 8] | [4 2]
```

---

## Pass 3

Key = 4

Compare with 8.

Shift 8.

Compare with 5.

Shift 5.

Compare with 3.

Insert after 3.

```text
[3 4 5 8] | [2]
```

---

## Pass 4

Key = 2

Shift 8.

Shift 5.

Shift 4.

Shift 3.

Insert at the beginning.

```text
[2 3 4 5 8]
```

---

## Final Output

```text
[2 3 4 5 8]
```

---

# Key Observation

Instead of repeatedly swapping elements,

Insertion Sort shifts larger elements to the right and inserts the current key into its correct position.

The sorted portion grows from left to right after every pass.