/**
 * 직사각형 별 찍기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12969
 */
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    for(line in 0 until b){
        for(num in 0 until a){
            print("*")
        }
        println()
    }
}