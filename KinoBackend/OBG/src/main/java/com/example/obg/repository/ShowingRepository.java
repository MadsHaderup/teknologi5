package com.example.obg.repository;

import com.example.obg.model.Showing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface ShowingRepository extends JpaRepository<Showing, Integer> {
    @Query(value = "SELECT * FROM kinoMovies.showing " +
                "where showing_date = :date", nativeQuery = true)
    List<Showing> findByShowingDate(Date date);
}
