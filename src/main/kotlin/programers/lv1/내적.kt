/**
 * 내적
 * https://school.programmers.co.kr/learn/courses/30/lessons/70128
 */

fun test2(a: IntArray, b: IntArray): Int {
    var answer: Int = 0

    for(n in 0 until a.size){
        answer += a[n]*b[n]
    }

    return answer
}
