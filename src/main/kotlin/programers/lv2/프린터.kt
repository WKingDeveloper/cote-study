import java.util.*

/**
 * 프린터
 * https://school.programmers.co.kr/learn/courses/30/lessons/42587
 */

fun main() {
    프린터(intArrayOf(2, 1, 3, 2),2)
}

fun 프린터(priorities: IntArray, location: Int): Int {
    var answer = 0
    val pairs = LinkedList<Pair<Int,Int>>()


    for((index,value) in priorities.withIndex()){
        pairs.add(Pair(index,value))
    }

    while (pairs.size>0){
//        val validCount = pairs.filter { it -> it.second > pairs.peek().second }.firstOrNull()
//        if(validCount!=null){
        val validCount = pairs.filter { it -> it.second > pairs.peek().second }.count()
        if(validCount>0){
            pairs.add(pairs.poll())
        } else {
            if(pairs.peek().first == location){
                answer++
                break
            }
            pairs.poll()
            answer++
        }
    }

    return answer
}
