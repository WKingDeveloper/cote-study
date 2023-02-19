/**
 * 이상한문자만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */
fun main(args: Array<String>) {
    val 이상한문자만들기 = 이상한문자만들기("  tRY  HeLLO wOrLD ")
    println(이상한문자만들기)
}
fun 이상한문자만들기(s: String): String {
    var answer = ""
    var split = s.split(" ")
    for(word in split){

        var num = 1

        for(c in word){
            if(num%2==0){
                answer += c.lowercaseChar()
            } else {
                answer += c.uppercaseChar()
            }
            num++
        }
        answer += " "
    }
    return answer.substring(0 until  answer.length-1)
}