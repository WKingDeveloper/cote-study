/**
 * 수박수박수박수박수박수?
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */

fun main(args: Array<String>) {
    println(수박수박수(4))
}

fun 수박수박수(n: Int): String {
    return "수박".repeat(n/2) + if(n%2==1) "수" else ""
}
