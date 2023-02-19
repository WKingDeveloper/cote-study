/**
 * 나누어떨어지는수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */

fun 나누어떨어지는수(arr: IntArray, divisor: Int): IntArray {
    var list = mutableListOf<Int>()
    for(i in arr){
        if(i%divisor==0){
            list.add(i)
        }
    }

    if(list.size==0){
        return intArrayOf(-1)
    }

    return list.toIntArray().sortedArray()
}
