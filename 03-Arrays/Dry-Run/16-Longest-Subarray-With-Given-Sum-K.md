# Longest Subarray With Sum K (Prefix Sum + HashMap) - Dry Run

## Input

```java
int[] arr = {1, 2, 1, 1, 1};
int k = 3;
```

---

## Initial State

```text
prefixSum = 0
maxLen = 0
HashMap = {}
```

The HashMap stores:

```text
PrefixSum -> First Index
```

---

# Iteration 1 (i = 0)

Current Element

```text
arr[0] = 1
```

Update Prefix Sum

```text
prefixSum = 0 + 1 = 1
```

### Check 1

```text
prefixSum == k

1 == 3 ❌
```

### Check 2

Need:

```text
prefixSum - k

1 - 3 = -2
```

Check HashMap

```text
containsKey(-2)

❌ No
```

Store Prefix Sum

```text
1 -> 0
```

HashMap

```text
{
    1 -> 0
}
```

Current maxLen

```text
0
```

---

# Iteration 2 (i = 1)

Current Element

```text
arr[1] = 2
```

Update Prefix Sum

```text
prefixSum = 1 + 2 = 3
```

### Check 1

```text
prefixSum == k

3 == 3 ✅
```

Subarray Found

```text
[1, 2]
```

Length

```text
i + 1

1 + 1 = 2
```

Update

```text
maxLen = 2
```

Store Prefix Sum

```text
3 -> 1
```

HashMap

```text
{
    1 -> 0,
    3 -> 1
}
```

Current maxLen

```text
2
```

---

# Iteration 3 (i = 2)

Current Element

```text
arr[2] = 1
```

Update Prefix Sum

```text
prefixSum = 3 + 1 = 4
```

### Check 1

```text
prefixSum == k

4 == 3 ❌
```

### Check 2

Need

```text
4 - 3 = 1
```

HashMap

```text
{
    1 -> 0,
    3 -> 1
}
```

Found

```text
1 -> 0
```

Subarray

```text
[2, 1]
```

Length

```text
currentLen = 2 - 0 = 2
```

Update

```text
maxLen = max(2, 2)

= 2
```

Store Prefix Sum

```text
4 -> 2
```

HashMap

```text
{
    1 -> 0,
    3 -> 1,
    4 -> 2
}
```

Current maxLen

```text
2
```

---

# Iteration 4 (i = 3)

Current Element

```text
arr[3] = 1
```

Update Prefix Sum

```text
prefixSum = 4 + 1 = 5
```

### Check 1

```text
5 == 3 ❌
```

Need

```text
5 - 3 = 2
```

HashMap

```text
{
    1 -> 0,
    3 -> 1,
    4 -> 2
}
```

Found?

```text
❌ No
```

Store Prefix Sum

```text
5 -> 3
```

HashMap

```text
{
    1 -> 0,
    3 -> 1,
    4 -> 2,
    5 -> 3
}
```

Current maxLen

```text
2
```

---

# Iteration 5 (i = 4)

Current Element

```text
arr[4] = 1
```

Update Prefix Sum

```text
prefixSum = 5 + 1 = 6
```

### Check 1

```text
6 == 3 ❌
```

Need

```text
6 - 3 = 3
```

HashMap

```text
{
    1 -> 0,
    3 -> 1,
    4 -> 2,
    5 -> 3
}
```

Found

```text
3 -> 1
```

Subarray

```text
[1, 1, 1]
```

Length

```text
currentLen = 4 - 1 = 3
```

Update

```text
maxLen = 3
```

Store Prefix Sum

```text
6 -> 4
```

Final HashMap

```text
{
    1 -> 0,
    3 -> 1,
    4 -> 2,
    5 -> 3,
    6 -> 4
}
```

---

# Final Answer

```text
Longest Length = 3
```

Longest Subarray

```text
[1, 1, 1]
```

Indexes

```text
2 → 4
```

---

# Complete Dry Run Summary

| Index | Element | Prefix Sum | Prefix Sum == K | Need (PrefixSum - K) | Found in HashMap | Current Length | Max Length | HashMap |
|------:|--------:|-----------:|:---------------:|---------------------:|:----------------:|---------------:|-----------:|---------|
| 0 | 1 | 1 | ❌ | -2 | ❌ | - | 0 | {1→0} |
| 1 | 2 | 3 | ✅ | 0 | ❌ | 2 | 2 | {1→0, 3→1} |
| 2 | 1 | 4 | ❌ | 1 | ✅ (0) | 2 | 2 | {1→0, 3→1, 4→2} |
| 3 | 1 | 5 | ❌ | 2 | ❌ | - | 2 | {1→0, 3→1, 4→2, 5→3} |
| 4 | 1 | 6 | ❌ | 3 | ✅ (1) | 3 | 3 | {1→0, 3→1, 4→2, 5→3, 6→4} |

---

# Key Takeaways

- `prefixSum` stores the sum from index `0` to the current index.
- At every iteration, calculate:

```text
remaining = prefixSum - k
```

- If `remaining` exists in the HashMap, then a valid subarray exists.
- The length of that subarray is:

```text
currentIndex - previousPrefixSumIndex
```

- Always store the **first occurrence** of each prefix sum.

```java
if (!arrMap.containsKey(prefixSum)) {
    arrMap.put(prefixSum, i);
}
```

This guarantees the **longest** possible subarray.