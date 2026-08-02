# Dry Run - Bubble Sort

## Input

```text
[5, 3, 8, 4, 2]
```

---

## Pass 1

Compare

```text
5 3
```

Swap

```text
3 5 8 4 2
```

---

Compare

```text
5 8
```

No Swap

```text
3 5 8 4 2
```

---

Compare

```text
8 4
```

Swap

```text
3 5 4 8 2
```

---

Compare

```text
8 2
```

Swap

```text
3 5 4 2 8
```

Largest element has reached its correct position.

---

## Pass 2

Compare

```text
3 5
```

No Swap

Compare

```text
5 4
```

Swap

```text
3 4 5 2 8
```

Compare

```text
5 2
```

Swap

```text
3 4 2 5 8
```

Second largest element is now in its correct position.

---

Continue until no swaps are required.

---

## Final Output

```text
[2, 3, 4, 5, 8]
```

---

# Key Observation

During every pass,

the largest unsorted element "bubbles" to the end of the array.

After the first pass:

- Largest element is fixed.

After the second pass:

- Second largest element is fixed.

This process continues until the array becomes sorted.