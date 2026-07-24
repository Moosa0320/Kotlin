fun sumUpTo(num: Int): Int {
    if (num == 0) {
        return 0          // base case: 0 tak sum = 0
    }
    return num + sumUpTo(num - 1)   // recursive case: current number + baaki sum
}

fun main() {
    println(sumUpTo(4))    // 10  (1+2+3+4)
    println(sumUpTo(10))   // 55  (1+2+3+...+10)
}