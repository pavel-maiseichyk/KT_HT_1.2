package ht_121

fun main() {
    println("День добрый, введите сумму перевода)")
    val input = readLine()
    if (input!!.matches("-?\\d+(\\.\\d+)?".toRegex())) {
        val inputPrice: Double = input.toDouble()
        if (inputPrice >= 35.0) {
            val commissionPercent = 0.75
            val commissionPrice = commissionPercent.times(inputPrice) / 100
            println(
                """Комиссия будет составлять $commissionPrice
Хорошего дня)"""
            )
        } else println(
            """Сумма должна быть больше, чем 35 рублей...
Попробуйте ещё раз)"""
        )
    } else println("Введите число, пожалуйста)")
}