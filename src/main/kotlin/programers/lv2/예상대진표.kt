/**
 * 예상대진표
 * https://school.programmers.co.kr/learn/courses/30/lessons/12985
 */

fun main() {
    val 예상대진표 = 예상대진표(4, 3, 4)
    println("예상대진표 = ${예상대진표}")
}

fun 예상대진표(n: Int, a: Int, b: Int): Int {



    var answer = 0
    var min = a
    var max = b

    if(a>b){
        min = b
        max = a
    }

    if(min%2!=0 && max-min == 1){
        return 1
    }

    while (true){
        ++answer
        if(min%2 == 1){
            min = min/2 + 1
        } else{
            min = min/2
        }

        if(max%2 == 1){
            max = max/2 + 1
        } else{
            max = max/2
        }
        if(min%2!=0 && max-min == 1){
            break
        }
    }


    return answer+1
}
