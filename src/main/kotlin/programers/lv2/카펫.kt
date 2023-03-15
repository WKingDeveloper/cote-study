/**
 * 카펫
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842
 */

fun main() {
    val 카펫 = 카펫(24, 24)
    println("카펫 = ${카펫}")
}
fun 카펫(brown: Int, yellow: Int): IntArray {
    var measures = mutableListOf<Int>()

    if(yellow == 1){
        return intArrayOf(3,3)
    } else if(yellow == 2){
        return intArrayOf(4,3)
    } else if(yellow == 3){
        return intArrayOf(5,3)
    }

    for(i in 1..yellow){
        if(yellow % i == 0){
            measures.add(i)
        }
    }

    var finalNum = measures.size-1

    for(i in 0..finalNum){
        if((measures.get(i)*2) + (measures.get(finalNum-i)*2) + 4 == brown){
            return intArrayOf(measures.get(finalNum-i)+2,measures.get(i)+2)
        }
    }

    return intArrayOf(0,0)

}
