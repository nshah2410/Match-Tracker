package com.sportsapp.matchtracker.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportsapp.matchtracker.Model.Match;
import com.sportsapp.matchtracker.Repository.MatchRepository;
import com.sportsapp.matchtracker.Service.MatchService;


@RestController
@RequestMapping("/api/matches")
@CrossOrigin(origins = "http://localhost:4200")
public class MatchController {

    @Autowired
    private MatchRepository matchRepository;
    
    @Autowired
    private MatchService matchService;
    
    @GetMapping
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Match> getMatchById(@PathVariable Long id) {
        Optional<Match> match = matchRepository.findById(id);
        if (match.isPresent()) {
            return ResponseEntity.ok(match.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/initialize")
    public ResponseEntity<String> initializeData() {
        matchService.initializeTestData();
        return ResponseEntity.ok("Test data initialized");
    }
}