package com.example.hw6_1

class CounterModel {

    private var _count: Int = 0

    fun getCount(): Int = _count

    fun dec() {
        _count--
    }

    fun inc() {
        _count++
    }

}