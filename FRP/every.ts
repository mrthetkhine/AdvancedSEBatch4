import { of,from, every,pipe } from "rxjs";
let observable = from([11,2,3,4,5]);//producer

let obs2 = observable.pipe(every(x=> x < 10));
obs2.subscribe({
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