# Day 1 – Notes

## Problem 1: Multiplication Table
- **Problem (in my words):**  
  Print the multiplication table of a number `n` up to `m`.

- **Approach:**  
  - Take input `n` and `m`.  
  - Loop from 1 to `m`.  
  - Print `n x i = result`.  

- **Pseudocode:**
    read n, m
    for i = 1 to m:
    print n x i = n*i
    
    
- **Code Snippet (core logic):**
```java
for (int i = 1; i <= m; i++) {
    System.out.println(n + " x " + i + " = " + (n * i));
}
```

Complexity: O(m) time, O(1) space.

Key Learning: Practiced loops, Scanner input handling, and formatted printing.


## Problem 2: Reverse Number

- **Problem (in my words):**  
  Reverse the digits of an integer, handling negative numbers as well.

- **Approach:** 

  Check the sign of the number.

  Work with the absolute value.

  Extract digits using % 10.

  Build reversed number with rev = rev * 10 + digit.

  Apply sign back at the end.

- **Pseudocode:**
  sign = -1 if n < 0 else 1
  n = abs(n)
  rev = 0
  while n > 0:
  digit = n % 10
  rev = rev * 10 + digit
  n = n / 10
  return sign * rev

- **Code Snippet (core logic):**
```java
int sign = n < 0 ? -1 : 1;
n = Math.abs(n);
while (n > 0) {
    long digit = n % 10;
    rev = rev * 10 + digit;
    n /= 10;
}
return sign * rev;

```

Complexity: O(d) time (where d = number of digits), O(1) space.

Key Learning: Handling negative numbers, avoiding integer overflow by using long.
