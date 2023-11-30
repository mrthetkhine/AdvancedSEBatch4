import { of,from,filter, find,pipe,map, reduce } from "rxjs";
let observable = from([11,6,2,3,4,5]);//producer

let obs2 = observable
                     .pipe(reduce((x,y)=> x+y)) ;
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