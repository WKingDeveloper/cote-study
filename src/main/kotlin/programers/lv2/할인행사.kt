import java.util.Arrays

/**
 * 할인행사
 * https://school.programmers.co.kr/learn/courses/30/lessons/12914
 */

fun main() {
    val result = 할인행사(arrayOf("banana", "apple", "rice", "pork", "pot"), intArrayOf(3, 2, 2, 2, 1),
        arrayOf("chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"))
    println("할인행사 = ${result}")
}
fun 할인행사(want: Array<String>, number: IntArray, discount: Array<String>): Int {
    var answer: Int = 0
    val wishMap = mutableMapOf<String,Int>()
    val dayMap = mutableMapOf<String,Int>()


    for(i in 0 until want.size){
        val product = want.get(i)
        wishMap[product] = number.get(i)
//        dayMap[product] = 0
    }

    for(i in 0 until 10){
        val product = discount.get(i)
        dayMap[product] = (dayMap[product] ?: 0)  + 1
    }

    val count = wishMap.keys.filter { key -> wishMap[key] != dayMap[key] }.count()
    if(count == 0) {
        answer++
    }

    for(i in 1 until discount.size-9){
        dayMap[discount.get(i-1)] = (dayMap[discount.get(i-1)]?:1) - 1
        dayMap[discount.get(i+9)] = (dayMap[discount.get(i+9)]?:0) + 1

        val count = wishMap.keys.filter { key -> wishMap[key] != dayMap[key] }.count()
        if(count == 0) {
            answer++
        }
    }



    return answer
}
