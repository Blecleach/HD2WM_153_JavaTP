package eni.tp.app.eni_app;

import eni.tp.app.eni_app.bll.MovieManager;
import eni.tp.app.eni_app.bo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieManager movieManager;

    @GetMapping("Accueil")
    public String home() {
        return "index";
    }

    @GetMapping("Liste")
    public String listMovies(Model model) {
        List<Movie> movies = movieManager.getAllMovies();
        model.addAttribute("movies", movies);
        //envoyer note maximale
        List<Integer> maxStars = Arrays.asList(1, 2, 3, 4, 5);
        model.addAttribute("maxStars", maxStars);

        return "movies-list";
    }

    @GetMapping("/moviedetail/{id}")
    public String movieDetails(@PathVariable int id, Model model) {
        Movie movie = movieManager.getMovieById(id);
        if (movie == null) {
                        return "redirect:/Error";
        }
        model.addAttribute("movie", movie);
        return "movie-detail";
    }
    @GetMapping("Error")
    public String Accueil() {
        return "page-erreur";
    }
}

