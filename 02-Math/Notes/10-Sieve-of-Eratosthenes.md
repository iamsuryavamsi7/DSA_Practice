# Sieve of Eratosthenes

## What is it?

The Sieve of Eratosthenes is an efficient algorithm used to find **all prime numbers up to a given number N**.

Instead of checking every number individually for primality, we eliminate the numbers that cannot be prime.

---

# Basic Idea

Initially assume every number is prime.

```
2 3 4 5 6 7 8 9 10 ...
```

Now,

Start from 2.

Since 2 is prime,

Mark all multiples of 2 as NOT prime.

```
4
6
8
10
12
...
```

Next,

Move to 3.

Since 3 is still marked as prime,

Mark all multiples of 3.

```
6
9
12
15
18
...
```

Continue the same process.

Finally,

The remaining numbers marked as prime are exactly the prime numbers.

---

# Why do we stop at √N?

Suppose

```
N = 100
```

```
√100 = 10
```

Every composite number has at least one factor less than or equal to √N.

Therefore,

Once we've processed numbers up to √N,

all remaining composite numbers have already been marked.

---

# Why start marking from i²?

Suppose

```
i = 5
```

Multiples are

```
5 × 2 = 10
5 × 3 = 15
5 × 4 = 20
5 × 5 = 25
```

Notice

10

15

20

have already been marked by

```
2

3

4
```

So there is no need to start from

```
2i
```

Instead start directly from

```
i²
```

This avoids unnecessary work.

---

# Time Complexity

```
O(n log log n)
```

---

# Space Complexity

```
O(n)
```

---

# Applications

- Generate all prime numbers
- Competitive Programming
- Number Theory
- Prime Factorization
- Euler Totient
- Segmented Sieve