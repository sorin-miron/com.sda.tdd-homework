# Test Driven Development - Homework - 2019.01.21

TDD - 1.1

1. Create a class that will test the methods of a Stack

   - Name this class - CustomStackTest

2. Create the implementation of a Stack

   - Name this class - CustomStack

3. Methods that will be tested

   - empty() - test if stack is empty 

   - peek() - returns the object from the top of the Stack WITHOUT removing it from the stack

   - pop() - returns the object fro the top of the stack AND REMOVE it from the stack

      - make a test function for a stack with one element 

      - make a test function for a stack with more elements (2 elements should be enough)

   - push() - add an object to the top of the stack (and return it)

   - search(object) - search an object inside a stack and return its position. If object is not fond, -1 is returned

      - make a test function for searching in a stack with one element

      - make a test function for searching in a stack with more elements (2 should be enough)

      - make a test function to test if -1 is returned when object is not found

4. Name methods having in mind 'GIVEN - WHEN - THEN' style


TDD - 1.2

1. Create a class to test if a given number is a Fibonacci number

   - Name this class FibonacciTest

   - Create three methods to test 3rd, 5th and 8th Fibonacci numbers

2. Create a class that computes a Fibonacci number based on an index

   - Name this class Fibonacci

   - Implement both recursive and non-recursive methods 

   - Name the methods 'computeRecursive' and 'computeNonRecursive'
