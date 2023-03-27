/**
 * 행렬의곱셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/12949
 */

fun main() {
    val result = 행렬의곱셈(
        //    3x3 3x2 = 3x2
        arrayOf(intArrayOf(2,3,2), intArrayOf(4,2,4), intArrayOf(3,1,4)),
        arrayOf(intArrayOf(5,4), intArrayOf(2,4), intArrayOf(3,1))
    )

    println("result = ${result}")
}

fun 행렬의곱셈(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    val array = Array(arr1.size) { IntArray(arr2.get(0).size) { 0 } }

    for((index,a1) in arr1.withIndex()) {
        var num = 0
        for (i in 0 until arr2.get(0).size) {
            var sum = 0
            for (j in 0 until a1.size) {
                sum += a1.get(j) * arr2.get(j).get(num)
            }
            array[index][num] =sum
            num++
        }
    }

    return array
}
