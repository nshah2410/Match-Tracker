import { Component, OnInit, OnDestroy } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { GameService } from '../../services/game.service';
import { Game } from '../../models/game.model';
import { Subscription } from 'rxjs';
import { GameScoreCardComponent } from '../game-score-card/game-score-card.component';

@Component({
  selector: 'app-game-list',
  templateUrl: './game-list.component.html',
  styleUrls: ['./game-list.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    MatProgressSpinnerModule,
    GameScoreCardComponent
  ]
})
export class GameListComponent implements OnInit, OnDestroy {
  games: Game[] = [];
  loading = true;
  error = '';
  private gamesSubscription: Subscription = new Subscription();

  constructor(private gameService: GameService) { }

  ngOnInit(): void {
    this.loadGames();
  }

  loadGames(): void {
    this.loading = true;
    this.gamesSubscription.add(
      this.gameService.getAllGames().subscribe({
        next: (data) => {
          this.games = data;
          this.loading = false;
        },
        error: (err) => {
          this.error = 'Failed to load games. ' + err.message;
          this.loading = false;
        }
      })
    );
  }

  initializeData(): void {
    this.gamesSubscription.add(
      this.gameService.initializeData().subscribe({
        next: () => {
          alert('Test data initialized successfully');
          this.loadGames();
        },
        error: (err) => {
          this.error = 'Failed to initialize data. ' + err.message;
        }
      })
    );
  }

  ngOnDestroy(): void {
    this.gamesSubscription.unsubscribe();
  }
}