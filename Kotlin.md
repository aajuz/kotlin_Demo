# Kotlin



## 变量声明

### 类型推断

kotlin是静态语言

### Null安全

kotlin变量不能持有null值，除非

```kotlin
val languageName: String? = null
```



## 条件语句

```kotlin
val answerString: String = if (count == 42) {
    "I have the answer."
} else if (count > 35) {
    "The answer is close."
} else {
    "The answer eludes me."
}

println(answerString)
```

上面语句的含义是，根据if的判断，为answerString赋予一个字符串类型的初值



将if-else替换为when

```kotlin
val answerString = when {
    count == 42 -> "I have the answer."
    count > 35 -> "The answer is close."
    else -> "The answer eludes me."
}

println(answerString)
```

## 函数

```kotlin
fun generateAnswerString(countThreshold: Int): String {
    val answerString = if (count > countThreshold) {
        "I have the answer."
    } else {
        "The answer eludes me."
    }

    return answerString
}
```

上面函数名称为generateAnswerString，输入类型为Int，返回值类型为String，与变量声明类似



调用

```kotlin
val answerString = generateAnswerString(42)
```



### 简化函数声明

```kotlin
fun generateAnswerString(countThreshold: Int): String {
    return if (count > countThreshold) {
        "I have the answer."
    } else {
        "The answer eludes me."
    }
}
```

与非简化的类似，不过跳过了局部变量声明

------

```kotlin
fun generateAnswerString(countThreshold: Int): String = if (count > countThreshold) {
        "I have the answer"
    } else {
        "The answer eludes me"
    }
```

将 return 关键字替换为赋值运算符



### 匿名函数

```kotlin
val stringLengthFunc: (String) -> Int = { input ->
    input.length
}

val stringLength: Int = stringLengthFunc("Android")
```

该函数将 `String` 当作输入，并将输入 `String` 的长度作为 `Int` 类型的输出返回



### 高阶函数

一个函数可以将另一个函数当作参数

```kotlin
fun stringMapper(str: String, mapper: (String) -> Int): Int {
    // Invoke function
    return mapper(str)
}

stringMapper("Android", { input ->
    input.length
})
```

该函数接收一个String类型和一个String输入，Int输出的函数



```kotlin
stringMapper("Android") { input ->
    input.length
}
```

如果匿名函数是在某个函数上定义的最后一个参数，则您可以在用于调用该函数的圆括号之外传递它



## 类

### 属性

### 类函数和封装

getter和setter



## 互操作性



## 关键字

### data

将此类标记为 `data` 类后，编译器便会自动创建 getter 和 setter。此外，其还会派生 `equals()`、`hashCode()` 和 `toString()` 函数

### 伴生对象 companion object

类似于static



## 解构

```Java
for (User user : users) {
    String name;

    if (user.getLastName() != null) {
        if (user.getFirstName() != null) {
            name = user.getFirstName() + " " + user.getLastName();
            ...
```

解构后

```kotlin
for ((firstName, lastName) in users) {
       val name: String?

       if (lastName != null) {
          if (firstName != null) {
                name = "$firstName $lastName"
          } 
       ...
```



