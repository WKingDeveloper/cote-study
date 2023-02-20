/**
 * 자연수 뒤집어 배열로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */

fun 자연수뒤집어배열(n: Long): IntArray {
    val str = n.toString()
    var list = mutableListOf<Int>()

    for (c in str.toList().reversed()){
        list.add(c.digitToInt())
    }

    return list.toIntArray()
}