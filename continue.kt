//The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

//This example skips the value of 4:
fun main() {
    var i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++   
    }
}