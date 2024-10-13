package org.example.lesson_1

fun main() {

    val yearFlight : Int = 1961
    var hourFlight : Byte = 9
    var minuteFlight : Byte = 7



    println("Первый полет в космос совершил Ю.А. Гагарин 12 апреля")
    println("$yearFlight года")
    println("Старт корабля «Восток» состоялся")
    println("в ${hourFlight.toString().padStart(2, '0')} часов ")
    println("  ${minuteFlight.toString().padStart(2, '0')} минут")
    println(" ")
    println("После совершения одного оборота вокруг Земли спускаемый аппарат корабля совершил посадку")
    println(" ")
    hourFlight  = 10
    minuteFlight  = 55
    println("в ${hourFlight.toString().padStart(2, '0')}:${minuteFlight.toString().padStart(2, '0')} по московскому времени ")





}