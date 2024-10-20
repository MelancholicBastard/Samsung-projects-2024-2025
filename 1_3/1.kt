fun String.isValidCCNumber(): Boolean {
    val length: Int = this.length - 1
    var iter: Int = 0
    var sum: Int = 0

    for (i in 0..length) {
        if (this[i].isDigit()) {

            if (iter % 2 == 0) {
                val result = this[i].digitToInt() * 2
                sum += result % 10 + result / 10 % 10
            }
            else {
                sum += this[i].digitToInt()
            }

            iter++
        }
    }

    return sum % 10 == 0
}