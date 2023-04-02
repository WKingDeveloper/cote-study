import java.util.*

/**
 * 뒷큰수
 * https://school.programmers.co.kr/learn/courses/30/lessons/154539
 */

fun main() {
    뒷큰수(intArrayOf(9, 1, 5, 3, 6, 2))
}

fun 뒷큰수(numbers: IntArray): IntArray {
    val n = numbers.size
    val answer = IntArray(n) { -1 }
    val stack = Stack<Int>()

    for (i in 0 until n) {
        while (stack.isNotEmpty() && numbers[stack.peek()] < numbers[i]) {
            answer[stack.pop()] = numbers[i]
        }
        stack.push(i)
    }

    return answer
}


/*
var answer = mutableListOf<Int>()

for(i in 0 until numbers.size-1){
    var num = -1
    for(j in i+1 .. numbers.size-1){
        if(numbers.get(i)<numbers.get(j)){
            num = numbers.get(j)d
            break
        }
    }
    answer.add(num)
}
answer.add(-1)
return answer.toIntArray()*/
