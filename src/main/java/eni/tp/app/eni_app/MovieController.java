package eni.tp.app.eni_app;

import eni.tp.app.eni_app.bll.MovieManager;
import eni.tp.app.eni_app.bo.Movie;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@SessionAttributes({"loggedUser"})
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

    @GetMapping("movie-detail/{id}")
    public String movieDetail(@PathVariable("id") long id, Model model) {
        // Récupérer le film par son id
        Movie movie = movieManager.getById(id);

        // Si le film est null (donc n'existe pas)
        if (movie == null) {

            return "page-erreur";
        }

        // Envoyer le film dans la vue donc le modèle
        model.addAttribute("movie", movie);
        // Envoyer la note maximale
        List<Integer> maxStars = Arrays.asList(1, 2, 3, 4, 5);
        model.addAttribute("maxStars", maxStars);

        return "movie-detail";
    }

    @GetMapping({"movie-form/{id}", "movie-form"})
    public String movieForm(@PathVariable(required = false) Long id, Model model) {
        // Instancier un film par défaut
        Movie movie = new Movie();

        //s'il y a un id on récupère le film avec l'id
        if (id != null) {
            movie = movieManager.getById(id);
        }

        // Envoyer le film dans le model
        model.addAttribute("movie", movie);

        return "movie-form-page";
    }

    @PostMapping("movie-form")
    public String postMovieForm(@Valid @ModelAttribute Movie movie, BindingResult bindingResult) {
        // Plus tard on aura besoin
        /*
        if (bindingResult.hasErrors()){
        }
        */
        movieManager.save(movie);

        return "movie-form-page";
    }

}
