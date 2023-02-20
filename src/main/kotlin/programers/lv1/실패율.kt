/**
 * 실패율
 * https://school.programmers.co.kr/learn/courses/30/lessons/42889
 */

fun main() {
//    val result = 실패율(5, intArrayOf(2, 1, 2, 6, 2, 4, 3, 3))
//    val result2 = 실패율(4, intArrayOf(4,4,4,4))
    val result3 = 실패율(4, intArrayOf(3,3,3,3))

//    println("result = ${result.toList()}")
//    println("result2 = ${result2.toList()}")
    println("result3 = ${result3.toList()}")
}

fun 실패율(N: Int, stages: IntArray): IntArray {

    var numberOfPerson = stages.size
    var rateMap = mutableMapOf<Int,Double>()

    for(i in 1..N){
        val count = stages.asSequence().filter { it == i }.count()
        rateMap.put(i, if(numberOfPerson!=0) count/numberOfPerson.toDouble() else 0.0)
        numberOfPerson -= count
    }

    val toList =
        rateMap.keys.asSequence().sortedWith(compareByDescending<Int>({rateMap.get(it)}).thenBy { it }).toList()


    return toList.toIntArray()

}