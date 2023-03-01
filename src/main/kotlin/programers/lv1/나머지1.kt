/**
 * 나머지가 1이되는 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */

fun 나머지1(n: Int): Int {
    for(i in 2 until n){
        if(n%i==1){
            return i
        }
    }
    return 0
}
