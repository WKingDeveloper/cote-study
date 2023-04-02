/**
 * 튜플
 * https://school.programmers.co.kr/learn/courses/30/lessons/64065
 */

fun main() {
//    튜플("{{2},{2,1},{2,1,3},{2,1,3,4}}");
//    튜플("{{4,2,3},{3},{2,3,4,1},{2,3}}");
    튜플("{{20,111},{111}}");
}

fun 튜플(s: String): IntArray {
    var answer = mutableListOf<Int>()

    var listString = ""
    listString = s.substring(1,s.length-1)

    var list = mutableListOf<Int>()
    var map = mutableMapOf<Int,List<Int>>()
    var num = 0
    var tmpNum = ""
    var isGroup = false

    for(c in listString){

        if(c=='{'){
            num = 0
            list = mutableListOf<Int>()
            isGroup = true
            continue
        } else if(c==',') {
            if(isGroup){
                list.add(tmpNum.toInt())
                tmpNum=""
                num++
            }
            continue
        } else if(c=='}'){
            list.add(tmpNum.toInt())
            tmpNum=""
            num++

            map[num] = list
            isGroup = false
            continue
        } else{
            tmpNum += c
        }
    }

    map[1]?.let { answer.add(0, it.get(0)) }

    for(i in 2 .. map.size){
        for(j in map[i]?: arrayListOf()){
            if(answer.contains(j)){
                continue
            }
            answer.add(i-1,j)
        }
    }


    return answer.toIntArray()
}
