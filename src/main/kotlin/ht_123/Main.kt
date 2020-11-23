package ht_123

fun main() {
    println("Введите сумму, потраченную пользователем до покупки)")
    val moneySpentAlready = readLine()!!.toInt()
    if (moneySpentAlready >= 0) {
        println("Введите сумму самой покупки)")
        val moneyAboutToBeSpentInput = readLine()
        if (moneyAboutToBeSpentInput!!.matches("-?\\d+(\\.\\d+)?".toRegex())) {
            val moneyAboutToBeSpent = moneyAboutToBeSpentInput.toInt()
            println("Если Вы являетесь постоянным покупателем, введите 1, если нет - любой другой символ")
            val isRegularCustomer = readLine() == "1"
            if (moneyAboutToBeSpent > 0)
                when (moneySpentAlready) {
                    in 0..1000 -> {
                        val totalPrice =
                            if (isRegularCustomer) moneyAboutToBeSpent * 0.99 else moneyAboutToBeSpent
                        print(
                            "Итоговая сумма с учётом скидок:  $totalPrice"
                        )
                    }
                    in 1001..10000 -> {
                        val discountPrice = 100
                        val totalPrice =
                            if (isRegularCustomer) (moneyAboutToBeSpent - discountPrice) * 0.99 else moneyAboutToBeSpent - discountPrice
                        print(
                            "Итоговая сумма с учётом скидок: $totalPrice"
                        )
                    }
                    in 10001..Int.MAX_VALUE -> {
                        val discountPercent = 0.05
                        val totalPrice =
                            if (isRegularCustomer) moneyAboutToBeSpent * (1 - discountPercent) * 0.99 else moneyAboutToBeSpent * (1 - discountPercent)
                        print(
                            "Итоговая сумма с учётом скидок: $totalPrice"
                        )
                    }
                    else -> println("Систему не обманешь :)")
                } else println("Систему не обманешь :)")
        } else println("Систему не обманешь :)")
    } else println("Систему не обманешь :)")
}
