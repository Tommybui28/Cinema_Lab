// ignore this

//package com.example.Cinema_Lab.repositories;
//
//import org.springframework.stereotype.Repository;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Random;
//
//@Repository
//public class MovieList {
//    private List<String> title;
//    private List<? extends Number> rating;
//    private List<Integer> duration;
//
//    public MovieList() {
//        this.title = Arrays.asList(
//                "Terminator 2",
//                "Unstoppable (2010)",
//                "Spider-Man: Into the Spider-Verse",
//                "Spider-Man: Across the Spider-Verse",
//                "Orphan",
//                "Good Will Hunting",
//                "The 5th Element",
//                "Scott Pilgrim vs The World",
//                "Eternal Sunshine of the Spotless Mind"
//
//        );
//        this.rating = Arrays.asList(
//                9,
//                8,
//                10,
//                9.9,
//                9.2,
//                9.5,
//                8.7,
//                8.9,
//                9.5
//        );
//        this.duration = Arrays.asList(
//                90,
//                95,
//                100,
//                120,
//                95,
//                100,
//                85,
//                120,
//                90
//        );
//
//    }
//
//    public String getRandomMovie() {
//        Random random = new Random();
//        int randomTIndex = random.nextInt(this.title.size());
//        return this.title.get(randomTIndex);
//    }
//}