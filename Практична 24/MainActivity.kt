package com.example.movies

import java.util.Calendar

class Cinema(
    private val title: String,
    private val director: String,
    private val releaseYear: Int,
    private val duration: Int,
    private val ticketPrice: Double,
    private val showTime: Calendar,
    private val showDate: Calendar
) {
    fun displayMovieDetails() {
        println("Фільм: $title")
        println("Режисер: $director")
        println("Рік випуску: $releaseYear")
        println("Тривалість: $duration хвилин")
        println("Ціна квитка: $ticketPrice грн")
        println("Час показу: ${showTime.get(Calendar.HOUR_OF_DAY)}:${showTime.get(Calendar.MINUTE)}")
        println("Дата показу: ${showDate.get(Calendar.DAY_OF_MONTH)}.${showDate.get(Calendar.MONTH) + 1}.${showDate.get(Calendar.YEAR)}")
    }
}

fun main() {
    val showTime = Calendar.getInstance()
    showTime.set(Calendar.HOUR_OF_DAY, 18)
    showTime.set(Calendar.MINUTE, 30)

    val showDate = Calendar.getInstance()
    showDate.set(2023, 9, 9)

    val movie = Cinema(
        "Оппенгеймер",
        "Крістофер Нолан",
        2023,
        180,
        160.0,
        showTime,
        showDate
    )

    println("Інформація про фільм:")
    movie.displayMovieDetails()
}