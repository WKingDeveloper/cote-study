import java.util.Arrays

/**
 * 명예의전당1
 * https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */

fun main() {
    println( 명예의전당1(3, intArrayOf(10, 100, 20, 150, 1, 100, 200)))
}

fun 명예의전당1(k: Int, score: IntArray): IntArray {

    var list = mutableListOf<Int>()
    var answer = mutableListOf<Int>()

    for(s in score){
        if(list.size>=k){
            if(s>list.minOf { it }){
                list.remove(list.minOf { it })
                list.add(s)
            }
        } else{
            list.add(s)
        }
        answer.add(list.minOf { it })
    }

    return answer.toIntArray()
}
