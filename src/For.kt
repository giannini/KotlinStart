/**
 *
 * @author jiangningyu
 * @date   2017/11/6
 */

fun main(args: Array<String>) {
    var array = arrayOf(1, 2, 3)
    for (i in array.indices) {
        print(array[i])
    }
    println()

    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }

    println("sum facet(1~10): " + sumFacet(10))
}

fun sumFacet(n: Int): Int {
    var sum = 0;

    for (i in 1..n) {
        sum += facet(i)
    }

    return sum
}