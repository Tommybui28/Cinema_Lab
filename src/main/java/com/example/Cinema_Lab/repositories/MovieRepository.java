package com.example.Cinema_Lab.repositories;

import com.example.Cinema_Lab.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie, Long> {
}
