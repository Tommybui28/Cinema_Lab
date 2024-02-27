package com.example.Cinema_Lab.components;

import com.example.Cinema_Lab.models.Movie;
import com.example.Cinema_Lab.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        movieRepository.save(new Movie(1, "Terminator 2" , "R", 90));
        movieRepository.save(new Movie(2, "Spider-Man: Into the Spider-Verse", "PG", 120));
        movieRepository.save(new Movie(3, "Orphan", "PG-15", 95));
        movieRepository.save(new Movie(4, "The 5th Element", "PG-13", 80));
        movieRepository.save(new Movie(5, "Scott Pilgram vs The World", "PG-13", 100));


    }
}


