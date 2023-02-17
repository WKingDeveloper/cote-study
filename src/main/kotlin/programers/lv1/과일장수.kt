/**
 * 과일장수
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */
fun main(args: Array<String>) {
    val arr:IntArray = intArrayOf(1, 2, 3, 1, 2, 3, 1)
    과일장수(3,4, arr)

}

fun 과일장수(k: Int, m: Int, score: IntArray): Int {
    var answer: Int = 0
    val sortedArrayDescending = score.sortedArrayDescending()
    val boxSize = score.size / m
    var currentSize = 0

    for ((index,value) in sortedArrayDescending.withIndex()){
        if((index+1)%m==0){
            answer += value*m
            currentSize++
        }
        if(currentSize == boxSize) break
    }

    return answer
}
