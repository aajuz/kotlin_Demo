package com.xchang.kotlindemo

//class Repository
//// keeping the constructor private to enforce the usage of getInstance
//private constructor() {
//
//    private val users: MutableList<User>? = null
//
//    init {
//
//        val user1 = User("Jane", "")
//        val user2 = User("John", null)
//        val user3 = User("Anne", "Doe")
//
//        users = ArrayList()
//        users!!.add(user1)
//        users.add(user2)
//        users.add(user3)
//    }
//
//    val formattedUserNames: List<String>
//        get() {
//            val userNames = ArrayList<String>(users!!.size)
//            for ((firstName, lastName) in users!!) {
//                val name: String?
//
//                if (lastName != null) {
//                    if (firstName != null) {
//                        name = "$firstName $lastName"
//                    } else {
//                        name = lastName
//                    }
//                } else if (firstName != null) {
//                    name = firstName
//                } else {
//                    name = "Unknown"
//                }
//                userNames.add(name)
//            }
//            return userNames
//        }
//
//
//    fun getUsers(): List<User>? {
//        return users
//    }
//
//    companion object {
//
//        private var INSTANCE: Repository? = null
//
//        val instance: Repository?
//            get() {
//                if (INSTANCE == null) {
//                    synchronized(Repository::class.java) {
//                        if (INSTANCE == null) {
//                            INSTANCE = Repository()
//                        }
//                    }
//                }
//                return INSTANCE
//            }
//    }
//}

object Repository {

    private var users = mutableListOf<User>()

    val formattedUserNames: List<String>
        get() {
            val userNames = ArrayList<String>(users.size)
            for ((firstName, lastName) in users) {
                val name: String?

                if (lastName != null) {
                    if (firstName != null) {
                        name = "$firstName $lastName"
                    } else {
                        name = lastName
                    }
                } else if (firstName != null) {
                    name = firstName
                } else {
                    name = "Unknown"
                }
                userNames.add(name)
            }
            return userNames
        }

    init {

        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")
        users = ArrayList()
        users.add(user1)
        users.add(user2)
        users.add(user3)
    }

    fun getUsers(): List<User>? {
        return users
    }
}