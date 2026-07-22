# 17. Two Sum - Dry Run

## Input

```text
nums = [2, 7, 11, 15]
target = 9
```

---

## Initial State

```text
HashMap = {}
```

The HashMap stores

```text
Number -> Index
```

---

## Iteration 1 (i = 0)

Current Number

```text
2
```

Complement

```text
9 - 2 = 7
```

Check HashMap

```text
containsKey(7)

❌ No
```

Store

```text
2 -> 0
```

HashMap

```text
{
    2 -> 0
}
```

---

## Iteration 2 (i = 1)

Current Number

```text
7
```

Complement

```text
9 - 7 = 2
```

Check HashMap

```text
containsKey(2)

✅ Yes
```

Found

```text
2 -> 0
```

Answer

```text
[0, 1]
```

---

# Final Answer

```text
Indices = [0, 1]
```

Because

```text
nums[0] + nums[1]

2 + 7

= 9
```

---

# Dry Run Summary

| Index | Number | Complement | Found in HashMap | HashMap After Iteration |
|------:|-------:|-----------:|:----------------:|-------------------------|
| 0 | 2 | 7 | ❌ | {2→0} |
| 1 | 7 | 2 | ✅ | Answer Found |