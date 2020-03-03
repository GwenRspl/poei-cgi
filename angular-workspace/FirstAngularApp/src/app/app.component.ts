import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {
  title = 'The best app in the whole world';
  isAuth = false;
  appareils = ['aspirateur', 'micro-onde', 'four', 'lave-vaisselle'];
  username = 'Gwen';
  lastName = 'Rspl';

  constructor() {
    setTimeout(
      () => {
        this.isAuth = true;
      }, 4000
    );
  }

  onAllumer() {
    console.log('On allume tout !');
  }

  onRatingUsername(eventValue: string) {
    this.username = eventValue;
  }

  onRatingLastName(eventValue: string) {
    this.lastName = eventValue;
  }
}
