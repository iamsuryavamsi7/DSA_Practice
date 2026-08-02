# Dry Run - Merge Overlapping Intervals

Input

```text
[1,3]

[2,6]

[8,10]

[15,18]
```

Sort

↓

Already Sorted

↓

Compare

```text
1-3

2-6
```

Overlap

↓

Merge

```text
1-6
```

Next

```text
8-10
```

No overlap

↓

Store

↓

Next

```text
15-18
```

Answer

```text
[1,6]

[8,10]

[15,18]
```