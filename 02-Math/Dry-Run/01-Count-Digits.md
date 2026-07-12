# Dry Run - Count Digits

## Problem

Count the total number of digits present in a given integer.

---

# Input

```text
12345
```

---

# Initial State

| Variable | Value |
|----------|------:|
| number | 12345 |
| count | 0 |

---

# Dry Run

## Iteration 1

### Before Execution

| Variable | Value |
|----------|------:|
| number | 12345 |
| count | 0 |

### Extract Last Digit

```java
lastDigit = number % 10;
```

```text
12345 % 10 = 5
```

### Remove Last Digit

```java
number = number / 10;
```

```text
12345 / 10 = 1234
```

### Increment Count

```java
count++;
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 1234 |
| count | 1 |

---

## Iteration 2

### Before Execution

| Variable | Value |
|----------|------:|
| number | 1234 |
| count | 1 |

### Extract Last Digit

```text
1234 % 10 = 4
```

### Remove Last Digit

```text
1234 / 10 = 123
```

### Increment Count

```text
count = 2
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 123 |
| count | 2 |

---

## Iteration 3

### Before Execution

| Variable | Value |
|----------|------:|
| number | 123 |
| count | 2 |

### Extract Last Digit

```text
123 % 10 = 3
```

### Remove Last Digit

```text
123 / 10 = 12
```

### Increment Count

```text
count = 3
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 12 |
| count | 3 |

---

## Iteration 4

### Before Execution

| Variable | Value |
|----------|------:|
| number | 12 |
| count | 3 |

### Extract Last Digit

```text
12 % 10 = 2
```

### Remove Last Digit

```text
12 / 10 = 1
```

### Increment Count

```text
count = 4
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 1 |
| count | 4 |

---

## Iteration 5

### Before Execution

| Variable | Value |
|----------|------:|
| number | 1 |
| count | 4 |

### Extract Last Digit

```text
1 % 10 = 1
```

### Remove Last Digit

```text
1 / 10 = 0
```

### Increment Count

```text
count = 5
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 0 |
| count | 5 |

---

# Loop Termination

The loop condition is:

```java
while (number > 0)
```

Current value:

```text
number = 0
```

Condition becomes:

```text
0 > 0

False
```

The loop terminates.

---

# Final Output

```text
Number of Digits = 5
```

---

# Complexity Analysis

## Time Complexity

The loop executes once for each digit in the number.

```text
12345

↓

1234

↓

123

↓

12

↓

1

↓

0
```

Number of iterations = Number of digits

```text
Time Complexity = O(log n)
```

---

## Space Complexity

Only two variables are used:

- number
- count

Their size does not increase with the input.

```text
Space Complexity = O(1)
```

---

# Edge Case

## Input

```text
0
```

Expected Output

```text
1
```

Reason:

The number `0` contains exactly one digit.

This case should be handled separately before entering the loop.

---

# Key Observation

Every iteration removes exactly one digit from the right side of the number using integer division.

```text
12345

↓

1234

↓

123

↓

12

↓

1

↓

0
```

Since one digit is removed in every iteration, the number of iterations is equal to the number of digits in the input number.

Therefore:

```text
Time Complexity = O(log n)
Space Complexity = O(1)
```