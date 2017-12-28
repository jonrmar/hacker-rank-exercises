package br.com.hackerrank.algorithm

fun main(args: Array<String>){

    val N = readLine()!!.toInt()
    val arrayString : List<String>? = readLine()?.split(" ")
    val array: List<Long> = arrayString!!.map { it.toLong() }
    var sum : Long = 0

    for(i in 0..N-1){
        sum += array[i]
    }
    println(sum)
}