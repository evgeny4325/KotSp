package org.example.lesson_1

fun main() {

    val newOrderNumber: Int = 75
    val thankYou: String = "Спасибо за покупку!"

    println("Номер вашего заказа $newOrderNumber. $thankYou")

    val numberOfWorkers: Int = 2000
    val numberOfDismissed: Int = 1

    println("В нашем магазине для Вас работают ${numberOfWorkers-numberOfDismissed} сотрудников")

}