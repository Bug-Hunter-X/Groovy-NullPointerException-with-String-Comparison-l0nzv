# Groovy NullPointerException with String Comparison

This example demonstrates a common issue in Groovy related to null comparisons and String manipulation.  The code attempts to handle a null input gracefully, but a subtle error in the comparison leads to an unexpected outcome.  The solution showcases a better way to compare Strings for null values, ensuring robust null handling. 

## Bug
The original code uses the `==` operator to check for null, which might not function as intended, particularly with Strings. The solution explores safer alternatives. 

## Solution
The improved code uses the `equals()` method for String comparison, providing more reliable null safety. This method handles null values appropriately, preventing NullPointerExceptions.