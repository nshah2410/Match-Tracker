import { Component, Inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MAT_DIALOG_DATA, MatDialogRef, MatDialogModule } from '@angular/material/dialog';
import { Game } from '../../models/game.model';

@Component({
  selector: 'app-game-details',
  templateUrl: './game-details.component.html',
  styleUrls: ['./game-details.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    MatDialogModule
  ]
})
export class GameDetailsComponent {
  constructor(
    public dialogRef: MatDialogRef<GameDetailsComponent>,
    @Inject(MAT_DIALOG_DATA) public game: Game
  ) {}
}