# Dry Run - Move Zeroes

## Example

Input

```text
[1, 0, 2, 0, 3, 0, 4]
```

---

## Initial State

```text
slow = 0
```

Array

```text
[1, 0, 2, 0, 3, 0, 4]
```

---

## Phase 1

| fast | Value | Action | slow | Array |
|------|------:|--------|-----:|-------|
| 0 | 1 | Copy | 1 | [1,0,2,0,3,0,4] |
| 1 | 0 | Ignore | 1 | [1,0,2,0,3,0,4] |
| 2 | 2 | Copy | 2 | [1,2,2,0,3,0,4] |
| 3 | 0 | Ignore | 2 | [1,2,2,0,3,0,4] |
| 4 | 3 | Copy | 3 | [1,2,3,0,3,0,4] |
| 5 | 0 | Ignore | 3 | [1,2,3,0,3,0,4] |
| 6 | 4 | Copy | 4 | [1,2,3,4,3,0,4] |

---

## Phase 2

Fill remaining positions with zeroes.

| Index | Value |
|------:|------:|
| 4 | 0 |
| 5 | 0 |
| 6 | 0 |

Final Array

```text
[1,2,3,4,0,0,0]
```

---

## Time Complexity

```
O(n)
```

---

## Space Complexity

```
O(1)
```

---

## Key Observation

- Fast pointer scans every element.
- Slow pointer marks the next position for a non-zero element.
- Phase 1 gathers all non-zero elements.
- Phase 2 fills the remaining positions with zeroes.