/**
 * 숫자 문자열과 영단어
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */

fun main(args: Array<String>) {
    println(숫자문자열과영단어("one4seveneight"))
}


fun 숫자문자열과영단어(s: String): Int {

    return s.replace("zero","0")
        .replace("one","1")
        .replace("two","2")
        .replace("three","3")
        .replace("four","4")
        .replace("five","5")
        .replace("six","6")
        .replace("seven","7")
        .replace("eight","8")
        .replace("nine","9").toInt()

}
