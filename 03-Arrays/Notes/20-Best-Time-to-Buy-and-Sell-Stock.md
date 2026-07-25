# Best Time to Buy and Sell Stock

## Goal

Find the maximum possible profit by buying once and selling once.

---

## Rules

- Buy before Sell.
- You can buy only once.
- You can sell only once.
- If profit is not possible, return 0.

---

## Learning Objectives

After completing this problem you should understand:

- Prefix Minimum
- Greedy Thinking
- One Pass Traversal
- Running Minimum
- Profit Calculation

---

## Interview Importance

Difficulty

Easy

Frequently Asked In

- Amazon
- Microsoft
- Google
- Adobe
- Walmart
- Oracle

---

## Time Complexity

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n²) | O(1) |
| Optimal | O(n) | O(1) |

---

## Key Learning

While traversing the array once:

- Maintain the minimum stock price seen so far.
- Calculate today's profit using that minimum price.
- Update the maximum profit whenever a better profit is found.