import { Component } from '@angular/core';
import { GameListComponent } from './components/game-list/game-list.component';

@Component({
  selector: 'app-root',
  template: `<app-game-list></app-game-list>`,
  styleUrls: ['./app.component.scss'],
  standalone: true,
  imports: [GameListComponent]
})
export class AppComponent {
  title = 'game-score-app';
}
