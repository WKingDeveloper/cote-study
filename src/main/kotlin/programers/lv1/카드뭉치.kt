/**
 * 카드뭉치
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994
 */

fun main() {
    val 카드뭉치 = 카드뭉치(arrayOf("a","apple","is",), arrayOf("a","apple"), arrayOf("a","apple","is","a","apple"))
    println("카드뭉치 = ${카드뭉치}")
}

fun 카드뭉치(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {

    var goalList = mutableListOf<String>(*goal)
    var card1List = mutableListOf<String>(*cards1)
    var card2List = mutableListOf<String>(*cards2)

    while (goalList.size>0){
        var card1Result = false;
        var card2Result = false;
        if(card1List.size>0){
            card1Result = card1List.removeContainsIndex(goalList)
        }
        if(card2List.size>0){
            card2Result = card2List.removeContainsIndex(goalList)
        }
        if(!card1Result && !card2Result){
            return "No"
        }
    }

    return "Yes"
}

fun MutableList<String>.removeContainsIndex(list : MutableList<String>) : Boolean{
    var num = 0;
    for(i in 0 until  this.size) {
        if(list.get(0) == this.get(0)){
            num++
            list.removeAt(0)
            this.removeAt(0)
        } else{
            break
        }
    }
    return if(num==0) false else true
}
