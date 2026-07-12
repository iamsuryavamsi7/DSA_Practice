# 03. Palindrome Number

## What is a Palindrome?

A palindrome is a number that remains the same when read from left to right and right to left.

Example:

```text
121
```

Reverse:

```text
121
```

Since both are equal, it is a palindrome.

---

Another example:

```text
12345
```

Reverse:

```text
54321
```

Since they are different, it is **not** a palindrome.

---

## Approach

We already know how to reverse a number.

Steps:

1. Store the original number.
2. Reverse the number.
3. Compare both numbers.
4. Return the result.

---

## Algorithm

```text
Store original number

Reverse the number

If original == reversed
    return true
Else
    return false
```

---

## Dry Example

Target

```text
12321
```

| Iteration | Target | Last Digit | Reverse |
|-----------|---------|------------|---------|
| 1 | 12321 | 1 | 1 |
| 2 | 1232 | 2 | 12 |
| 3 | 123 | 3 | 123 |
| 4 | 12 | 2 | 1232 |
| 5 | 1 | 1 | 12321 |

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

## Time Complexity

```text
O(d)
```

where `d` is the number of digits.

---

## Space Complexity

```text
O(1)
```

No extra memory is used.