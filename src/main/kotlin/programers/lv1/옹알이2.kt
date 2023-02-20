/**
 * 옹알이2
 * https://school.programmers.co.kr/learn/courses/30/lessons/133499
 */

fun main() {
    val result = 옹알이2(arrayOf("aya", "yee", "u","maa"))
    println(result)
}

fun 옹알이2(babbling: Array<String>): Int {

    var sum = 0
    for(word in babbling){
        //
        if(word.contains("ayaaya") || word.contains("yeye")
            ||word.contains("woowoo") || word.contains("mama")){
            continue
        }


        val str = word.replace("aya".toRegex(), " ")
            .replace("ye".toRegex(), " ")
            .replace("woo".toRegex(), " ")
            .replace("ma".toRegex(), " ")

        if(str.replace(" ".toRegex(),"").equals("")){
            sum++
        }
    }
    return sum

}