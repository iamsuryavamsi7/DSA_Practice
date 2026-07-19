# Lesson 05 - Armstrong Number

## Objective

Learn how to determine whether a number is an Armstrong Number by combining previously learned mathematical concepts.

---

# Concepts Covered

- Counting Digits
- Modulus Operator (`%`)
- Integer Division (`/`)
- Mathematical Powers
- while Loop
- Variables
- Dry Running
- Time Complexity
- Space Complexity

---

# What is an Armstrong Number?

An Armstrong Number is a number that is equal to the sum of each of its digits raised to the power of the total number of digits.

Formula

```text
Sum of (digit ^ totalDigits) == Original Number
```

---

# Example

```text
153

Digits = 3

1³ + 5³ + 3³

=

1 + 125 + 27

=

153

Therefore,

153 is an Armstrong Number.
```

---

# Algorithm

```text
Store the original number

↓

Count the total digits

↓

Initialize sum = 0

↓

While number > 0

↓

Extract last digit

↓

Raise digit to the power of total digits

↓

Add the result to sum

↓

Remove last digit

↓

Repeat

↓

Compare sum with original number

↓

Return true or false
```

---

# Complexity Analysis

## Time Complexity

The loop executes once for every digit.

```text
Time Complexity = O(log n)
```

---

## Space Complexity

Only constant variables are used.

```text
Space Complexity = O(1)
```

---

# Key Learning

This problem combines concepts from multiple previous lessons.

- Count Digits
- Extract Digits
- Mathematical Power
- Comparison with Original Number

Instead of learning a completely new algorithm, we reuse existing ones.

---

# Interview Tip

Many interview problems are solved by combining previously learned patterns.

Armstrong Number is a good example of combining:

- Count Digits
- Modulus
- Integer Division
- Mathematical Operations