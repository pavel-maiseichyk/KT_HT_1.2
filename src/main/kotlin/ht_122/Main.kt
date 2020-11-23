package ht_122

fun main() {
    val likes = readLine()
    if (likes!!.matches("-?\\d+(\\.\\d+)?".toRegex())) {
        val man = if (likes!!.endsWith("1") && (likes != "11")) "человеку" else "людям"
        print("Понравилось $likes $man")
    } else println("Введите число, пожалуйста)")
}