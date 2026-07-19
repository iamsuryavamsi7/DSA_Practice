# Dry Run - Sieve of Eratosthenes

## Example

```
N = 20
```

Initially,

Assume every number is prime.

```
2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
```

---

## Step 1

Current Prime

```
2
```

Mark

```
4
6
8
10
12
14
16
18
20
```

Remaining

```
2 3 5 7 9 11 13 15 17 19
```

---

## Step 2

Current Prime

```
3
```

Mark

```
6
9
12
15
18
```

New Remaining

```
2 3 5 7 11 13 17 19
```

---

## Step 3

Current Prime

```
4
```

Already marked.

Skip.

---

## Step 4

Current Prime

```
5
```

Start from

```
25
```

Since

```
25 > 20
```

Nothing to mark.

---

Stop because

```
√20 ≈ 4.47
```

All remaining numbers are prime.

Final Answer

```
2
3
5
7
11
13
17
19
```

---

# Visualization

```
Initially

2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

↓

Remove multiples of 2

2 3 X 5 X 7 X 9 X 11 X 13 X 15 X 17 X 19 X

↓

Remove multiples of 3

2 3 X 5 X 7 X X X 11 X 13 X X X 17 X 19 X

↓

Finished

Prime Numbers

2 3 5 7 11 13 17 19
```