package com.sportsapp.matchtracker.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "matches")
public class Match {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String homeTeam;
    private String awayTeam;
    private String homeTeamLogo;
    private String awayTeamLogo;
    private int homeScore;
    private int awayScore;
    private int homePossession;
    private int awayPossession;
    private int homeFouls;
    private int awayFouls;
    private int homeShots;
    private int awayShots;
    
    // Constructors
    public Match() {}
    
    public Match(String homeTeam, String awayTeam, String homeTeamLogo, String awayTeamLogo,
                int homeScore, int awayScore, int homePossession, int awayPossession,
                int homeFouls, int awayFouls, int homeShots, int awayShots) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamLogo = homeTeamLogo;
        this.awayTeamLogo = awayTeamLogo;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.homePossession = homePossession;
        this.awayPossession = awayPossession;
        this.homeFouls = homeFouls;
        this.awayFouls = awayFouls;
        this.homeShots = homeShots;
        this.awayShots = awayShots;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getHomeTeam() {
        return homeTeam;
    }
    
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }
    
    public String getAwayTeam() {
        return awayTeam;
    }
    
    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }
    
    public String getHomeTeamLogo() {
        return homeTeamLogo;
    }
    
    public void setHomeTeamLogo(String homeTeamLogo) {
        this.homeTeamLogo = homeTeamLogo;
    }
    
    public String getAwayTeamLogo() {
        return awayTeamLogo;
    }
    
    public void setAwayTeamLogo(String awayTeamLogo) {
        this.awayTeamLogo = awayTeamLogo;
    }
    
    public int getHomeScore() {
        return homeScore;
    }
    
    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }
    
    public int getAwayScore() {
        return awayScore;
    }
    
    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }
    
    public int getHomePossession() {
        return homePossession;
    }
    
    public void setHomePossession(int homePossession) {
        this.homePossession = homePossession;
    }
    
    public int getAwayPossession() {
        return awayPossession;
    }
    
    public void setAwayPossession(int awayPossession) {
        this.awayPossession = awayPossession;
    }
    
    public int getHomeFouls() {
        return homeFouls;
    }
    
    public void setHomeFouls(int homeFouls) {
        this.homeFouls = homeFouls;
    }
    
    public int getAwayFouls() {
        return awayFouls;
    }
    
    public void setAwayFouls(int awayFouls) {
        this.awayFouls = awayFouls;
    }
    
    public int getHomeShots() {
        return homeShots;
    }
    
    public void setHomeShots(int homeShots) {
        this.homeShots = homeShots;
    }
    
    public int getAwayShots() {
        return awayShots;
    }
    
    public void setAwayShots(int awayShots) {
        this.awayShots = awayShots;
    }
}