/**
 * 햄버거 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/133502
 */

fun main(args: Array<String>) {
    val arr:IntArray = intArrayOf(1, 1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1) // 3
    val arr2:IntArray = intArrayOf(1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1) // 3
    val arr3:IntArray = intArrayOf(1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1, 2, 3, 1, 3, 3, 3, 2, 1, 2, 3, 1) // 5
    val arr4:IntArray = intArrayOf(1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1) // 3
    val arr5:IntArray = intArrayOf(1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1) // 3
    val arr6:IntArray = intArrayOf(1, 2, 2, 3, 1) // 0
    println(햄버거(arr))
    println(햄버거(arr2))
    println(햄버거(arr3))
    println(햄버거(arr4))
    println(햄버거(arr5))
    println(햄버거(arr6))
}

fun 햄버거(ingredient: IntArray): Int {
    // 1,2,3,1 -> 햄버거 1개
    var answer: Int = 0

    var list = ingredient.toMutableList()

    var i = 0
    while (i<list.size && list.size>3){
        if(list[i]==1) {
            if (i > 2){
                if (list[i -3] == 1 && list[i - 2] == 2 && list[i - 1] == 3) {
                    list.removeAt(i-3)
                    list.removeAt(i-3)
                    list.removeAt(i-3)
                    list.removeAt(i-3)
                    i -= 3
                    answer++
                    continue
                }
            }
        }
        i++
    }

    return answer

}
