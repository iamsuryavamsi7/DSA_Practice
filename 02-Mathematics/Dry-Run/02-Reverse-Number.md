# Dry Run - Reverse Number

## Problem

Reverse the digits of a given integer.

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
| reverse | 0 |

---

# Dry Run

## Iteration 1

### Before Execution

| Variable | Value |
|----------|------:|
| number | 12345 |
| reverse | 0 |

### Step 1 - Extract Last Digit

```java
lastDigit = number % 10;
```

```text
12345 % 10 = 5
```

### Step 2 - Build Reverse Number

```java
reverse = reverse * 10 + lastDigit;
```

```text
0 × 10 + 5 = 5
```

### Step 3 - Remove Last Digit

```java
number = number / 10;
```

```text
12345 / 10 = 1234
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 1234 |
| reverse | 5 |

---

## Iteration 2

### Before Execution

| Variable | Value |
|----------|------:|
| number | 1234 |
| reverse | 5 |

### Step 1 - Extract Last Digit

```text
1234 % 10 = 4
```

### Step 2 - Build Reverse Number

```text
5 × 10 + 4 = 54
```

### Step 3 - Remove Last Digit

```text
1234 / 10 = 123
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 123 |
| reverse | 54 |

---

## Iteration 3

### Before Execution

| Variable | Value |
|----------|------:|
| number | 123 |
| reverse | 54 |

### Step 1 - Extract Last Digit

```text
123 % 10 = 3
```

### Step 2 - Build Reverse Number

```text
54 × 10 + 3 = 543
```

### Step 3 - Remove Last Digit

```text
123 / 10 = 12
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 12 |
| reverse | 543 |

---

## Iteration 4

### Before Execution

| Variable | Value |
|----------|------:|
| number | 12 |
| reverse | 543 |

### Step 1 - Extract Last Digit

```text
12 % 10 = 2
```

### Step 2 - Build Reverse Number

```text
543 × 10 + 2 = 5432
```

### Step 3 - Remove Last Digit

```text
12 / 10 = 1
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 1 |
| reverse | 5432 |

---

## Iteration 5

### Before Execution

| Variable | Value |
|----------|------:|
| number | 1 |
| reverse | 5432 |

### Step 1 - Extract Last Digit

```text
1 % 10 = 1
```

### Step 2 - Build Reverse Number

```text
5432 × 10 + 1 = 54321
```

### Step 3 - Remove Last Digit

```text
1 / 10 = 0
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 0 |
| reverse | 54321 |

---

# Loop Termination

Loop condition:

```java
while (number > 0)
```

Current value:

```text
number = 0
```

Condition evaluation:

```text
0 > 0

False
```

The loop terminates.

---

# Final Output

```text
54321
```

---

# Complexity Analysis

## Time Complexity

The loop removes one digit during every iteration.

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

Only two variables are used throughout the algorithm:

- `number`
- `reverse`

The number of variables does not grow with the input size.

```text
Space Complexity = O(1)
```

---

# Key Observation

The core formula is:

```java
reverse = reverse * 10 + lastDigit;
```

### Why multiply by 10?

Multiplying by 10 shifts all existing digits one place to the left.

Example:

```text
Current reverse = 54

54 × 10 = 540

540 + 3 = 543
```

This creates space to append the newly extracted digit.

---

# Edge Cases

## Input

```text
0
```

Output

```text
0
```

Reason:

Reversing `0` still results in `0`.

---

## Input

```text
1000
```

Output

```text
1
```

Reason:

Leading zeros are not stored in integer values.
