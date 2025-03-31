package com.sportsapp.matchtracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportsapp.matchtracker.Model.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
}