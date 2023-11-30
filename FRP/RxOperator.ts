import { of,from, interval } from "rxjs";
let observable;
//= from([1,2,3]);//producer
observable = interval(1000);
observable.subscribe({
      next(x) {
        console.log('got value ' + x);
      },
      error(err) {
        console.error('something wrong occurred: ' + err);
      },
      complete() {
        console.log('done');
      },
});
console.log('End of line');