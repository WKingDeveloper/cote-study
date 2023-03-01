/**
 * 둘만의암호
 * https://school.programmers.co.kr/learn/courses/30/lessons/155652
 */

fun main() {
    println( 둘만의암호("z","abcdefghij",20))
}

fun 둘만의암호(s: String, skip: String, index: Int): String {
    var answer: String = ""
    for (c in s){
        var tmpC = c
        var num = 0
        while (index != num){
            tmpC += 1
            if(tmpC.code / 123 > 0){
                tmpC = 'a' + tmpC.code % 123
            }
            if(tmpC !in skip){
                num++
            }
        }

        answer += tmpC
    }

    return answer
}
