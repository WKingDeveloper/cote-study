import java.util.*

/**
 * 택배상자
 * https://school.programmers.co.kr/learn/courses/30/lessons/131704
 */

fun main() {
    택배상자(intArrayOf(4, 3, 1, 2, 5))
//    택배상자(intArrayOf(5,4,3,2,1))
}

fun 택배상자(order: IntArray): Int {
    var answer: Int = 0
    val containerBelts = PriorityQueue<Int>()
    val assistantContainerBelts = Stack<Int>()

    val orderSize = order.size

    for(i in 1 .. orderSize){
        containerBelts.add(i)
    }


    while (orderSize != answer){

        val validNum = order[answer]
        if(containerBelts.size != 0 && validNum == containerBelts.peek()){
            containerBelts.poll()
            answer++
            continue
        }

        if(assistantContainerBelts.size != 0 && validNum == assistantContainerBelts.peek()){
            assistantContainerBelts.pop()
            answer++
            continue
        }

        assistantContainerBelts.push(containerBelts.poll())

        if(containerBelts.size==0 && assistantContainerBelts.peek() != validNum){
            break
        }

    }

    return answer
}
