/**
 * JadenCase 문자열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12951
 */
fun main() {
    println(jadenCase("the quick brown fox jumps over the lazy dog"))
    // 출력: "The Quick Brown Fox Jumps Over The Lazy Dog"

    // 추가 테스트 케이스
    println(jadenCase("hello world"))
    // 출력: "Hello World"

    println(jadenCase("i love kotlin"))
    // 출력: "I Love Kotlin"

    println(jadenCase("kotlin is the best programming language to learn"))
    // 출력: ""

    println(jadenCase(" adgagd 3eagdag "))
    // " Adgagd 3eagdag "
}
fun jadenCase(s: String): String {
    var answer = ""
    val splitS = s.lowercase().split(" ")

    for (word in splitS) {
        if(word.equals("")) {
            answer += " "
            continue
        }
        answer += word.first().uppercaseChar() + word.substring(1, word.length)+" "
    }
    return answer.substring(0, answer.length-1)
}
