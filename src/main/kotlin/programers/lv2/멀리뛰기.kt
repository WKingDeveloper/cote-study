/**
 * 멀리뛰기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12914
 */

fun main() {
    val result = 멀리뛰기(5)
    println("멀리뛰기 = ${result}")
}
fun 멀리뛰기(n: Int): Long {


    if(n<4){
        return n.toLong()
    }
    val list = mutableListOf(1,2,3)

    for(i in 4 until n){
        list.add((list.get(i-1)+list.get(i-2))%1234567)
    }



    return list.get(n-1).toLong()
}
