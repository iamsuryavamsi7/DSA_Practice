# Dry Run - Leaders in an Array

Input

```text
[10,22,12,3,0,6]
```

Traverse from right.

```text
6

Leader
```

maxRight = 6

↓

```text
0

0 < 6
```

↓

```text
3

3 < 6
```

↓

```text
12

12 > 6

Leader
```

↓

```text
22

22 > 12

Leader
```

↓

```text
10

10 < 22
```

Answer

```text
[22,12,6]
```