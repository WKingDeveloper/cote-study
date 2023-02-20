/**
 * 하샤드수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */

fun 하샤드수(x: Int): Boolean {

    var str = x.toString()
    var sum = 0
    str.asSequence().toList().map { sum += it.digitToInt() }

    return if(x%sum==0) true else false

}