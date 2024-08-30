package eni.tp.app.eni_app.dao;

import eni.tp.app.eni_app.bo.Movie;

import java.util.List;

public interface IDAOMovie {
    List<Movie> findAll();
    Movie findById(long id);
    void save(Movie movie);
//    void deleteById(int id);
}
