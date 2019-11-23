
fun main() {
    print("Enter Number of Rows: ")

    val number = Integer.valueOf(readLine())
        printDiamondShape(number)

}

fun printDiamondShape(rows: Int) {
    var i: Int
    var j: Int
    val num: Int
    var k = 0
    num = (rows + 1) / 2

    i = 1
    while (i <= rows) {

        if (rows % 2 == 0) {

            if (i <= num) k++
            if (i > num + 1) k--
        } else {

            if (i <= num) k++ else k--

        }

        j = 1
        while (j <= rows) {

            if (j >= num + 1 - k && j <= num - 1 + k)

                print("*")
            else

                print(" ")
            j++

        }

        println()
        i++

    }
}
