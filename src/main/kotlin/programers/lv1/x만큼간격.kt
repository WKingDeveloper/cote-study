/**
 * x만큼 간격이 있는 n개의 숫자
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */

fun x만큼간격(x: Int, n: Int): LongArray {

    var list = mutableListOf<Long>()

    if(x>0){
        for(n in x .. x*n.toLong() step x.toLong()){
            list.add(n.toLong())
        }
    } else if(x<0){
        for(n in x*n.toLong() .. x step (x*-1).toLong()){
            list.add(0,n.toLong())
        }
    } else{
        return LongArray(n){0}
    }


    return list.toLongArray()
}