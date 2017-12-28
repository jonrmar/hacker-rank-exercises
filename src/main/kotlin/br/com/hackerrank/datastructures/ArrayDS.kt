package br.com.hackerrank.datastructures

import java.util.*

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)

    val arraySize: Int = sc.nextLine().toInt()
    val line = sc.nextLine()
    val array: Array<String> = line.split(" ").toTypedArray()

    printReversedArray(arraySize, array)
}

fun printReversedArray(size: Int, array: Array<String>){
    for(index in 0 until size){ print(array.reversedArray()[index]+ " ")}
}
