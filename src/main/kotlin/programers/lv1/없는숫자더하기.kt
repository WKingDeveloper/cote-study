/**
 * 없는 숫자 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */

fun main(args: Array<String>) {
    val arr:IntArray = intArrayOf(1,2,3,4,6,7,8,0)
    없는숫자더하기(arr)
}


fun 없는숫자더하기(numbers: IntArray): Int {
    var answer: Int = 0
    var set = numbers.toSet()

    for(i in 1..9){
        if(!set.contains(i)){
            answer += i
        }
    }

    return answer
}
