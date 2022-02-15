package com.example.myinterviewmanagementsystem2.repository;

import com.example.myinterviewmanagementsystem2.model.Interviewee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InterVieweeRepository extends JpaRepository<Interviewee, Long> {
    @Query("SELECT u FROM Interviewee u WHERE u.univ = :university")
    public Interviewee findbyUniversity(@Param("university") String username);

    @Query("SELECT u FROM Interviewee u WHERE u.ssc_yr = :year")
    public Interviewee findbySSCYear(@Param("university") String year);

    }

    // so on
}
