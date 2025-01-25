```groovy
def myMethod(String input) {
  if (input == null || input.isEmpty()) { 
    return "null or empty input"
  }
  //Some operations
  return input.toUpperCase()
}

println myMethod(null)
println myMethod("")
println myMethod("hello")
```