/**
 *
 * @author: jiangningyu
 * @date: 2017/11/2
 */

/**
 * when循环类似于java中的switch-case
 */

fun casesWhen(obj: Any?) {
    when (obj) {
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> println("${obj} ===> 这是一个0-9之间的数字")
        "hello" -> println("${obj} ===> 这个是字符串hello")
        is Char -> println("${obj} ===> 这是一个 Char 类型数据")
        else -> println("${obj} ===> else类似于Java中的 case-switch 中的 default")
    }
}

fun main(args: Array<String>) {
    casesWhen(1)
    casesWhen("hello")
    casesWhen('X')
    casesWhen(null)

    inOrNotIn(1)
    inOrNotIn(12)
    inOrNotIn(30)
}

fun inOrNotIn(x: Int) {
    val validNumbers = arrayOf(11, 12, 13)
    when (x) {
        in 1..10 -> println("${x} is in the range")
        in validNumbers -> println("${x} is valid")
        !in 10..20 -> println("${x} is outside the range")
        else -> println("${x} none of the above")
    }
}

/**
 * 阶乘 n!= n*(n-1)*(n-2)...*2*1
 */
fun facet(x: Int): Int {
    var result = 1
    when (x) {
        0, 1 -> result = 1
        else -> result = x * facet(x - 1)
    }
    return result
}
