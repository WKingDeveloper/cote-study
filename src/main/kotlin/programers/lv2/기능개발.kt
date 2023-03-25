/**
 * 기능개발
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586
 */

fun main() {
//    val result = 기능개발(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5))
    val result = 기능개발(intArrayOf(95, 90, 99, 99, 80, 99), intArrayOf(1, 1, 1, 1, 1, 1))
    println("기능개발 = ${result}")
}
fun 기능개발(progresses: IntArray, speeds: IntArray): IntArray {
    var answer = mutableListOf<Int>()

    var reaminDays = mutableListOf<Int>()

    for (i in 0 until progresses.size) {
        var remain = 100 - progresses.get(i)
        var remainDay = remain / speeds.get(i)

        if (remain % speeds.get(i) != 0) {
            remainDay++
        }
        reaminDays.add(remainDay)
    }

    while (reaminDays.size != 0) {

        var removeNum = 0
        var num = reaminDays.get(0)
        reaminDays.removeAt(0)

        for (i in 0 until reaminDays.size) {
            if (reaminDays.get(i-removeNum) <= num) {
                reaminDays.removeAt(0)
                removeNum++
            } else{
                break
            }
        }


        answer.add(removeNum+1)
    }


    return answer.toIntArray()
}
