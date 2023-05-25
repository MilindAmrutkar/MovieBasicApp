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
            plot = "On the lush alien world of Pandora live the Na'vi, beings who appear primitive but are highly evolved. Because the planet's environment is poisonous, human/Na'vi hybrids, called Avatars, must link to human minds to allow for free movement on Pandora. Jake Sully (Sam Worthington), a paralyzed former Marine, becomes mobile again through one such Avatar and falls in love with a Na'vi woman (Zoe Saldana). As a bond with her grows, he is drawn into a battle for the survival of her world.",
            poster = "https://lumiere-a.akamaihd.net/v1/images/avatar_800x1200_208c9665.jpeg?region=0%2C0%2C800%2C1200",
            images = listOf(
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fsixactstructure.com%2Fstory-structure-analysis-avatar%2F&psig=AOvVaw1SNYLv1CsX1HYI7UsmUM_t&ust=1685123132863000&source=images&cd=vfe&ved=2ahUKEwjvopX_gpH_AhW0bmwGHTJ3D1gQjRx6BAgAEAw",
                "https://images-na.ssl-images-amazon.com/images/I/51wYAC4gG3L.jpg",
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fthemoviespoiler.com%2Fmovies%2Favatar%2F&psig=AOvVaw3VAKaMQmaN2wSSdPdPxQ0L&ust=1685123134022000&source=images&cd=vfe&ved=2ahUKEwiPh9z_gpH_AhVTa2wGHYABCTEQjRx6BAgAEAw",
                "https://static1.moviewebimages.com/wordpress/wp-content/uploads/2022/09/Avatar-movie-from-James-Cameron.jpg"
            ),
            rating = "7.9"
        ),
        Movie(
            id = "tt0499550",
            title = "Kal Ho Na Ho",
            year = "2004",
            genre = "Action, Adventure, Fantasy",
            director = "Karan Johar",
            actors = "Shahrukh Khan",
            plot = " Naina Catherine Kapur (Preity Zinta) is an angry young girl, for more than one reason. Her father committed suicide when she needed him the most, leaving her mother Jennifer (Jaya Bachchan) to raise their two young children Shiv (Atith Naik) & Gia (Jhanak Shukla) all alone.",
            poster = "https://upload.wikimedia.org/wikipedia/en/4/45/Kal_Ho_Naa_Ho.jpg",
            images = listOf(
                "https://upload.wikimedia.org/wikipedia/en/4/45/Kal_Ho_Naa_Ho.jpg",
                "https://m.media-amazon.com/images/M/MV5BYmVjNDIxODAtNWZiZi00ZDBlLWJmOTUtNDNjMGExNTViMzE1XkEyXkFqcGdeQXVyNTE0MDc0NTM@._V1_FMjpg_UX1000_.jpg",
                "https://i.ytimg.com/vi/tVMAQAsjsOU/maxresdefault.jpg",
                "https://stat4.bollywoodhungama.in/wp-content/uploads/2016/03/Kal-Ho-Naa-Ho-306x393.jpg"
            ),
            rating = "7.9"
        )
    )
}
