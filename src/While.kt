/**
 *
 * @author jiangningyu
 * @date   2017/11/6
 */

fun main(args: Array<String>) {
    var x = 10
    while (x > 0) {
        x--
        println(x)
    }

    var y = 10
    do {
        y += 1
        println(y)
        if (y == 12) {
            break
        } else if (y == 11) {
            println("ok")
            continue
        }
    } while (y < 20) // y的作用域包含此处

}