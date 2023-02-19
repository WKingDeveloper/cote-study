/**
 * 가운데글자
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903?language=kotlin
 */

fun 가운데글자(s: String): String {
    val halfNum = s.length/2
    if(s.length%2==0){
        return s.substring(halfNum-1..halfNum)
    } else {
        return s.substring(halfNum until halfNum+1)
    }

}