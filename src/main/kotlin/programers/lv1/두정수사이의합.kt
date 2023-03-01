
/**
 * 두 정수 사이의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 */

fun main() {
    두정수사이의합(5,3)
}

fun 두정수사이의합(a: Int, b: Int): Long {
    var answer: Long = 0
    var min = a
    var max = b
    if(a>b){
        min = b
        max = a
    }
    for(i in min..max){
        answer += i
    }
    return answer
}
