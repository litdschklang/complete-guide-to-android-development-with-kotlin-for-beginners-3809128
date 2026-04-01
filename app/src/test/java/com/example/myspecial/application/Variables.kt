package com.example.myspecial.application

import org.junit.Test

class VariablesTest {

    @Test
    fun readOnly() {
        val flavor = "Vanilla"

        // TODO: change the flavor
        // flavor = "Chocolate"

        println(flavor)
    }

    @Test
    fun mutable() {
        var flavor = "Vanilla"

        // TODO: change the flavor
        flavor = "Chocolate"

        println(flavor)
    }

}
