package br.com.hackerrank.algorithm

fun main(args: Array<String>){

    val aString : List<String>? = readLine()?.split(" ")
    val a: List<Int> = aString!!.map { it.toInt() }


    val bString : List<String>? = readLine()?.split(" ")
    val b: List<Int> = bString!!.map { it.toInt() }

    val points = verifyPoints(a, b)
    println("${points.pointB} ${points.pointB}")
}

fun verifyPoints(a: List<Int>, b: List<Int>): Points{
    val points = Points(0,0)

    for(index in 0..2){
        if(a[index] > b[index]) points.pointA += 1
        if(a[index] < b[index]) points.pointB += 1
    }

    return points
}

data class Points(var pointA: Int, var pointB: Int)