# Best Time to Buy and Sell Stock

## Problem Statement

You are given an array `prices` where `prices[i]` represents the stock price on the `i-th` day.

You may choose exactly one day to buy one stock and choose a different future day to sell that stock.

Return the maximum profit you can achieve.

If no profit is possible, return `0`.

---

## Examples

### Example 1

Input

```text
prices = [7,1,5,3,6,4]
```

Output

```text
5
```

Explanation

```text
Buy on day 2 at price 1.

Sell on day 5 at price 6.

Profit = 6 - 1 = 5
```

---

### Example 2

Input

```text
prices = [7,6,4,3,1]
```

Output

```text
0
```

Explanation

```text
No profitable transaction is possible.
```

---

## Constraints

```text
1 <= prices.length <= 10^5

0 <= prices[i] <= 10^4
```

---

## Expected Approaches

- Brute Force
- Optimal One Pass Solution