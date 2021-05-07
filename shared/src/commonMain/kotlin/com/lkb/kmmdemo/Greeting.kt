package com.lkb.kmmdemo

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}