package com.backtocding.moviebasicapp.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String
)

fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            id = "tt0499549",
            title = "Avatar",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam ",
            plot = "abjalsdfjkla ew asdjfla lsdjf lsf",
            poster = "https://lumiere-a.akamaihd.net/v1/images/avatar_800x1200_208c9665.jpeg?region=0%2C0%2C800%2C1200",
            images = listOf("https://www.shutterstock.com/image-vector/online-cinema-art-movie-watching-260nw-584655766.jpg", "https://lumiere-a.akamaihd.net/v1/images/avatar_800x1200_208c9665.jpeg?region=0%2C0%2C800%2C1200"),
            rating = "7.9"
        ),
        Movie(
            id = "tt0499550",
            title = "Kal Ho Na Ho",
            year = "2004",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam ",
            plot = "abjalsdfjkla ew asdjfla lsdjf lsf",
            poster = "https://lumiere-a.akamaihd.net/v1/images/avatar_800x1200_208c9665.jpeg?region=0%2C0%2C800%2C1200",
            images = listOf("https://www.shutterstock.com/image-vector/online-cinema-art-movie-watching-260nw-584655766.jpg", "https://lumiere-a.akamaihd.net/v1/images/avatar_800x1200_208c9665.jpeg?region=0%2C0%2C800%2C1200"),
            rating = "7.9"
        )
    )
}
