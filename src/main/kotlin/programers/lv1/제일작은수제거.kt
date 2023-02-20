/**
 * 제일 작은 수 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */

fun 제일작은수제거(arr: IntArray): IntArray {

    if(arr.size==1){
        return IntArray(1){-1}
    }

    var list = mutableListOf<Int>()
    var min = arr[0];
    for(i in arr){
        if(min>=i){
            min = i
        }
        list.add(i)
    }

    list.remove(min)

    return list.toIntArray()
}
