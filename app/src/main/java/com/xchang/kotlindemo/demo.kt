package com.xchang.kotlindemo

fun main() {
    demo().test()
    Repository.getUsers()
}
class demo {

    fun main(args: Array<String>) {
        test()
    }

    fun test(): User {
        val user1 = User("fu")
        println(user1)
        println(User(lastName = "hang"))
        return user1
    }
}