/**
 * 최대값과 최소값
 * https://school.programmers.co.kr/learn/courses/30/lessons/12939
 */

fun 최대값과최소값(s: String): String {
    val splitParam = s.split(" ")
    val list = mutableListOf<Int>()
    for(s in splitParam){
        list.add(s.toInt())
    }

    return list.minOf { it }.toString() + " " + list.maxOf { it}.toString()
}
