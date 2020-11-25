package ht_121

fun main() {
    println("День добрый, введите сумму перевода)")
    val input = readLine()
    if (input!!.matches("-?\\d+(\\.\\d+)?".toRegex())) {
        val inputPrice: Double = input.toDouble()
        val commissionPercent = 0.75
        if (inputPrice * commissionPercent >= 35.0) {
            val commissionPrice = commissionPercent.times(inputPrice) / 100
            println(
                    """Комиссия будет составлять $commissionPrice
Хорошего дня)"""
            )
        } else {
            val commissionPrice = 35
            println(
                    """Комиссия будет составлять $commissionPrice
Хорошего дня)""")
        }
    } else println("Введите число, пожалуйста)")
}