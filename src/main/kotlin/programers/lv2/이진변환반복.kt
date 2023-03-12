/**
 * 이진변환 반복
 * https://school.programmers.co.kr/learn/courses/30/lessons/70129
 */

fun main() {
    println( 이진변환반복("01110"))
}

fun 이진변환반복(s: String): IntArray {
    var answer = IntArray(2)

    var removeZeroCount = 0
    var count = 0
    var param = s
    while (!param.equals("1")){
        count++
        for(c in param){
            if(c=='0'){
                removeZeroCount++
            }
        }
        param = Integer.toBinaryString(param.replace("0","").length).toString()
    }

    answer[0] = count
    answer[1] = removeZeroCount
    return answer
}
