```groovy
def myMethod(String input) {
  if (input == null) { 
    return "null input"
  }
  //Some operations
  return input.toUpperCase()
}

println myMethod(null)
println myMethod("hello")
```