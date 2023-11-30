import { bindNodeCallback ,merge,concat} from "rxjs";
import * as fs from "fs";
const observableFactory = bindNodeCallback(fs.readFile);

const observable1 = observableFactory("data1.txt");
const observable2 = observableFactory("data2.txt");
const obs3 = merge(observable1,observable2);

let start:any = new Date();
const subscription = obs3.subscribe(
    (value) => {
        let end:any = new Date();
        let time = end - start;
        console.log("Time ",time);
        console.log(value.toString())
    }
);
