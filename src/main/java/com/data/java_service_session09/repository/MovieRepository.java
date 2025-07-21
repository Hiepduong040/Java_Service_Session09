package com.data.java_service_session09.repository;

import com.data.java_service_session09.model.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTitleContainingIgnoreCase(String title);
    List<Movie> findTop5ByTitleContainingIgnoreCase(String title);
}
