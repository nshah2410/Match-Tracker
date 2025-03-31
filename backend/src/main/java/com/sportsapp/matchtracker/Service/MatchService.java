package com.sportsapp.matchtracker.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsapp.matchtracker.Model.Match;
import com.sportsapp.matchtracker.Repository.MatchRepository;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;
    
    public void initializeTestData() {
        // Clear existing data
        matchRepository.deleteAll();
        
        // Add sample matches
        matchRepository.save(new Match(
            "Manchester United",
            "Liverpool",
            "https://upload.wikimedia.org/wikipedia/en/7/7a/Manchester_United_FC_crest.svg",
            "https://upload.wikimedia.org/wikipedia/en/0/0c/Liverpool_FC.svg",
            2, 1, 45, 55, 12, 8, 14, 11
        ));
        
        matchRepository.save(new Match(
            "Real Madrid",
            "Barcelona",
            "https://upload.wikimedia.org/wikipedia/en/5/56/Real_Madrid_CF.svg",
            "https://upload.wikimedia.org/wikipedia/en/4/47/FC_Barcelona_%28crest%29.svg",
            3, 3, 52, 48, 10, 14, 15, 13
        ));
        
        matchRepository.save(new Match(
            "Bayern Munich",
            "Borussia Dortmund",
            "https://upload.wikimedia.org/wikipedia/commons/1/1b/FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg",
            "https://upload.wikimedia.org/wikipedia/commons/6/67/Borussia_Dortmund_logo.svg",
            4, 1, 65, 35, 6, 11, 18, 7
        ));
    }
}