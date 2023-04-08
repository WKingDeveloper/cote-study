/**
 * 연속된부분수열의합
 * https://school.programmers.co.kr/learn/courses/30/lessons/178870
 */

fun main() {
    연속된부분수열의합(intArrayOf(1, 1, 1, 2, 3, 4, 5),5)
//    연속된부분수열의합(intArrayOf(1, 2, 3, 4, 5),7)
}

fun 연속된부분수열의합(sequence: IntArray, k: Int): IntArray {
    var answer = intArrayOf(0,0)

    var minIndex = 0
    var maxIndex = 0
    var sum = sequence[0]
    var length = sequence.size

    if(sum == k){
        return answer
    }

    for(i in 1 until sequence.size){
        if(sum<=k){
            maxIndex++
            sum += sequence[maxIndex]
        }
        while(sum>k){
            sum -= sequence[minIndex]
            minIndex++
        }

        if(sum == k && (maxIndex-minIndex) < length){
            answer[0] = minIndex
            answer[1] = maxIndex
            length = maxIndex-minIndex
        }

    }


    return answer
}
