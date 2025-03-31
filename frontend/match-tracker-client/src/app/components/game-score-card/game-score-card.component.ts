import { Component, Input } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatCardModule } from '@angular/material/card';
import { MatDialogModule } from '@angular/material/dialog';
import { Game } from '../../models/game.model';
import { GameDetailsComponent } from '../game-details/game-details.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-game-score-card',
  templateUrl: './game-score-card.component.html',
  styleUrls: ['./game-score-card.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    MatCardModule,
    MatDialogModule
  ]
})
export class GameScoreCardComponent {
  @Input() game: any;

  constructor(private dialog: MatDialog) {}

  openDetails() {
    this.dialog.open(GameDetailsComponent, {
      width: '500px',
      data: this.game
    });
  }
}