# Scala Generic Class Type Inference Bug

This repository demonstrates a common type inference issue in Scala generic classes. The code uses a generic class `MyClass` with a method `myMethod` that attempts to add two instances of the class together. This works fine for numeric types like `Int`, but it fails for string concatenation due to type inference problems.  The solution showcases how to explicitly specify types or use a more flexible approach to handle different data types.

## How to reproduce

1. Clone the repository.
2. Compile and run the `Bug.scala` file. Observe the compilation error for string concatenation.
3. Run the `BugSolution.scala` file to see the corrected implementation.