# Dry Run - Armstrong Number

## Problem

Determine whether a given number is an Armstrong Number.

---

# Input

```text
153
```

---

# Initial State

| Variable | Value |
|----------|------:|
| original | 153 |
| number | 153 |
| totalDigits | 3 |
| sum | 0 |

---

# Dry Run

## Iteration 1

### Before Execution

| Variable | Value |
|----------|------:|
| number | 153 |
| sum | 0 |

### Step 1 - Extract Last Digit

```text
153 % 10 = 3
```

### Step 2 - Raise to Power

```text
3³ = 27
```

### Step 3 - Add to Sum

```text
sum = 0 + 27 = 27
```

### Step 4 - Remove Last Digit

```text
153 / 10 = 15
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 15 |
| sum | 27 |

---

## Iteration 2

### Before Execution

| Variable | Value |
|----------|------:|
| number | 15 |
| sum | 27 |

### Step 1 - Extract Last Digit

```text
15 % 10 = 5
```

### Step 2 - Raise to Power

```text
5³ = 125
```

### Step 3 - Add to Sum

```text
27 + 125 = 152
```

### Step 4 - Remove Last Digit

```text
15 / 10 = 1
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 1 |
| sum | 152 |

---

## Iteration 3

### Before Execution

| Variable | Value |
|----------:|------:|
| number | 1 |
| sum | 152 |

### Step 1 - Extract Last Digit

```text
1 % 10 = 1
```

### Step 2 - Raise to Power

```text
1³ = 1
```

### Step 3 - Add to Sum

```text
152 + 1 = 153
```

### Step 4 - Remove Last Digit

```text
1 / 10 = 0
```

### After Execution

| Variable | Value |
|----------|------:|
| number | 0 |
| sum | 153 |

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

Condition:

```text
0 > 0

False
```

The loop terminates.

---

# Final Comparison

```text
sum = 153

original = 153

153 == 153

true
```

---

# Final Output

```text
true
```

---

# Complexity Analysis

## Time Complexity

The algorithm processes one digit during every iteration.

```text
153
 ↓
15
 ↓
1
 ↓
0
```

Number of iterations = Number of digits.

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

# Key Observation

This problem combines three algorithms:

1. Count Digits
2. Extract Digits
3. Compute Power and Sum

Finally, compare the calculated sum with the original number.

---

# Edge Cases

## Input

```text
0
```

Output

```text
true
```

Reason:

```text
Digits = 1

0¹ = 0
```

Therefore, `0` is an Armstrong Number.

---

## Input

```text
9
```

Output

```text
true
```

Reason:

```text
Digits = 1

9¹ = 9
```

Every single-digit number is an Armstrong Number.