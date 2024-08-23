package eni.tp.app.eni_app.dao;

import eni.tp.app.eni_app.bo.Movie;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DAOMovieMock implements IDAOMovie {
    private List<Movie> movies = new ArrayList<>();

    public DAOMovieMock() {
        // Ajoute quelques films de test
        movies.add(new Movie(1, "Inception", 2010, 148, "A mind-bending thriller about dreams within dreams."));
        movies.add(new Movie(2, "The Matrix", 1999, 136, "A computer hacker learns about the true nature of reality."));
        movies.add(new Movie(3, "The Lost Horizon", 2018, 134, "A group of explorers embarks on a journey to uncover the mysteries of a forgotten civilization, hidden deep within the Himalayan mountains. As they delve deeper, they discover secrets that could change the course of history."));
        movies.add(new Movie(4, "Neon Skies", 2021, 148, "In a futuristic city where neon lights paint the sky, a detective must solve a series of mysterious disappearances. As he uncovers the truth, he finds himself entangled in a web of corruption, power, and deception."));
        movies.add(new Movie(5, "Echoes of the Past", 2019, 121, "A historian discovers a series of letters that lead him on a quest to uncover the truth about a legendary artifact. As he follows the clues, he must confront dark secrets from his own family's past."));
    }

    @Override
    public List<Movie> findAll() {
        return movies;
    }

//    @Override
//    public Movie findById(int id) {
//        for (Movie movie : movies) {
//            if (movie.getId() == id) {
//                return movie;
//            }
//        }
//        return null;
    @Override
   public Movie findById(int id) {
       return movies.stream().filter(movie -> movie.getId() == id).findFirst().orElse(null);
    }
}

