/**
 * N개의최소공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12953
 */

fun N개의최소공배수(arr: IntArray): Int {
    var answer = arr.maxOf { it }
    while (true){
        var valid = true
        for(i in arr){
            if(answer%i != 0){
                valid = false
                ++answer
                break
            }
        }

        if(valid){
            break
        }
    }
    return answer
}
