# Dry Run - Best Time to Buy and Sell Stock

## Input

```text
[7, 1, 5, 3, 6, 4]
```

Expected Output

```text
Buy Price  = 1
Sell Price = 6
Profit     = 5
```

---

## Variables

```text
minPrice = 7
minPriceIndex = 0

maxProfit = 0

buyIndex = 0
sellIndex = 0
```

---

# Iteration 1

Index

```text
0
```

Current Price

```text
7
```

Minimum Price

```text
7
```

Current Profit

```text
7 - 7 = 0
```

Maximum Profit

```text
0
```

---

# Iteration 2

Index

```text
1
```

Current Price

```text
1
```

Minimum Price becomes

```text
1
```

Minimum Price Index

```text
1
```

Current Profit

```text
1 - 1 = 0
```

Maximum Profit

```text
0
```

---

# Iteration 3

Index

```text
2
```

Current Price

```text
5
```

Current Profit

```text
5 - 1 = 4
```

Update

```text
Maximum Profit = 4

Buy Index = 1

Sell Index = 2
```

---

# Iteration 4

Index

```text
3
```

Current Price

```text
3
```

Current Profit

```text
3 - 1 = 2
```

Maximum Profit remains

```text
4
```

---

# Iteration 5

Index

```text
4
```

Current Price

```text
6
```

Current Profit

```text
6 - 1 = 5
```

Update

```text
Maximum Profit = 5

Buy Index = 1

Sell Index = 4
```

---

# Iteration 6

Index

```text
5
```

Current Price

```text
4
```

Current Profit

```text
4 - 1 = 3
```

Maximum Profit remains

```text
5
```

---

# Final Result

```text
Buy Index  = 1

Buy Price  = 1

Sell Index = 4

Sell Price = 6

Maximum Profit = 5
```

---

# Key Learning

Instead of comparing the current price with every previous price, maintain the minimum stock price seen so far.

For every day,

```text
Current Profit = Current Price - Minimum Price So Far
```

Update the maximum profit whenever a better profit is found.

This reduces the complexity from

```text
O(n²)
```

to

```text
O(n)
```

while using

```text
O(1)
```

extra space.