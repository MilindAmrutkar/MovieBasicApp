package com.backtocding.moviebasicapp.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.backtocding.moviebasicapp.model.Movie
import com.backtocding.moviebasicapp.model.getMovies
import com.backtocding.moviebasicapp.navigation.MovieScreens
import com.backtocding.moviebasicapp.widgets.MovieRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                scrollBehavior = scrollBehavior,
//                    navigationIcon = {
//                        IconButton(onClick = { }) {
//                            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu Icon")
//                        }
//                    },
                title = {
                    Text(text = "Movies")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(5.dp)
                )
            )
        },
        content = {
            MainContent(
                navController = navController,
                modifier = Modifier.padding(top = it.calculateTopPadding())
            )
        }
    )
}


@Composable
fun MainContent(
    navController: NavController,
    modifier: Modifier,
    moviesList: List<Movie> = getMovies()
) {
    Column(
        modifier = modifier.padding(
            12.dp
        )
    ) {
        LazyColumn {
            items(items = moviesList) {
                MovieRow(movie = it) { movie ->
                    navController.navigate(route = MovieScreens.DetailsScreen.name+"/$movie")
                }
            }
        }
    }
}