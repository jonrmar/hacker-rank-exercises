package br.com.hackerrank.algorithm

import java.util.*

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)

    val arraySize: Int = sc.nextLine().toInt()
    val line = sc.nextLine()
    val array = line.split(" ")

    println(calculateArraySum(arraySize, array))
}

fun calculateArraySum(size: Int, array: List<String>): Int {
    var sum: Int = 0

    for(index in 0 until size){ sum += array[index].toInt() }

    return sum
}
