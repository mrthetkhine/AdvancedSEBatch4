import { of,from, every,pipe,zip } from "rxjs";
let observable = from<any>([1,2,3,4,5]);//producer
let observable2 = from<any>(["one","two","three"]);
let obs3 = zip(observable,observable2);
obs3.subscribe({
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