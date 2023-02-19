/**
 * 문자열 내 맘대로 정렬하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915
 * https://soopeach.tistory.com/193
 */
fun main(args: Array<String>) {

    val 문자열정렬 = 문자열정렬(arrayOf("sun", "bed", "car"), 1)
    val 문자열정렬2 = 문자열정렬(arrayOf("abce", "abcd", "cdx"), 2)
    println(문자열정렬)
    println(문자열정렬2)
}
fun 문자열정렬(strings: Array<String>, n: Int): Array<String> {

    return strings.sortedWith( compareBy<String>(){ it[n] }.thenBy({it})).toTypedArray()

}