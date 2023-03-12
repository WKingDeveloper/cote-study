/**
 * 피보나치수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12945
 */

fun 피보나치수(n: Int): Int {
    val map = hashMapOf(0 to 0, 1 to 1, 2 to 2)
    for(i in 2..n){
        map[i] = (map[i-2]!! + map[i-1]!!) % 1234567
    }

    return map[n]!!
}
