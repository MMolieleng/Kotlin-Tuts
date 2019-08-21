###### Control Flow

[Kotlin Documentation][https://kotlinlang.org/docs/reference/control-flow.html]

## if statement

```kotlin
var x = 0
if (x > 0){
    print("x > 0")
}
```
Sometimes we can return a value from an if statement and assign it to some variable

```kotlin
var num = 0
var result = if (num > 0){
    num++
}else{
    num--
}
print("Result : $result")
```
Output : Result : -1 

```kotlin
for (i in 0..10){
    println("Index At => $i")
}
```

[https://kotlinlang.org/docs/reference/control-flow.html]: https://kotlinlang.org/docs/reference/control-flow.html