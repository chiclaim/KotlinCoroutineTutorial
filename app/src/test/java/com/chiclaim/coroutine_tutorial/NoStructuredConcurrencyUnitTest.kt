package com.chiclaim.coroutine_tutorial

import org.junit.Test

import org.junit.Assert.*

/**
 * 非结构化的线程并发
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class NoStructuredConcurrencyUnitTest {
    /**
     * 非结构化的线程并发
     */
    @Test
    fun test_no_structured_thread_concurrency() {
        var flag = 0
        object : Thread() {
            override fun run() {
                super.run()
                sleep(2000)
                flag++
                println("---------after 2000")
            }
        }.start()
        Thread.sleep(3000)
        println("main finish")
        assertEquals(flag, 1)
    }

    /**
     * 非结构化的线程并发
     */
    @Test
    fun test_no_structured_thread_concurrency2() {
        var flag = 0
        object : Thread() {
            override fun run() {
                super.run()
                sleep(2000)
                flag++
                println("---------after 2000")
            }
        }.start()
        println("main finish")
        assertEquals(flag, 0)
    }




}