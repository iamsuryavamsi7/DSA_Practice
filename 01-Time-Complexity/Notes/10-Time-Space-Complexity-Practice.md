# Lesson 10 - Time & Space Complexity Practice

## Objective

Practice identifying the Time Complexity and Space Complexity of Java code without executing it.

The goal is to develop the ability to analyze code simply by reading it.

---

# Questions Practiced

## Q1

```java
int a = 10;
```

**Time Complexity**

O(1)

**Space Complexity**

O(1)

---

## Q2

```java
System.out.println(arr[5]);
```

**Time Complexity**

O(1)

**Space Complexity**

O(1)

---

## Q3

```java
for(int i = 0; i < n; i++) {

}
```

**Time Complexity**

O(n)

**Space Complexity**

O(1)

---

## Q4

```java
int[] temp = new int[n];
```

**Time Complexity**

O(n)

**Space Complexity**

O(n)

---

## Q5

```java
for(int num : arr){

    System.out.println(num);

}
```

**Time Complexity**

O(n)

**Space Complexity**

O(1)

---

## Q6

```java
for(int i = 0; i < n; i++) {

}

for(int j = 0; j < n; j++) {

}
```

**Time Complexity**

O(n)

**Space Complexity**

O(1)

---

## Q7

```java
for(int i = 0; i < n; i++) {

    for(int j = 0; j < n; j++) {

    }

}
```

**Time Complexity**

O(n²)

**Space Complexity**

O(1)

---

## Q8

```java
for(int i = 0; i < n; i++) {

}

for(int j = 0; j < n * n; j++) {

}
```

Operations

```
n + n²
```

Simplified

```
O(n²)
```

**Space Complexity**

O(1)

---

## Q9

```java
while(n > 1){

    n = n / 2;

}
```

Each iteration halves the input.

```
n

↓

n/2

↓

n/4

↓

n/8

↓

...

↓

1
```

**Time Complexity**

O(log n)

**Space Complexity**

O(1)

---

## Q10

```java
ArrayList<Integer> list = new ArrayList<>();

for(int i = 0; i < n; i++){

    list.add(i);

}
```

**Time Complexity**

O(n)

**Space Complexity**

O(n)

---

## Q11

```java
for(int i = 0; i < n; i++){

    System.out.println(i);

}

int x = 10;
```

**Time Complexity**

O(n)

**Space Complexity**

O(1)

---

## Q12

```java
for(int i = 0; i < n; i++){

}

for(int j = 0; j < m; j++){

}
```

**Time Complexity**

O(n + m)

**Space Complexity**

O(1)

---

## Q13

```java
for(int i = 0; i < n; i++){

    for(int j = 0; j < m; j++){

    }

}
```

**Time Complexity**

O(n × m)

**Space Complexity**

O(1)

---

## Q14

```java
int[][] matrix = new int[n][n];
```

**Time Complexity**

O(n²)

**Space Complexity**

O(n²)

---

## Q15

```java
int max = arr[0];

for(int i = 1; i < n; i++){

    if(arr[i] > max){

        max = arr[i];

    }

}
```

**Time Complexity**

O(n)

**Space Complexity**

O(1)

---

## Q16

```java
HashMap<Integer,Integer> map = new HashMap<>();

for(int i = 0; i < n; i++){

    map.put(i,i);

}
```

**Time Complexity**

O(n)

**Space Complexity**

O(n)

---

## Q17

```java
for(int i = 0; i < n; i++){

}

for(int j = 0; j < n; j++){

}

for(int k = 0; k < n; k++){

}
```

Operations

```
n + n + n

↓

3n

↓

O(n)
```

**Space Complexity**

O(1)

---

## Q18

```java
for(int i = 0; i < n; i++){

    for(int j = 0; j < n; j++){

        for(int k = 0; k < n; k++){

        }

    }

}
```

**Time Complexity**

O(n³)

**Space Complexity**

O(1)

---

## Q19

```java
while(n > 1){

    n = n / 2;

}

for(int i = 0; i < n; i++){

}
```

The while loop reduces `n` to 1.

The second loop runs only once.

**Time Complexity**

O(log n)

**Space Complexity**

O(1)

---

## Q20

```java
int[] a = new int[n];

int[] b = new int[n];
```

Operations

```
n + n

↓

2n

↓

O(n)
```

**Time Complexity**

O(n)

**Space Complexity**

O(n)

---

# Key Learning

Whenever analyzing any algorithm, ask two questions:

1. How many times does the code execute?
2. How much additional memory is created?

These two questions are enough to determine the Time Complexity and Space Complexity of most iterative algorithms.
