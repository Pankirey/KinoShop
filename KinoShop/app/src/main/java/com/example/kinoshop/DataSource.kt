package com.example.kinoshop

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<Movie>{
            val list = ArrayList<Movie>()
            list.add(
                Movie(
                    "Бладшот",
                    2020,
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png",
                    "China, United States of America",
                    genre = "Боевик, Фантастика"
                )
            )
            list.add(
                Movie(
                    "Вперед",
                    2020,
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png",
                    "United States of America",
                    genre = "Мультфильм, Семейный"
                )
            )
            list.add(
                Movie(
                    "Джентельмены",
                    2019,
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png",
                    "United Kingdom, United States of America",
                    genre = "Боевик, Комедия"
                )
            )
            list.add(
                Movie(
                    "Побег из Претории",
                    2020,
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png",
                    "Australia, United Kingdom",
                    genre = "Триллер, Детектив"
                )
            )

            return list
        }
    }
}