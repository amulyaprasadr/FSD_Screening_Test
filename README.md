# FSD_Screening_Test

# Hi Team TANDEMLOOP,

Thank you for considering my application for the Full Stack Developer position. I’ve completed the First Screening Test as per the provided instructions.


# Problem 1: Simple Calculator

## Language Used:
Java (JDK 17)

## Description:
This program is a basic calculator that:
- Accepts two integers (`a` and `b`) from the user.
- Displays a menu of operations:
  1. Addition
  2. Subtraction
  3. Multiplication
  4. Division
- Performs the selected operation using a `switch` statement.
- Prints the result to the console.
- Displays an error message for invalid menu choices.

## Explination:
1. The program prompts the user to input two integers.
2. A menu is displayed for selecting the desired mathematical operation.
3. Based on the user's choice:
   - **Addition**: adds `a` and `b`.
   - **Subtraction**: subtracts `b` from `a`.
   - **Multiplication**: multiplies `a` by `b`.
   - **Division**: divides `a` by `b` (integer division).
4. If the choice is invalid, the program displays `"invalid choice"`.



# Problem 2: Generate First `a` Odd Numbers

## Language Used:
Java (JDK 17)

## Description:
This program generates and prints the first `a` odd numbers starting from 1, separated by commas.

### Input:
- A single integer `a` representing how many odd numbers to generate.

### Output:
- A comma-separated sequence of the first `a` odd numbers.

## Explination:
1. Read integer input `a` from the user.
2. Initialize:
   - `num` to 1 (the first odd number)
   - `count` to 0 (to keep track of how many odd numbers printed)
3. Loop until `count` equals `a`:
   - Print `num`
   - Increment `count` by 1
   - Increment `num` by 2 to get the next odd number
4. Add a comma and space after each number except the last.



# Problem 3: Conditional Odd Number Sequence

## Language Used:
Java (JDK 17)

## Description:
This program generates a sequence of odd numbers based on the following rule:
- If the input `a` is **odd**, print the first `a` odd numbers.
- If the input `a` is **even**, print the first `(a - 1)` odd numbers.

### Input:
- A single integer `a`.

### Output:
- A comma-separated sequence of odd numbers determined by the above rule.

## Explination:
1. Read integer input `a` from the user.
2. Determine `limit`:
   - If `a` is even → `limit = a - 1`
   - If `a` is odd → `limit = a`
3. Loop from `i = 0` to `i < limit`:
   - Calculate odd number as `2 * i + 1`
   - Print the odd number, adding commas between numbers (not after the last one).
4. Close the scanner to avoid resource leaks.



# Problem 4: Count Multiples of 1 to 9 in a List

## Language Used:
Java (JDK 17)

## Description:
This program counts how many numbers in a given list are divisible by each number from **1 to 9**.

### Input:
- A predefined list of integers:

### Output:
- A mapping `{divisor: count}` showing how many numbers are divisible by each divisor from 1 to 9.

## Explination:
1. Initialize an integer array `numbers` with the given values.
2. Create a `LinkedHashMap` to store divisors (keys 1–9) and their counts (initially 0).
3. Loop through each number in `numbers`.
4. For each number, check if it is divisible by each divisor (1–9):
   - If divisible, increment the corresponding count in the map.
5. Print the final map showing counts for all divisors.




Best regards,  
Amulya R








