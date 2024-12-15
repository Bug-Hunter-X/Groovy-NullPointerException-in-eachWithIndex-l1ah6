```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { String item, int index ->
    println "Item ${index + 1}: $item"
  }
}

myMethod(null)
```