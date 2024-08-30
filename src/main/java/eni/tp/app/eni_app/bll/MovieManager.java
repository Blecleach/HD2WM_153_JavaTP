package eni.tp.app.eni_app.bll;

import eni.tp.app.eni_app.bo.Movie;
import eni.tp.app.eni_app.dao.IDAOMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieManager {

    @Autowired
    private IDAOMovie movieDAO;

    public List<Movie> getAllMovies() {
        return movieDAO.findAll();
    }

    public Movie getById(@Qualifier("DAOMovieMySQL")long id) {
        return movieDAO.findById(id);
    }
    public void save(Movie movie) {
        movieDAO.save(movie);
    }
}

